package com.wu.brwallet.customer.profile.model.response.ping.create;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PingCreateResponse {

    @JsonProperty("_links")
    private Links links;

    private List<String> objectClass;

    @JsonProperty("emailJSON")
    private List<Email> emailJson;

    private String accountStatus;
    private String locale;
    private String umn;

    @JsonProperty("pwpAccountStateJSON")
    private String pwpAccountState;

    @JsonProperty("_dn")
    private String dn;

}
