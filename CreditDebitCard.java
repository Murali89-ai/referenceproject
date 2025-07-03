package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.payment;

import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.sender.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditDebitCard {
    private String cardNumber;
    private String cardType;
    private String expirationDate;
    private String cvviiCode;
    private String isCreditCardScanned;
    private String cardConsentFlag;
    private String cardConsentMtcn;
    private CardinalInfo cardinalInfo;
    private String bin;
    private String doZda;
    private String paymentInstrumentId;
    private Address address;
    private CardHolder customerNammeeObject;

}
