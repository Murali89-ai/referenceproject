package com.wu.brwallet.customer.profile.service.registration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.wu.brwallet.customer.profile.adaptor.Blaze;
import com.wu.brwallet.customer.profile.adaptor.CustomerNotification;
import com.wu.brwallet.customer.profile.adaptor.Ping;
import com.wu.brwallet.customer.profile.adaptor.UCD;
import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.builder.event.UCDBusinessEventBuilder;
import com.wu.brwallet.customer.profile.builder.response.RegistrationResponseBuilder;
import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.common.ucd.customerregistration.CustomerRegistrationResponse;
import com.wu.brwallet.customer.profile.model.request.customerRegister.CustomerRegisterRequest;
import com.wu.brwallet.customer.profile.model.response.ping.PingResponse;
import com.wu.brwallet.customer.profile.model.response.registration.CustomerRegisterResponse;
import com.wu.brwallet.customer.profile.service.common.BusinessEventService;
import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerRegistrationService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerRegistrationService.class);

    @Autowired
    private UCD ucd;

    @Autowired
    private Ping ping;

    @Autowired
    private Blaze blaze;

    @Autowired
    private CustomerNotification customerNotification;

    @Autowired
    private RegistrationResponseBuilder registrationResponseBuilder;

    @Autowired
    private BusinessEventService businessEventService;

    @Autowired
    private UCDBusinessEventBuilder ucdBusinessEventBuilder;

    @Autowired
    private WUServiceExceptionUtils wuServiceExceptionUtils;

    @LoggingAnnotation
    public CustomerRegisterResponse registerCustomer(CustomerRegisterRequest registrationRequest, TransactionData transactionData) throws JsonProcessingException {
        logger.debug("CustomerRegistrationService.registerCustomer request {}", registrationRequest);

        try {
            checkSessionIdIsPresent(registrationRequest);
        }
        catch (WUServiceException wu){
            throw wu;
        }

        // UCD Registration
        CustomerRegistrationResponse ucdResponse = ucd.callUcdRegistration(registrationRequest, transactionData);


        PingResponse pingResponse = null;
        if (registrationRequest != null && ucdResponse != null) {

               //PING Service call
            pingResponse = ping.createOrUpdateUser(registrationRequest, ucdResponse,transactionData);

            //BLaze Service call
            blaze.callBlazeRiskDecision(registrationRequest, ucdResponse,transactionData);

            if (registrationRequest.getAccountTypeId().equals(AppConstants.NON_WALLET_ACCOUNT_TYPE_ID)) {

                customerNotification.callCustomerNotificationService(registrationRequest, ucdResponse, transactionData);

            }
        }
        CustomerRegisterResponse registrationResponse = registrationResponseBuilder.customerRegistartionResponseBuilder(registrationRequest, ucdResponse, pingResponse,transactionData);
        logger.debug("CustomerRegistrationService.registerCustomer response {}", registrationResponse);


        return registrationResponse;
    }

    private void checkSessionIdIsPresent(CustomerRegisterRequest registrationRequest) {

        if(registrationRequest.getSessionId()!=null && registrationRequest.getSessionId().isEmpty() || registrationRequest.getSessionId().isBlank()){
            throw wuServiceExceptionUtils.prepareWuException(BusinessConstants.APP_BLAZE_ERROR,new RuntimeException(), WUExceptionType.SERVER);
        }

    }
}