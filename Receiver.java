package com.wu.brwallet.customer.profile.model.request.initcusverify.customer.receiver;


import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.sender.MobilePhone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public  class Receiver {
    private String id;
    private String type;
    private String uid;
    private String favorite;
    private String email;
    private String ssn;
    private String efl;
    private String preferredLang;
    private String gender;
    private String nationality;
    private String country;
    private String occupation;
    private Name name;
    private Address address;
    private MobilePhone mobilePhone;
    private Wallet wallet;
   // private String verificationStatus;
    private BankAccount bankAccount;
}