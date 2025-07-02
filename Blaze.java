package com.wu.brwallet.customer.profile.adaptor;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.builder.event.BlazeBusinessEventBuilder;
import com.wu.brwallet.customer.profile.builder.request.BlazeRequestBuilder;
import com.wu.brwallet.customer.profile.config.WUExceptionConfig;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.model.common.blaze.BlazeRequest;
import com.wu.brwallet.customer.profile.model.common.blaze.BlazeResponse;
import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.common.ucd.customerregistration.CustomerRegistrationResponse;
import com.wu.brwallet.customer.profile.model.request.customerRegister.CustomerRegisterRequest;
import com.wu.brwallet.customer.profile.service.common.BusinessEventService;
import com.wu.brwallet.customer.profile.util.RetryTemplateUtil;
import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;


@Component
@Slf4j
public class Blaze {

    Logger logger = LoggerFactory.getLogger(Blaze.class);

    @Autowired
    private RetryTemplateUtil retryTemplateUtil;
    @Autowired
    private BlazeRequestBuilder blazeRequestBuilder;
    @Value("${blaze.api.url}")
    private String blazeUrl;
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    @Qualifier("defaultRestTemplate")
    private RestTemplate restTemplate;

    @Autowired
    private WUServiceExceptionUtils exceptionUtils;

    @Autowired
    private WUExceptionConfig exceptionConfig;
    @Autowired
    private WUServiceExceptionUtils wuServiceExceptionUtils;

    @Autowired
    private BlazeBusinessEventBuilder blazeBusinessEventBuilder;

    @Autowired
    private BusinessEventService businessEventService;

    @LoggingAnnotation
    public <T, R> T sendPostRequest(String BASE_URL, R requestBody, TransactionData incomingRequestDetails, Class<T> responseType,String upStreamName) {
        try {
            HttpHeaders headers = getHttpHeaders(incomingRequestDetails);
            HttpEntity<R> requestEntity = new HttpEntity<>(requestBody, headers);
         //   logger.info("Sending request to Blaze with request body: {}", requestBody);
            T response = retryTemplateUtil.doWithRetry(restTemplate, BASE_URL, requestEntity, responseType);
         //   logger.info("Received response from Blaze: {}", response);
            return response;
        } catch (Exception e) {
            logger.error("Exception occured in Orchestration flow to retrieve activity: {}", e.getMessage());
            throw exceptionConfig.prepareErrorCode(e,upStreamName);
        }
    }

    private HttpHeaders getHttpHeaders(TransactionData incomingRequestDetails) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-wu-externalRefId", incomingRequestDetails.getExternalRefId());
        headers.set("Accept", "application/json");
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-wu-correlationId", incomingRequestDetails.getCorrelationId());
        return headers;
    }

    @LoggingAnnotation
    public BlazeResponse callBlazeRiskDecision(CustomerRegisterRequest registrationRequest, CustomerRegistrationResponse ucdRegistrationResponse, TransactionData transactionData) {

        BlazeResponse blazeResponseEntity = null;

        BlazeRequest blazeRequestFromBuilder = blazeRequestBuilder.buildBlazeLogonInitRequest(registrationRequest.getSessionId(), ucdRegistrationResponse.getCustomerUmn(),
                registrationRequest.getEndUserIp(), registrationRequest.getLoginAuthType(), registrationRequest.getAppVersion(), registrationRequest.getBlackBoxData(), registrationRequest.getDeviceDetails());
        //logger.info("BlazeLogonnRiskInitService.callBlazeRiskDecision request {}",blazeRequestFromBuilder);
        try {
            String blazeRequest= objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).writerWithDefaultPrettyPrinter().writeValueAsString(blazeRequestFromBuilder);
            String blazeResponsePayload = restTemplate.postForObject(blazeUrl,blazeRequest, String.class);
          //  logger.info("BlazeLogonnRiskInitService.callBlazeRiskDecision response {}",blazeResponsePayload);
            blazeResponseEntity = objectMapper.readValue(blazeResponsePayload, new TypeReference<BlazeResponse>() {
            });
            if(!Objects.equals(blazeResponseEntity.getRiskMessageEnvelope().getData().getResponseCode(), "000000")){
                logger.error("Error occured in BlazeLogonnRiskInitService.callBlazeRiskDecision");
                throw wuServiceExceptionUtils.prepareWuException(BusinessConstants.APP_BLAZE_ERROR,new RuntimeException(), WUExceptionType.SERVER);
            }
            BusinessEventData blazeBusinessEvent = blazeBusinessEventBuilder.buildBLazeBusinessEvent(registrationRequest, ucdRegistrationResponse);
            businessEventService.sendEvent(BusinessConstants.REGISTER_BUSINESS_EVENT_CODE,blazeBusinessEvent,transactionData);
        }
        catch (WUServiceException e){
            throw e;
        }
        catch (Exception e) {
            logger.error("Error occured in BlazeLogonnRiskInitService.callBlazeRiskDecision {}",e.getMessage());
            throw exceptionConfig.prepareErrorCode(e,BusinessConstants.BLAZE_LOGON_RISK_SERVICE_NAME);
        }
        return blazeResponseEntity;
    }

}


