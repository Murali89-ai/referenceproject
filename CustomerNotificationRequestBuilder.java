package com.wu.brwallet.customer.profile.builder.request;

import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.model.request.notification.CustomerNotification;
import com.wu.brwallet.customer.profile.model.request.notification.OnboardingData;
import org.springframework.stereotype.Component;

@Component
public class CustomerNotificationRequestBuilder {

    public CustomerNotification buildCustomerNotificationRequest(String umn){
        CustomerNotification customerNotification=new CustomerNotification();
        customerNotification.setCustomerUmn(umn);
        OnboardingData onboardingData=new OnboardingData();
        onboardingData.setMessageKey(AppConstants.SFMC_MESSAGEKEY_NONWALLET_ONBOARDING);
        customerNotification.setData(onboardingData);
        customerNotification.setEventDefinitionKey(AppConstants.SFMC_EVENTDEFINATIONKEY_NONWALLET_ONBOARDING);
        return customerNotification;
    }
}
