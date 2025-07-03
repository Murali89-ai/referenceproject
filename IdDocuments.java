package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.sender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdDocuments {

    private String type;
    private String data;
    private String issueDate;
    private String issuer;
    private String expirationDate;
    private String rta;
    private String birthplace;
    private String isPrimary;
 }
