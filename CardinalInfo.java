package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardinalInfo {
    private String available;
    private String wu3dsVersion;
    private String cc3dsVersion;
    private String transactionMode;
    private String refId3ds;
    private CardinalParams cardinalParams;
}
