package com.wu.brwallet.customer.profile.model.response.registration;

import lombok.Data;

import java.lang.Error;
import java.util.List;

@Data
public class CustomerRegisterResponse {
    private boolean success;
    private int httpStatus;
    private String message;
    private String externalRefId;
    private AdditionalFields additionalFields;
    private List<Error> errors;
}

