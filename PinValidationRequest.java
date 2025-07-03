package com.wu.brwallet.customer.profile.model.request.validatepin;

import lombok.Data;

@Data
public class PinValidationRequest {
    private String pin;
    private String customerUmn;
    private String cardId;
}
