package com.wu.brwallet.customer.profile.model.response.notification;

import lombok.Data;

@Data
public class CustomerNotificationResponse {
    private String customerPreferences;
    private SfmcResponse sfmcResponse;
}
