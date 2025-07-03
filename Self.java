package com.wu.brwallet.customer.profile.model.response.ping.get;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Self {
    private String href;
}


