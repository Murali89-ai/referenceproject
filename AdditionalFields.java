package com.wu.brwallet.customer.profile.model.response.registration;

import lombok.Data;

@Data
public class AdditionalFields {
    private String customerUmn;
    private String userDn;
    private String pwpAccountStateJson;
    private String sessionId;
}

