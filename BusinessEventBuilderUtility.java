package com.wu.brwallet.customer.profile.util;

import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.request.changepin.ChangePinRequest;
import org.springframework.stereotype.Component;

@Component
public class BusinessEventBuilderUtility {

    public BusinessEventData buildMambuChangePinBusinessEvent(ChangePinRequest changePinRequest) {
        return BusinessEventData.builder()
                .targetSystem(BusinessConstants.MAMBU_CHANGE_PIN_BUSINESSEVENT_SYSTEM)
                .sourceSystem(BusinessConstants.MAMBU_CHANGE_PIN_BUSINESSEVENT_SOURCE)
                .eventStage(BusinessConstants.MAMBU_CHANGE_PIN_BUSINESSEVENT_EVENTSTAGE)
                .description(BusinessConstants.MAMBU_CHANGE_PIN_BUSINESSEVENT_DESCRIPTION)
                .processName(BusinessConstants.PROCESSNAME)
                .flowName(BusinessConstants.MAMBU_CHANGE_PIN_BUSINESSEVENT_FLOWNAME)
                .customerUmn(changePinRequest.getCustomerUmn())
                .build();
    }

    public BusinessEventData buildBizCardDetailsBusinessEvent(ChangePinRequest changePinRequest,String customerUmn) {
        return BusinessEventData.builder()
                .targetSystem(BusinessConstants.BIZ_GET_CARD_DETAILS_BUSINESSEVENT_SYSTEM)
                .sourceSystem(BusinessConstants.BIZ_GET_CARD_DETAILS_BUSINESSEVENT_SOURCE)
                .eventStage(BusinessConstants.BIZ_GET_CARD_DETAILS_BUSINESSEVENT_EVENTSTAGE)
                .description(BusinessConstants.BIZ_GET_CARD_DETAILS_BUSINESSEVENT_DESCRIPTION)
                .processName(BusinessConstants.BIZ_GET_CARD_DETAILS_BUSINESSEVENT_FLOWNAME)
                .flowName(BusinessConstants.PROCESSNAME)
                .customerUmn(customerUmn)
                .build();
    }
    public BusinessEventData buildBizChangePinBusinessEvent(ChangePinRequest changePinRequest) {
        return BusinessEventData.builder()
                .targetSystem(BusinessConstants.BIZ_CHANGE_PIN_BUSINESSEVENT_SYSTEM)
                .sourceSystem(BusinessConstants.BIZ_CHANGE_PIN_BUSINESSEVENT_SOURCE)
                .eventStage(BusinessConstants.BIZ_CHANGE_PIN_BUSINESSEVENT_EVENTSTAGE)
                .description(BusinessConstants.BIZ_CHANGE_PIN_BUSINESSEVENT_DESCRIPTION)
                .processName(BusinessConstants.BIZ_GET_CARD_DETAILS_BUSINESSEVENT_FLOWNAME)
                .flowName(BusinessConstants.PROCESSNAME)
                .customerUmn(changePinRequest.getCustomerUmn())
                .build();
    }

    public BusinessEventData buildCustomerNotificationBusinessEvent() {
        return BusinessEventData.builder()
                .targetSystem(BusinessConstants.CUSTOMER_NOTIFICATION_BUSINESSEVENT_SYSTEM)
                .sourceSystem(BusinessConstants.CUSTOMER_NOTIFICATION_BUSINESSEVENT_SOURCE)
                .eventStage(BusinessConstants.CUSTOMER_NOTIFICATION_BUSINESSEVENT_EVENTSTAGE)
                .description(BusinessConstants.CUSTOMER_NOTIFICATION_BUSINESSEVENT_DESCRIPTION)
                .flowName(BusinessConstants.PROCESSNAME)
                .processName(BusinessConstants.CUSTOMER_NOTIFICATION_BUSINESSEVENT_FLOWNAME)
                .countryCode(BusinessConstants.BRAZIL_COUNTRYCODE)
                .build();
    }

}
