package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Promotion {
    private String name;
    private String description;
    private String discount;
    private String status;
    private String message;
}
