package com.wu.brwallet.customer.profile.model.response.ping.create;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Email {
    private String type;
    private String value;
    private boolean verified;
}
