package com.wu.brwallet.customer.profile.model.common.ucd;

import lombok.Data;

import java.util.List;

@Data
public class ResponseStatus {
    private boolean status;
    private List<Error> errors;
}
