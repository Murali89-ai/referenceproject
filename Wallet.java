package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.receiver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wallet {
    private String  accountNumber;
    private String serviceProviderName;
    private String serviceProviderCode;
    private String reasonForSending;

}
