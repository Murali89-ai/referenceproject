package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Origination {
    private String principalAmount;
    private String grossAmount;
    private String currencyIsoCode;
    private String countryIsoCode;
    private String principalAmountModified;
    private Efl efl;
}
