package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.sender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {
    private String id;
    private String paymentInstrumentId;
    private String bankName;
    private String accountNumber;
    private String routingNumber;
    private String accountType;
    private String bankCode;
    private String currency;
    private String currencyIsoCode;
    private String code;
    private String industry;
    private String companyName;
    private String accountNo;
    private String reasonForSending;
    private BankAccountHolder bankAccountHolder;
}

