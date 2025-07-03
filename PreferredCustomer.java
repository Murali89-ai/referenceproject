package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.sender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreferredCustomer {
    private String status;
    private String discount;
    private String operation;
    private String interests;
    private String update;
    private String promoCodes;
}
