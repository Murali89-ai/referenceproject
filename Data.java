package com.wu.brwallet.customer.profile.model.common.blaze;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@Builder
public class Data {

    private String messageType;
    private String mtcn16;
    private String timeStamp;
    private String transactionTimeStamp;
    private String pcpNumber;
    private String sessionId;
    private String channel;
    private String channelVersion;
    private String platform;
    private String partnerID;
    private String callingEntity;
    private String paymentType;
    private String environment;
    private String myWUNumber;
    private String deliveryMedium;
    private String otpType;
    private String deviceAlias;
    private String country;
    private String profileSenderCountryCode;
    private String cscVerifiedIdFlag;
    private String transactionStatusRequiredFlag;
    private String achTransactionRequiredFlag;
    private String authenticationKey;
    private String ipAddress;
    private String loginAuthType;
    private String pcpCustomerNumber;
    private String billingSenderCountryCode;
    private String KycStatus;
    private String KycOperation;
    private String recentMtcnStatus;
    private String deviceStatusFlag;
    private String isEligibleToTransact;
    private String recentMtcnDate;
    private String customerStatus;
    private String excludedFundInOptions;
    private String cnpReplyBuffer;
    private String responseCode;
    private UniversalRequestProperties universalRequestProperties;
    private String exceptionCode;
    private String exceptionDetail;
    private RiskDecision riskDecision;
    private String traceId;
    private String decisioncomplete;
    private String transactionType;
    private String endUserIP;
    private String appVersion;
    private ExternalInformation externalInformation;
    private String logonUserID;
    private String logonUserIDType;
    private String partnerId;
}
