package com.wu.brwallet.customer.profile.adaptor;

import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.config.ConnectorSecurityConfig;
import com.wu.brwallet.customer.profile.config.RestTemplateConfig;
import com.wu.brwallet.customer.profile.config.WUExceptionConfig;
import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.mapper.common.ErrorResponseMapper;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.common.mambu.MambuChangePinRequest;
import com.wu.brwallet.customer.profile.model.request.changepin.ChangePinRequest;
import com.wu.brwallet.customer.profile.model.response.changepin.ChangePinResponse;
import com.wu.brwallet.customer.profile.model.response.validatepin.MambuClientResponse;
import com.wu.brwallet.customer.profile.service.validatepin.EncryptionService;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.SocketTimeoutException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Component
public class Mambu {
    private static final Logger log = LogManager.getLogger(Mambu.class);

    @Value("${mambu.getClient.path}")
    private String mambuClientPath;

    @Value("${mambu.host}")
    private String mambuHost;

    @Value("${mambu.changePin.path}")
    private String mambuChangePinPath;

    @Autowired(required = false)
    private ConnectorSecurityConfig connectorSecurityConfig;

    @Autowired
    @Qualifier("defaultRestTemplate")
    private RestTemplate restTemplate;

    @Autowired
    RestTemplateConfig restTemplateConfig;

    @Autowired
    EncryptionService encryptionService;

    @Autowired
    private WUExceptionConfig exceptionConfig;


    @Retryable(maxAttempts = 3, backoff = @Backoff(delay = 500, multiplier = 2), retryFor = {ResourceAccessException.class, HttpServerErrorException.class, HttpClientErrorException.class, RestClientException.class, SocketTimeoutException.class })
    @LoggingAnnotation
    public MambuClientResponse getClientDetails(String customerUmn, TransactionData transactionData) {

        HttpHeaders mambuHeaders = mapMambuHeaders(transactionData);

        Map<String, Object> filterCriteria = new HashMap<>();
        filterCriteria.put("field", AppConstants.MAMBU_FILTER_CRITERIA_FIELD);
        filterCriteria.put("operator", AppConstants.MAMBU_FILTER_CRITERIA_OPERATOR);
        filterCriteria.put("value", customerUmn);

        Map<String, Object> requestBody = new HashMap<>();

        requestBody.put("filterCriteria", Collections.singletonList(filterCriteria));

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(mambuHost + mambuClientPath)
                .queryParam("detailsLevel", AppConstants.MAMBU_URI_QUERY_PARAM_DETAILS_LEVEL)
                .queryParam("offset", AppConstants.MAMBU_URI_QUERY_PARAM_OFFSET)
                .queryParam("limit", AppConstants.MAMBU_URI_QUERY_PARAM_LIMIT);

        HttpEntity<Map<String, Object>> request = new HttpEntity<>(requestBody, mambuHeaders);
        //log.info("Mambu Request: {}", request);
      //  log.info("Mambu Request URI: {}", builder.toUriString());

        try{
            ResponseEntity<List<MambuClientResponse.ClientDetails>> response = restTemplate.exchange(
                    builder.toUriString(),
                    HttpMethod.POST,
                    request,
                    new ParameterizedTypeReference<>() {}
            );

            MambuClientResponse mambuClientResponse = new MambuClientResponse();
            mambuClientResponse.setPayload(response.getBody());
        //    log.info("Mambu Response: {}", mambuClientResponse);
            return mambuClientResponse;

        }catch (WUServiceException wuEx) {
            throw wuEx;
        }catch (Exception e) {
            log.error("Exception occured in Orchestration flow {}", e.getMessage());
            throw exceptionConfig.prepareErrorCode(e,BusinessConstants.MAMBU_UPSTREAM_SERVICE);
        }
    }
    @Retryable(maxAttempts = 3, backoff = @Backoff(delay = 500, multiplier = 2), retryFor = {ResourceAccessException.class, HttpServerErrorException.class, HttpClientErrorException.class, RestClientException.class, SocketTimeoutException.class })
    @LoggingAnnotation
    public ChangePinResponse mambuPinUpdate(ChangePinRequest changePinRequest, TransactionData transactionData, String getClientDetailsId) {

   //     log.info("Started :: flow to update pin in mambu :: CorrelationId: "+transactionData.getCorrelationId()+"---------");
        String encryptedPin = encryptionService.encryption(changePinRequest.getPin());

        String DATE_FORMAT = "yyyy-MM-dd'T'hh:mm:ss.SSSxxx";
        ZoneId SAO_PAULO_ZONE = ZoneId.of("America/Sao_Paulo");

        String formattedDateTime = ZonedDateTime.now(SAO_PAULO_ZONE)
                .format(DateTimeFormatter.ofPattern(DATE_FORMAT));

        // Create the PIN update request
        MambuChangePinRequest pinRequest = MambuChangePinRequest.builder()
                .op("ADD")
                .path("/_profile/customerPin")
                .value(encryptedPin)
                .build();

        // Create the timestamp update request
        MambuChangePinRequest timestampRequest = MambuChangePinRequest.builder()
                .op("ADD")
                .path("/_profile/lastPinUpdatedDate")
                .value(formattedDateTime)
                .build();

        List<MambuChangePinRequest> mambuChangePinRequests = Arrays.asList(pinRequest, timestampRequest);
        HttpHeaders mambuHeaders = mapMambuHeaders(transactionData);

        HttpEntity<List<MambuChangePinRequest>> changePinRequests = new HttpEntity<>(mambuChangePinRequests, mambuHeaders);
    //    log.info("Mambu Change Pin Request: {}", changePinRequests);

        try{
            ResponseEntity<String> response = executePatchRequest(
                    mambuHost + mambuChangePinPath + getClientDetailsId,
                    changePinRequests,
                    String.class);

            if (response.getStatusCode().is2xxSuccessful()) {
                // Handle successful response (2xx status code)
                log.info("Request was successful with status: {}", response.getStatusCode());
                return ChangePinResponse.builder()
                        .success(true)
                        .httpStatus(200)
                        .message("PIN changed successfully")
                        .correlationId(transactionData.getCorrelationId())
                        .externalRefId(transactionData.getExternalRefId())
                        .errors(Arrays.asList())
                        .build();
            } else {
                // Handle non-2xx response
                log.error("Request failed with status: {}", response.getStatusCode());
                return ChangePinResponse.builder()
                        .success(false)
                        .httpStatus(Integer.valueOf(response.getStatusCode().toString()))
                        .message("Change pin Failed")
                        .correlationId(transactionData.getCorrelationId())
                        .externalRefId(transactionData.getExternalRefId())
                        .additionalFields(Arrays.asList())
                        .errors(List.of(ChangePinResponse.Errors.builder()
                                        .errorCode(BusinessConstants.INVALID_PIN)
                                        .errorType("CLIENT_NOT_FOUND")
                                        .errorMessage(AppConstants.PIN_CHANGE_INVALID_DATA_PROVIDED)
                                        .stackTrace("Unable to change pin")
                                .build()))
                        .build();
            }

    } catch (WUServiceException e) {
        throw  e;
    } catch (Exception e) {
            log.error("Exception occured in mambu change pin {}", e.getMessage());
        throw exceptionConfig.prepareErrorCode(e,BusinessConstants.UPSTREAM_MAMBU_CHANGE_PIN_SERVICE_NAME);
    }
    }
    private HttpHeaders mapMambuHeaders(TransactionData transactionData) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", AppConstants.MAMBU_HEADER_ACCEPT);
        headers.set("Content-Type", "application/json");
        headers.set("x-wu-externalRefId", transactionData.getExternalRefId());
        headers.set("x-wu-serviceid", AppConstants.MAMBU_SERVICEID);
        if(restTemplateConfig.isLocalEnv()){
            headers.set("x-api-key", connectorSecurityConfig.getConnectorXApiKey());
            headers.set("Authorization",connectorSecurityConfig.generateConnectorToken());
        }

        return headers;
    }

    private <T> ResponseEntity<T> executePatchRequest(String url, HttpEntity<?> requestEntity, Class<T> responseType) {
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        RestTemplate patchEnabledRestTemplate = new RestTemplate(requestFactory);

        // Copy any customizations from your main RestTemplate if needed
        patchEnabledRestTemplate.setInterceptors(restTemplate.getInterceptors());
        patchEnabledRestTemplate.setErrorHandler(restTemplate.getErrorHandler());

        return restTemplate.exchange(url, HttpMethod.PATCH, requestEntity, responseType);
    }
}
