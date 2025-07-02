package com.wu.brwallet.customer.profile.adaptor;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.builder.event.NotificationBusinessEventBuilder;
import com.wu.brwallet.customer.profile.builder.request.CustomerNotificationRequestBuilder;
import com.wu.brwallet.customer.profile.config.ConnectorSecurityConfig;
import com.wu.brwallet.customer.profile.config.RestTemplateConfig;
import com.wu.brwallet.customer.profile.config.SecurityConfig;
import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.common.ucd.customerregistration.CustomerRegistrationResponse;
import com.wu.brwallet.customer.profile.model.request.customerRegister.CustomerRegisterRequest;
import com.wu.brwallet.customer.profile.model.response.notification.CustomerNotificationResponse;
import com.wu.brwallet.customer.profile.service.common.BusinessEventService;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerNotification {
    private static final Logger logger = LogManager.getLogger(CustomerNotification.class);

    @Autowired
    private CustomerNotificationRequestBuilder customerNotificationRequestBuilder;

    @Value("${cusnotify.url}")
    private String cusNotfyUrl;

    @Autowired
    private SecurityConfig oauthService;

    @Autowired
    @Qualifier("defaultRestTemplate")
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private RestTemplateConfig restTemplateConfig;

    @Autowired
    private BusinessEventService businessEventService;

    @Autowired
    private NotificationBusinessEventBuilder notificationBusinessEventBuilder;

    @Autowired(required = false)
    private ConnectorSecurityConfig connectorSecurityConfig;


    @Async
    @LoggingAnnotation
    public void callCustomerNotificationService(CustomerRegisterRequest registrationRequest, CustomerRegistrationResponse ucdResponse, TransactionData transactionData) {

        com.wu.brwallet.customer.profile.model.request.notification.CustomerNotification customerNotification = customerNotificationRequestBuilder.buildCustomerNotificationRequest(ucdResponse.getCustomerUmn());
        HttpHeaders headers = getHeaders(transactionData);
        HttpEntity<com.wu.brwallet.customer.profile.model.request.notification.CustomerNotification> customerNotificationEntity = new HttpEntity(customerNotification, headers);

        //logger.info("CustomerNotification.callCustomerNotificationService api request {}",customerNotification);

        try {
            String custNotifyresp = restTemplate.postForObject(cusNotfyUrl, customerNotificationEntity, String.class);
          //  logger.info("custNotifyresp::{}",custNotifyresp);
            CustomerNotificationResponse customerNotifyResponse = objectMapper.readValue(custNotifyresp, new TypeReference<CustomerNotificationResponse>() {
            });

          //  logger.info("CustomerNotification.callCustomerNotificationService api response {}",custNotifyresp);

            BusinessEventData custometNotifybusiness= notificationBusinessEventBuilder.buildCustomerNotificationBusinessEvent(registrationRequest, ucdResponse);
            businessEventService.sendEvent(BusinessConstants.REGISTER_BUSINESS_EVENT_CODE, custometNotifybusiness, transactionData);
        } catch (Exception e) {
            logger.error("error occured in CustomerNotification.callCustomerNotificationService {}",e.getMessage());

        }
    }

    @Async
    @LoggingAnnotation
    public void customerNotificationCall(String customerUmn, TransactionData transactionData) {

        com.wu.brwallet.customer.profile.model.request.notification.CustomerNotification customerNotification = customerNotificationRequestBuilder.buildCustomerNotificationRequest(customerUmn);
        HttpHeaders headers = getHeaders(transactionData);
        HttpEntity<CustomerNotification> customerNotificationEntity = new HttpEntity(customerNotification, headers);

      //  logger.info("CustomerNotificationService.callCustomerNotificationService api request {}",customerNotification);

        try {
            CustomerNotificationResponse customerNotifyResponse = restTemplate.postForObject(cusNotfyUrl, customerNotificationEntity, CustomerNotificationResponse.class);
       //     logger.info("custNotifyresp::{}",customerNotifyResponse);


       //     logger.info("CustomerNotificationService.callCustomerNotificationService api response {}",customerNotifyResponse);
        } catch (Exception e) {
            logger.error("error occured in CustomerNotificationService.callCustomerNotificationService {}",e.getMessage());

        }
    }
    public HttpHeaders getHeaders(TransactionData transactionData) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-wu-externalRefId", transactionData.getExternalRefId());
        headers.set("Accept", "application/json");
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-wu-serviceId", AppConstants.CUS_NOTIFY_SERVICEID);
        if (restTemplateConfig.isLocalEnv()){
            headers.set("x-api-key", connectorSecurityConfig.getConnectorXApiKey());
            headers.set("Authorization", connectorSecurityConfig.generateConnectorToken());
        }
        return headers;
    }

}
