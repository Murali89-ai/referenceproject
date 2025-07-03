package com.wu.brwallet.customer.profile.model.response.signon;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.wu.brwallet.customer.profile.model.common.blaze.BlazeResponse;
import com.wu.brwallet.customer.profile.model.common.ucd.customerlookup.CustomerLookupResponse;
import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SignOnResponse {
    private CustomerLookupResponse customerProfile;
    private BlazeResponse verificationStatus;
    private Boolean pinIsSet;
    private String lastPinUpdatedDate;

    @JsonProperty("template_id")
    private String templateId;

    @JsonProperty("version")
    private String templateVersion;
    private ObjectNode transactions;
}
