package com.wu.brwallet.customer.profile.mapper.initcusverify;

import com.wu.brwallet.customer.profile.model.common.blaze.*;
import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.CustomerInitiationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Mapper(componentModel = "spring", imports = {ZonedDateTime.class, DateTimeFormatter.class,
        RiskMessageEnvelope.class, Headers.class, Properties.class, Data.class, UUID.class})
public interface CustomerInitRequestMapper {

    @Mapping(target = "riskMessageEnvelope", expression = "java(buildRiskMessageEnvelope(request, environment))")
    BlazeRequest toBlazeCustInitRequest(CustomerInitiationRequest request, String environment);

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
                .eventType("CustomerVerificationInitiation")
                .messageId(UUID.randomUUID().toString())
                .build();
    }

    default Properties buildProperties(CustomerInitiationRequest request) {
        return Properties.builder()
                .mtcn16(request.getMtcn())
                .countryCode(request.getPaymentDetails().getOrigination().getCountryIsoCode())
                .transactionTimeStamp(getCurrentTimestamp())
                .operation("CREATE")
                .build();
    }

    default Data buildData(CustomerInitiationRequest request, String environment) {
        return Data.builder()
                .messageType("CustomerVerificationInitiation")
                .mtcn16(request.getMtcn())
                .pcpNumber(request.getCustomerUmn())
                .myWUNumber(request.getCustomerUmn())
                .pcpCustomerNumber(request.getCustomerUmn())
                .sessionId(request.getSessionId())
                .transactionTimeStamp(getCurrentTimestamp())
                .channel(determineChannel(request.getSessionId()))
                .channelVersion(determineChannelVersion(request.getSessionId()))
                .platform("WU-WALLET")
                .callingEntity("MULESOFT")
                .paymentType(request.getPaymentDetails().getPaymentMethod().getPaymentType())
                .environment(environment)
                .billingSenderCountryCode(request.getPaymentDetails().getOrigination().getCountryIsoCode())
                .KycStatus("Initiated")
                .KycOperation(request.getSender().getKycDetails().getPbv().getDeliveryMethods().getOtpType())
                .build();
    }


    default String getCurrentTimestamp() {
        return ZonedDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss-SSSS"));
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
