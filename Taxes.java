package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.payment;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Taxes {
    private String municipalTax;
    private String stateTax;
    private String countyTax;
    private String vet;
    private String totalDisplayTaxAmount;
}
