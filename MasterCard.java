package com.wu.brwallet.customer.profile.model.common.blaze;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MasterCard {
    private String deviceDetails;
}
