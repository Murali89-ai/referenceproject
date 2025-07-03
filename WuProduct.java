package com.wu.brwallet.customer.profile.model.request.initcusverify.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WuProduct {
    private String name;
    private String code;
    private String type;
    private String routingCode;
    private String speedIndicator;
    private String isDirected;
    private String description;
    private String provider;
    private String minDeliveryDays;
    private String location;
 }

