package com.wu.brwallet.customer.profile.model.request.notification;

import lombok.Data;

@Data
public class CustomerNotification {
    private String customerUmn;
    private String eventDefinitionKey;
    private OnboardingData data;
}
