package com.wu.brwallet.customer.profile.model.request.ping.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Modifications {


    private String attributeName;
    private String modificationType;
    private String values;
}
