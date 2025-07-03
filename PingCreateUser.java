package com.wu.brwallet.customer.profile.model.request.ping.create;

import lombok.Data;

import java.util.List;
@Data
public class PingCreateUser {
    private List<String> objectClass;
    private List<EmailDetails> emailJSON;
    private String _parentDN;
    private String accountStatus;
    private String locale;
    private String umn;
}
