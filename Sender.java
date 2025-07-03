package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.sender;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public  class Sender {
    private String email;
    private String efl;
    private String preferredLang;
    private String gender;
    private String nationality;
    private String occupation;
    private String paymentLink;
    private String complianceDataBuffer;
    private String country;
    private String dateOfBirth;
    private String countryOfBirth;
    private Name name;
    private Address address;
    private MobilePhone mobilePhone;
    private BankAccount bankAccount;
    private KycDetails kycDetails;
    private PreferredCustomer preferredCustomer;
    private ComplianceDetails complianceDetails;
    private IdDocumentsArray idDocumentsArray;

}