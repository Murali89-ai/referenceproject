package com.wu.brwallet.customer.profile.adaptor;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.builder.event.UCDBusinessEventBuilder;
import com.wu.brwallet.customer.profile.builder.request.UCDRequestBuilder;
import com.wu.brwallet.customer.profile.config.SecurityConfig;
import com.wu.brwallet.customer.profile.config.WUExceptionConfig;
import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.mapper.signon.UCDMapper;
import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.common.ucd.customerlookup.CustomerLookupRequest;
import com.wu.brwallet.customer.profile.model.common.ucd.customerlookup.CustomerLookupResponse;
import com.wu.brwallet.customer.profile.model.common.ucd.customerregistration.CustomerRegistrationRequest;
import com.wu.brwallet.customer.profile.model.common.ucd.customerregistration.CustomerRegistrationResponse;
import com.wu.brwallet.customer.profile.model.common.ucd.profilemanagement.AddOrUpdateProfileElementsResponse;
import com.wu.brwallet.customer.profile.model.request.customerRegister.CustomerRegisterRequest;
import com.wu.brwallet.customer.profile.model.request.registerDevice.RegisterDeviceRequest;
import com.wu.brwallet.customer.profile.model.request.updateDevice.UpdateDeviceRequest;
import com.wu.brwallet.customer.profile.model.response.registration.ErrorResponse;
import com.wu.brwallet.customer.profile.service.common.BusinessEventService;
import com.wu.era.library.auth.AuthException;
import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

import static com.wu.brwallet.customer.profile.constants.BusinessConstants.UCD_ERROR;
import static com.wu.brwallet.customer.profile.constants.BusinessConstants.UCD_UPDATE_DEVICE_UPSTREAM_SRV;

@Component
public class UCD {
    @Autowired
    private UCDMapper ucdMapper;

    @Autowired
    private SecurityConfig authConfiguration;

    @Value("${ucd.host}")
    private String UCD_HOST;

    @Value("${ucd.customer.lookup.path}")
    private String UCD_PATH;

    @Value("${ucdprofile.path}")
    private String ucdUpdatePath;

    @Value("${ucd.apikey}")
    private String UCD_API_KEY;

    @Value("${ucd.registration.api.url}")
    private String ucdApiUrl;

    @Autowired
    @Qualifier("defaultRestTemplate")
    private RestTemplate restTemplate;

    @Autowired
    private WUServiceExceptionUtils wuServiceExceptionUtils;

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private WUExceptionConfig exceptionConfig;

    @Autowired
    private UCDRequestBuilder ucdRequestBuilder;

    @Autowired
    private UCDBusinessEventBuilder ucdBusinessEventBuilder;

    @Autowired
    private BusinessEventService businessEventService;

    private static final Logger logger = LoggerFactory.getLogger(UCD.class);

    @LoggingAnnotation
    public CustomerLookupResponse getCustomerDetails(String umn, TransactionData incomingRequestDetails) throws AuthException, ExecutionException {

        if(umn.length()!=9){
            throw  exceptionConfig.prepareValidationError(new RuntimeException("CustomerUmn must be 9 characters"));
        }

        logger.info("CUS_PROFILE getCustomerByUmnFromUCD()-start umn={}", umn);
        CustomerLookupResponse response = null;

        try {
            CustomerLookupRequest ucdRequest = ucdMapper.mapUmn(umn);
            HttpHeaders headers = getHttpHeaders(incomingRequestDetails);

            mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
            mapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            var req = mapper.writeValueAsString(ucdRequest);
       //     logger.info("Customer lookup request {}", req);

            HttpEntity<String> requestEntity = new HttpEntity<>(req, headers);

            String responseString = restTemplate.postForObject(UCD_HOST + UCD_PATH, requestEntity, String.class);
            response = mapper.readValue(responseString, CustomerLookupResponse.class);
       //     logger.info("Customer lookup response {}", response);

        } catch (WUServiceException e) {
            throw e;
        } catch (Exception e) {
            logger.error("Exception in CustomerLookup {}", e.getMessage());
            throw exceptionConfig.prepareUcdError(e);
        }

        return response;
    }

    @LoggingAnnotation
    public void addOrUpdate(String umn, String accountKey, TransactionData incomingRequestDetails) throws AuthException, ExecutionException {
        logger.info(" addOrUpdate umn={}, accountkey={}", umn, accountKey);
        try {
            var addOrUpdateRequest = ucdMapper.mapAddOrUpdate(umn, accountKey);

            mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
            mapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            var req = mapper.writeValueAsString(addOrUpdateRequest);
        //    logger.info("Customer lookup request {}", req);

            HttpHeaders headers = getHttpHeaders(incomingRequestDetails);
            var requestEntity = new HttpEntity<>(req, headers);
            ResponseEntity<String> responseString = restTemplate.exchange(UCD_HOST + ucdUpdatePath, HttpMethod.PUT, requestEntity, String.class);
            AddOrUpdateProfileElementsResponse response = mapper.readValue(responseString.getBody(), AddOrUpdateProfileElementsResponse.class);
        //    logger.info("AddOrUpdate response {}", response);
        } catch (WUServiceException e) {
            throw e;
        } catch (Exception e) {
            logger.error("Exception in addOrUpdate {}", e.getMessage());
            throw exceptionConfig.prepareErrorCode(e, BusinessConstants.UCD_ADD_NONWALLET_UPSTREAM_SERVICE);
        }

    }

    @LoggingAnnotation
    public void addDevice(RegisterDeviceRequest request, String accountTypeId, OffsetDateTime resultDateTime, TransactionData incomingRequestDetails) {
        try {
            var addOrUpdateRequest = ucdMapper.mapAddDevice(request, accountTypeId, resultDateTime);

            mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
            mapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            var req = mapper.writeValueAsString(addOrUpdateRequest);

         //   logger.info("AddOrUpdateDevice request {}", req);
            HttpHeaders headers = getHttpHeaders(incomingRequestDetails);
            var requestEntity = new HttpEntity<>(req, headers);
            ResponseEntity<String> responseString = restTemplate.exchange(UCD_HOST + ucdUpdatePath, HttpMethod.PUT, requestEntity, String.class);

            AddOrUpdateProfileElementsResponse response = mapper.readValue(responseString.getBody(), AddOrUpdateProfileElementsResponse.class);

         //   logger.info("AddOrUpdate response {}", response);
        } catch (WUServiceException e) {
            throw e;
        } catch (Exception e) {
            logger.error("Exception in addDevice{}", e.getMessage());
            throw exceptionConfig.prepareErrorCode(e, BusinessConstants.UCD_ADD_DEVICE_UPSTREAM_SERVICE);
        }

    }

    public void updateDevice(UpdateDeviceRequest updateDeviceRequest, TransactionData incomingRequestDetails) {

        try {
            var addOrUpdateRequest = ucdMapper.mapUpdateDevice(updateDeviceRequest);

            mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
            mapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            var req = mapper.writeValueAsString(addOrUpdateRequest);

      //      logger.info("AddOrUpdateDevice request {}", req);
            HttpHeaders headers = getHttpHeaders(incomingRequestDetails);
            var requestEntity = new HttpEntity<>(req, headers);
            ResponseEntity<String> responseString = restTemplate.exchange(UCD_HOST + ucdUpdatePath, HttpMethod.PUT, requestEntity, String.class);

            AddOrUpdateProfileElementsResponse response = mapper.readValue(responseString.getBody(), AddOrUpdateProfileElementsResponse.class);

         //   logger.info("AddOrUpdate response {}", response);
        } catch (WUServiceException e) {
            throw e;
        } catch (Exception e) {
            logger.error("Exception in updateDevice {}", e.getMessage());
            throw exceptionConfig.prepareUcdError(e);
        }
    }

    @LoggingAnnotation
    public CustomerRegistrationResponse callUcdRegistration(CustomerRegisterRequest customerRegistrationRequest, TransactionData transactionData) {
        CustomerRegistrationResponse ucdResponse = null;
        try {
            CustomerRegistrationRequest ucdRequest = ucdRequestBuilder.buildUcdRequest(customerRegistrationRequest);
         //   logger.info("UcdRegistrationService.callUcdRegistration request {}", ucdRequest);

            HttpHeaders headers = getHttpHeaders(transactionData);

            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            mapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            var req = mapper.writeValueAsString(ucdRequest);
            HttpEntity<String> entity = new HttpEntity<>(req, headers);
            ucdResponse = restTemplate.postForObject(ucdApiUrl, entity, CustomerRegistrationResponse.class);

            logger.info("UcdRegistrationService.callUcdRegistration Api response {}", ucdResponse);
            if (Optional.ofNullable(ucdResponse.getResponseStatus()).isEmpty()
                    || (Optional.ofNullable(ucdResponse.getResponseStatus().getErrors()).isPresent()
                    && (Optional.ofNullable(ucdResponse.getResponseStatus().getErrors().get(0).getStatusCode()).isEmpty()
                    ||!AppConstants.IS_USER_EXIST_IN_UCD.equalsIgnoreCase(ucdResponse.getResponseStatus().getErrors().get(0).getDescription())))) {
                throw wuServiceExceptionUtils.prepareWuException(BusinessConstants.UCD_ERROR, new RuntimeException(BusinessConstants.UCD_REGISTER_UPSTREAM_NAME), WUExceptionType.SERVER, new String[]{AppConstants.IS_USER_EXIST_IN_UCD});
            }


        } catch (WUServiceException wuEx) {
            throw wuEx;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                if (e.getMessage().contains("400")) {
                    String errorResponse = mapper.writeValueAsString(mapper.readValue(e.getMessage().substring(18), new TypeReference<ErrorResponse>() {
                    }));

                    Map<String, String> issuesMap = new HashMap<>();

                    issuesMap.put("UCD error stack trace", errorResponse);
                    throw wuServiceExceptionUtils.prepareWuException(UCD_ERROR, new RuntimeException(BusinessConstants.UCD_REGISTER_UPSTREAM_NAME), WUExceptionType.BUSINESS, issuesMap);
                }

            } catch (JsonProcessingException ex) {
                throw new RuntimeException(ex);
            }
            logger.error("Exception occured in Orchestration flow {}", e.getMessage());

            //throw exceptionConfig.prepareErrorCode(e, BusinessConstants.UCD_REGISTER_UPSTREAM_NAME);
            throw wuServiceExceptionUtils.prepareWuException(UCD_ERROR, new RuntimeException(BusinessConstants.UCD_REGISTER_UPSTREAM_NAME), WUExceptionType.BUSINESS);

        }

    //    logger.debug("UcdRegistrationService.callUcdRegistration response {}", ucdResponse);
        BusinessEventData ucdBusinessEvent = ucdBusinessEventBuilder.buildAbmtBusinessEvent(customerRegistrationRequest, ucdResponse);
        businessEventService.sendEvent(BusinessConstants.REGISTER_BUSINESS_EVENT_CODE, ucdBusinessEvent, transactionData);
        return ucdResponse;
    }



    HttpHeaders getHttpHeaders(TransactionData incomingRequestDetails) {
        var httpHeaders = new HttpHeaders();
        String jwtToken = authConfiguration.generateToken();
        httpHeaders.set("x-api-key", UCD_API_KEY);
        httpHeaders.set("Accept", AppConstants.UCD_ACCEPT);
        httpHeaders.set("Authorization", jwtToken);
        httpHeaders.set("x-wu-externalRefId", incomingRequestDetails.getExternalRefId());
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        return httpHeaders;

    }


}