package com.wu.brwallet.customer.profile.model.request.signon.customer;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignOnRequest {
    @NotNull
    private String sessionId;
    @NotNull
    private String customerUmn;
    @NotNull
    private String endUserIp;
    private String clientIp;
    @NotNull
    private String loginAuthType;
    @NotNull
    private String appVersion;
    @NotNull
    private String blackBoxData;
    private String logonUserId;
    private String logonUserIdType;
    private String deviceDetails;
    private String authenticationKey;
    private String referenceNo;
}

