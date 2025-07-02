package com.wu.brwallet.customer.profile.adaptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.config.ConnectorSecurityConfig;
import com.wu.brwallet.customer.profile.config.RestTemplateConfig;
import com.wu.brwallet.customer.profile.config.SecurityConfig;
import com.wu.brwallet.customer.profile.config.WUExceptionConfig;
import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.request.biz.BizChangePinRequest;
import com.wu.brwallet.customer.profile.model.response.biz.BizGetCardDetailsResponse;
import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.SocketTimeoutException;

@Component
public class Biz {
    private static final Logger log = LogManager.getLogger(Biz.class);

    @Autowired
    private SecurityConfig authConfiguration;

    @Autowired
    @Qualifier("defaultRestTemplate")
    private RestTemplate restTemplate;

    @Autowired
    private RestTemplateConfig restTemplateConfig;

    @Autowired
    private WUExceptionConfig exceptionConfig;

    @Autowired
    private ObjectMapper mapper;

    @Value("${biz.get.card.details.host}")
    private String BIZ_GET_CARD_DETAILS_HOST;

    @Value("${biz.get.card.details.path}")
    private String BIZ_GET_CARD_DETAILS_PATH;

    @Value("${pinChangeCard.path}")
    private String PIN_CHANGE_CARD_PATH;

    @Value("${biz.serviceId}")
    private String BIZ_SERVICE_ID;

    @Value("${biz.user.agent}")
    private String BIZ_USER_AGENT;

    @Value("${biz.ocp.apim.subscription.key}")
    private String BIZ_SUBSCRIPTION_KEY;

    @Autowired(required = false)
    private ConnectorSecurityConfig connectorSecurityConfig;

    @LoggingAnnotation
    @Retryable(maxAttempts = 3, backoff = @Backoff(delay = 500, multiplier = 2), retryFor = {ResourceAccessException.class, HttpServerErrorException.class, HttpClientErrorException.class, RestClientException.class, SocketTimeoutException.class })
    public BizGetCardDetailsResponse getCardDetails(String cpfNumber, TransactionData transactionData) {
        try{
            HttpHeaders headers = getHttpHeaders(transactionData);

            HttpMethod method = HttpMethod.valueOf(AppConstants.BIZ_GET_CARD_DETAILS_METHOD);

            HttpEntity<?> requestEntity = new HttpEntity<>(headers);

            String uriBuilder = UriComponentsBuilder
                    .fromUriString(BIZ_GET_CARD_DETAILS_HOST + BIZ_GET_CARD_DETAILS_PATH)
                    .queryParam("document", cpfNumber)
                    .queryParam("elements", AppConstants.PAGE_ELEMENTS
                    ).toUriString();

            BizGetCardDetailsResponse bizGetCardDetailsResponse = restTemplate.exchange(
                    uriBuilder,
                    method,
                    requestEntity,
                    BizGetCardDetailsResponse.class).getBody();

            //log.info("bizGetCardDetailsResponse :::: {}", bizGetCardDetailsResponse);
            return bizGetCardDetailsResponse;
        }catch (WUServiceException e) {
            throw e;
        }catch (Exception e) {
            log.error("Exception occured in biz card details {}", e.getMessage());
            throw exceptionConfig.prepareErrorCode(e,BusinessConstants.BIZ_GET_CARD_DETAILS_BUSINESSEVENT_FLOWNAME);
        }

    }

    @Retryable(maxAttempts = 3, backoff = @Backoff(delay = 500, multiplier = 2), retryFor = {ResourceAccessException.class, HttpServerErrorException.class, HttpClientErrorException.class, RestClientException.class, SocketTimeoutException.class })
    @LoggingAnnotation
    public String bizChangePin(BizChangePinRequest bizChangePinRequest, String cardId, TransactionData transactionData) {
        HttpHeaders headers = getHttpHeaders(transactionData);
        HttpMethod method = HttpMethod.valueOf(AppConstants.BIZ_CHANGE_PIN_METHOD);
        HttpEntity<BizChangePinRequest> requestEntity = new HttpEntity<>(headers);
        try{
            String response = restTemplate.exchange(
                    BIZ_GET_CARD_DETAILS_HOST+cardId+PIN_CHANGE_CARD_PATH,
                    method,
                    requestEntity,
                    String.class).getBody();

           // log.info("Biz Change Pin Response: {}", response);
            return response;
    } catch (WUServiceException e) {
        throw  e;
    } catch (Exception e) {
            log.error("Exception occured in biz change pin {}", e.getMessage());
        throw exceptionConfig.prepareErrorCode(e,BusinessConstants.BIZ_CHANGE_PIN_BUSINESSEVENT_FLOWNAME);
    }
    }

    HttpHeaders getHttpHeaders(TransactionData incomingRequestDetails)  {
        var httpHeaders = new HttpHeaders();
        if(restTemplateConfig.isLocalEnv()){
            httpHeaders.set("x-api-key", connectorSecurityConfig.getConnectorXApiKey());
            httpHeaders.set("Authorization",connectorSecurityConfig.generateConnectorToken());
        }
        httpHeaders.set("Accept", AppConstants.BIZ_ACCEPT);
        httpHeaders.set("x-wu-externalRefId",incomingRequestDetails.getExternalRefId());
        httpHeaders.set("x-wu-serviceid",BIZ_SERVICE_ID);
        httpHeaders.set("User-Agent",BIZ_USER_AGENT);
        httpHeaders.set("Ocp-Apim-Subscription-Key",BIZ_SUBSCRIPTION_KEY);
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        return httpHeaders;
    }

}

