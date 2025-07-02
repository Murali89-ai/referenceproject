package com.wu.brwallet.customer.profile.builder.event;

import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.common.ucd.customerregistration.CustomerRegistrationResponse;
import com.wu.brwallet.customer.profile.model.request.customerRegister.CustomerRegisterRequest;
import org.springframework.stereotype.Component;

@Component
public class PingBusinessEventBuilder {

    @LoggingAnnotation
    public BusinessEventData buildPingUpdateBusinessEvent(CustomerRegisterRequest registrationRequest, CustomerRegistrationResponse ucdRegistrationResponse) {
        BusinessEventData eventData = new BusinessEventData();
        eventData.setSourceSystem(BusinessConstants.PING_BUSINESS_EVENT_SOURCE_SYSTEM);
        eventData.setTargetSystem(BusinessConstants.PING_BUSINESS_EVENT_TARGET_SYSTEM);
        eventData.setProcessName(BusinessConstants.PING_BUSINESS_EVENT_PROCESSNAME);
        eventData.setFlowName(BusinessConstants.PING_UPDTAE_BUSINESS_EVENT_FLOWNAME);
        eventData.setEventStage(BusinessConstants.PING_UPDATE_BUSINESS_EVENT_STAGE);
        eventData.setCustomerUmn(ucdRegistrationResponse.getCustomerUmn());
        eventData.setDescription(BusinessConstants.PING_UPDATE_BUSINESS_EVENT_DESCRIPTION);
        eventData.setSessionId(registrationRequest.getSessionId());
        eventData.setCountryCode(registrationRequest.getAddress().getCountryCodeIso3());
        return eventData;
    }

    @LoggingAnnotation
    public BusinessEventData buildPingGetBusinessEvent(CustomerRegisterRequest registrationRequest, CustomerRegistrationResponse ucdRegistrationResponse) {
        BusinessEventData eventData = new BusinessEventData();
        eventData.setSourceSystem(BusinessConstants.PING_BUSINESS_EVENT_SOURCE_SYSTEM);
        eventData.setTargetSystem(BusinessConstants.PING_BUSINESS_EVENT_TARGET_SYSTEM);
        eventData.setProcessName(BusinessConstants.PING_BUSINESS_EVENT_PROCESSNAME);
        eventData.setFlowName(BusinessConstants.PING_GET_BUSINESS_EVENT_FLOWNAME);
        eventData.setEventStage(BusinessConstants.PING_GET_BUSINESS_EVENT_STAGE);
        eventData.setCustomerUmn(ucdRegistrationResponse.getCustomerUmn());
        eventData.setDescription(BusinessConstants.PING_GET_BUSINESS_EVENT_DESCRIPTION);
        eventData.setSessionId(registrationRequest.getSessionId());
        eventData.setCountryCode(registrationRequest.getAddress().getCountryCodeIso3());
        return eventData;
    }

    @LoggingAnnotation
    public BusinessEventData buildPingCreateBusinessEvent(CustomerRegisterRequest registrationRequest, CustomerRegistrationResponse ucdRegistrationResponse) {
        BusinessEventData eventData = new BusinessEventData();
        eventData.setSourceSystem(BusinessConstants.PING_BUSINESS_EVENT_SOURCE_SYSTEM);
        eventData.setTargetSystem(BusinessConstants.PING_BUSINESS_EVENT_TARGET_SYSTEM);
        eventData.setProcessName(BusinessConstants.PING_BUSINESS_EVENT_PROCESSNAME);
        eventData.setFlowName(BusinessConstants.PING_CREATE_BUSINESS_EVENT_FLOWNAME);
        eventData.setEventStage(BusinessConstants.PING_CREATE_BUSINESS_EVENT_STAGE);
        eventData.setCustomerUmn(ucdRegistrationResponse.getCustomerUmn());
        eventData.setDescription(BusinessConstants.PING_CREATE_BUSINESS_EVENT_DESCRIPTION);
        eventData.setSessionId(registrationRequest.getSessionId());
        eventData.setCountryCode(registrationRequest.getAddress().getCountryCodeIso3());
        return eventData;
    }
}
