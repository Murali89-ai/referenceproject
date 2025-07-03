package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.sender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String addrLine1;
    private String type;
    private String addrLine2;
    private String city;
    private String state;
    private String location;
    private String postalCode;
    private String countryIsoCode;
}


