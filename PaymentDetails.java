package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetails {
    private String moneyTransferType;
    private Origination origination;
    private Destination destination;
    private Promotion promotion;
    private Taxes taxes;
    private Fees fees;
    private String pricingContext;
    private PaymentMethod paymentMethod;
    private String complianceRegulations;
    private String displayExchangeRate;
    private String fullExchangeRate;
    private String fixOnSend;
    private String stagingBuffer;
    private String paymentDigest;
    private String exchangeRate;
    private String transactionType;
    private String totalUndiscountedCharges;
    private String totalDiscount;
    private String totalDiscountedCharges;
    private String fixedOnSend;
    private String combinedPds;
    private String digitalThresholdFlag;
    private String fxThresholdFlag;
    private String lockOnPrincipalAmount;
    private String cardUpdaterConsentFlag;
    private CreditDebitCard creditDebitCard;

}

