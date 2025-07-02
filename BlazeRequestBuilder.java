package com.wu.brwallet.customer.profile.builder.request;

import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.model.common.blaze.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Component
public class BlazeRequestBuilder {

    @Value("${blaze.environment}")
    private String blazeEnvironment;

    public BlazeRequest buildBlazeLogonInitRequest(String sessionId, String umn, String endUserIp, String loginAuthType, String appVersion, String blackBoxData, String deviceDetails) {
        BlazeRequest blazeRequest=new BlazeRequest();
        RiskMessageEnvelope riskMessageEnvelope = new RiskMessageEnvelope();
        //headers
        Headers headers=new Headers();
        headers.setSource(AppConstants.BlAZE_SOURCE);
        headers.setEventType(AppConstants.BlAZE_EVENT_TYPE);
        headers.setMessageId(UUID.randomUUID().toString());
        riskMessageEnvelope.setHeaders(headers);
        //properties
        Properties properties=new Properties();
        properties.setSessionId(sessionId);
        properties.setTransactionTimeStamp(getCurrentTimestampEST());
        properties.setOperation(AppConstants.BlAZE_OPERATION);
        riskMessageEnvelope.setProperties(properties);
        //data
        Data data=new Data();
        data.setEnvironment(blazeEnvironment);
        data.setMessageType(AppConstants.BlAZE_MESSAGE_TYPE);
        data.setTransactionType(AppConstants.BlAZE_TRANSACTION_TYPE);
        data.setChannelVersion(AppConstants.BlAZE_CHANNEL_VERSION);
        data.setSessionId(sessionId);
        data.setTimeStamp(getCurrentTimestampEST());
        data.setPlatform(AppConstants.BlAZE_CVSL_PLATFORM);
        data.setPartnerID(AppConstants.BlAZE_CVSL_PARTNERID);
        data.setPcpCustomerNumber(umn);
        data.setEndUserIP(endUserIp);
        data.setLoginAuthType(loginAuthType);
        data.setAppVersion(appVersion);
        ExternalInformation externalInformation=new ExternalInformation();
        Iovation iovation=new Iovation();
        iovation.setBlackBoxData(blackBoxData);
        externalInformation.setIovation(iovation);
        MasterCard masterCard=new MasterCard();
        masterCard.setDeviceDetails(deviceDetails);
        externalInformation.setMasterCard(masterCard);
        data.setExternalInformation(externalInformation);
        riskMessageEnvelope.setData(data);
        blazeRequest.setRiskMessageEnvelope(riskMessageEnvelope);
        return blazeRequest;
    }

    public BlazeRequest buildBlazeCvslRequest(String sessionId, String umn,  String loginAuthType,String countryCode, String authenticationKey, String clientIp, String idvStatus) {
        BlazeRequest blazeRequest=new BlazeRequest();
        RiskMessageEnvelope riskMessageEnvelope = new RiskMessageEnvelope();
        //headers
        Headers headers=new Headers();
        headers.setSource(AppConstants.BlAZE_SOURCE);
        headers.setEventType("CustomerVerificationStatusLookup");
        headers.setMessageId(UUID.randomUUID().toString());
        riskMessageEnvelope.setHeaders(headers);
        //properties
        Properties properties=new Properties();
        properties.setSessionId(sessionId);
        properties.setTransactionTimeStamp(getCurrentTimestampEST());
        properties.setOperation(AppConstants.BlAZE_OPERATION);
        properties.setCountryCode(countryCode);
        riskMessageEnvelope.setProperties(properties);
        //data
        Data data=Data.builder()
                .messageType("CustomerVerificationStatusLookup")
                .pcpCustomerNumber(umn)
                .pcpNumber(umn)
                .transactionTimeStamp(getCurrentTimestampEST())
                .sessionId(sessionId)
                .channel("IPH")
                .channelVersion("9811")
                .platform("WU-WALLET")
                .partnerID("WU-WALLET")
                .callingEntity("Mulesoft")
                .environment(blazeEnvironment)
                .myWUNumber(umn)
                .profileSenderCountryCode(mapCountryCode(countryCode))
                .cscVerifiedIdFlag(idvStatus)
                .transactionStatusRequiredFlag("Y")
                .achTransactionRequiredFlag("Y")
                .authenticationKey(authenticationKey)
                .ipAddress(clientIp)
                .loginAuthType(loginAuthType)
                .build();
        riskMessageEnvelope.setData(data);
        blazeRequest.setRiskMessageEnvelope(riskMessageEnvelope);
        return blazeRequest;
    }

    public static String getCurrentTimestampEST() {
        ZonedDateTime estTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSS");
        return estTime.format(formatter);
    }

     String mapCountryCode(String country) {
        if (country != null) {
            switch (country.toLowerCase()) {
                case "us":
                    return "US_CODE";
                case "ro":
                    return "RO_CODE";
                default:
                    return "";
            }
        }
        return "";
    }


}
