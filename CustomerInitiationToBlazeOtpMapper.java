package com.wu.brwallet.customer.profile.mapper.initcusverify;

import com.wu.brwallet.customer.profile.model.common.blaze.*;
import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.CustomerInitiationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Mapper(componentModel = "spring", imports = {ZonedDateTime.class, DateTimeFormatter.class, UUID.class,
        RiskMessageEnvelope.class, Headers.class, Properties.class, Data.class})
public interface CustomerInitiationToBlazeOtpMapper {

    @Mapping(target = "riskMessageEnvelope", expression = "java(buildRiskMessageEnvelope(request, environment))")
    BlazeRequest mapBlazeOtpNotificationRequest(CustomerInitiationRequest request, String environment);

    default RiskMessageEnvelope buildRiskMessageEnvelope(CustomerInitiationRequest request, String environment) {
        return RiskMessageEnvelope.builder()
                .headers(buildHeaders())
                .properties(buildProperties(request))
                .data(buildData(request, environment))
                .build();
    }

    default Headers buildHeaders() {
        return Headers.builder()
                .source("Mulesoft")
                .eventType("CustomerOTPInitiationNotification")
                .messageId(UUID.randomUUID().toString())
                .build();
    }

    default Properties buildProperties(CustomerInitiationRequest request) {
        return Properties.builder()
                .sessionId(request.getSessionId())
                .transactionTimeStamp(getCurrentTimestamp())
                .operation("CREATE")
                .build();
    }

    default Data buildData(CustomerInitiationRequest request, String environment) {
        return Data.builder()
                .deliveryMedium(determineDeliveryMedium(request))
                .channel(determineChannel(request.getSessionId()))
                .channelVersion(determineChannelVersion(request.getSessionId()))
                .deviceAlias(request.getDeviceAlias() != null ? request.getDeviceAlias() : "NA")
                .messageType("CustomerOTPInitiationNotification")
                .timeStamp(getCurrentTimestamp())
                .pcpNumber(request.getCustomerUmn())
                .sessionId(request.getSessionId())
                .platform("WU-WALLET")
                .callingEntity("MULESOFT")
                .environment(environment)
                .myWUNumber(request.getCustomerUmn())
                .ipAddress(request.getClientIp())
                .country(request.getSender().getCountry())
                .otpType(request.getSender().getKycDetails().getPbv().getDeliveryMethods().getOtpType())
                .build();
    }

    default String getCurrentTimestamp() {
        return ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss-SSSS"));
    }

    @Named("determineDeliveryMedium")
    default String determineDeliveryMedium(CustomerInitiationRequest request) {
        if ("PVE".equalsIgnoreCase(request.getSender().getKycDetails().getPbv().getDeliveryMethods().getOtpType())) {
            return "EMAIL";
        } else if ("PVS".equalsIgnoreCase(request.getSender().getKycDetails().getPbv().getDeliveryMethods().getOtpType())) {
            return "SMS";
        }
        return null;
    }

    @Named("determineChannel")
    default String determineChannel(String sessionId) {
        if (sessionId != null && sessionId.startsWith("iph")) {
            return "Mobile";
        } else if (sessionId != null && sessionId.startsWith("web")) {
            return "Web";
        }
        return "";
    }

    @Named("determineChannelVersion")
    default String determineChannelVersion(String sessionId) {
        if (sessionId != null && sessionId.startsWith("iph")) {
            return "IPH";
        } else if (sessionId != null && sessionId.startsWith("web")) {
            return "WEB";
        }
        return "";
    }
}
