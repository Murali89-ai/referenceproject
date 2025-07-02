package com.wu.brwallet.customer.profile.builder.event;

import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.common.ucd.customerregistration.CustomerRegistrationResponse;
import com.wu.brwallet.customer.profile.model.request.customerRegister.CustomerRegisterRequest;
import org.springframework.stereotype.Component;

@Component
public class NotificationBusinessEventBuilder {


    @LoggingAnnotation
    public BusinessEventData buildCustomerNotificationBusinessEvent(CustomerRegisterRequest registrationRequest, CustomerRegistrationResponse ucdRegistrationResponse) {
        BusinessEventData eventData = new BusinessEventData();
        eventData.setSourceSystem(BusinessConstants.CUS_NOTIFY_BUSINESS_EVENT_SOURCE_SYSTEM);
        eventData.setTargetSystem(BusinessConstants.CUS_NOTIFY_BUSINESS_EVENT_TARGET_SYSTEM);
        eventData.setProcessName(BusinessConstants.CUS_NOTIFY_BUSINESS_EVENT_PROCESSNAME);
        eventData.setFlowName(BusinessConstants.CUS_NOTIFY_BUSINESS_EVENT_FLOWNAME);
        eventData.setEventStage(BusinessConstants.CUS_NOTIFY_BUSINESS_EVENT_STAGE);
        eventData.setCustomerUmn(ucdRegistrationResponse.getCustomerUmn());
        eventData.setDescription(BusinessConstants.CUS_NOTIFY_BUSINESS_EVENT_DESCRIPTION);
        eventData.setSessionId(registrationRequest.getSessionId());
        eventData.setCountryCode(registrationRequest.getAddress().getCountryCodeIso3());
        return eventData;
    }
    
}
