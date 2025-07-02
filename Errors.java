package com.wu.brwallet.customer.profile.model.common.blaze;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Errors {
    private String errorCode;
    private String errorType;
    private String errorMessage;
    private String stackTrace;
}


