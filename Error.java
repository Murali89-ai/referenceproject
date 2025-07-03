package com.wu.brwallet.customer.profile.model.common.ucd;


import lombok.Data;

@Data
public class Error {
    private String statusCode;
    private String stringCode;
    private String description;
}

