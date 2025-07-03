package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.sender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComplianceDetails {
   private String transactionPurpose;
   private String flagPay;
}
