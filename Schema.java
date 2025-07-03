package com.wu.brwallet.customer.profile.model.response.ping.create;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Schema {
    private String href;
}
