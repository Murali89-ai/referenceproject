package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardinalParams {
    private String cardDigest;
    private String reasonCode;
}
