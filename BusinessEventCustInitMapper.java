package com.wu.brwallet.customer.profile.mapper.initcusverify;

import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.CustomerInitiationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BusinessEventCustInitMapper {

    @Mapping(target = "description", constant = "Blaze Customer Verification Initiation Call Completed")
    @Mapping(target = "sourceSystem", constant = "Outsystems")
    @Mapping(target = "targetSystem", constant = "Blaze")
    @Mapping(target = "processName", constant = "Customer Profile API")
    @Mapping(target = "flowName", constant = "Blaze Customer Verification Initialization Flow")
    @Mapping(target = "eventStage", constant = "Blaze-Customer-Verification-Initiation-API-Call")
    @Mapping(target = "sessionId", source = "sessionId")
    @Mapping(target = "loginAuthType", source = "loginAuthType")
    @Mapping(target = "mtcn", source = "mtcn")
    @Mapping(target = "customerUmn", source = "customerUmn")
    BusinessEventData getBusinessEventRequest(CustomerInitiationRequest request);
}
