package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.sender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsDelivery {
   private String available;
    private String phoneNumber;
    private ContactPhoneCountryPrefix contactPhoneCountryPrefix;
}

