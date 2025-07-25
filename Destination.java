package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.payment;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Destination {
    private String expectedPayoutAmount;
    private String actualPayoutAmount;
    private String currencyIsoCode;
    private String countryIsoCode;
}