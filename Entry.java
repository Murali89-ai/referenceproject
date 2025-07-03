package com.wu.brwallet.customer.profile.model.response.ping.get;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Entry {
    private List<EmailJSON> emailJSON;
    private String accountStatus;
    private String locale;
    private String umn;
    private String pwpAccountStateJSON;
    private List<String> objectClass;
    private String _dn;
    private Links _links;
}
