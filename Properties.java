package com.wu.brwallet.customer.profile.model.common.blaze;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Properties {
    private String countryCode;
    private String mtcn16;
    private String transactionTimeStamp;
    private String operation;
    private String sessionId;
}
