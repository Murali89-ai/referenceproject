package com.wu.brwallet.customer.profile.model.request.ping.create;

import lombok.Data;

@Data
public class EmailDetails {
    private String type;
    private String value;
    private boolean verified;
}
