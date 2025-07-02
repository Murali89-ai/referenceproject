package com.wu.brwallet.customer.profile.mapper.initcusverify;

import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.CustomerInitiationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BusinessEventCustCsvlMapper {

    @Mapping(target = "description", constant = "Blaze Customer Verification Status Call Completed")
    @Mapping(target = "sourceSystem", constant = "Mulesoft")
    @Mapping(target = "targetSystem", constant = "Blaze")
    @Mapping(target = "processName", constant = "Customer Profile API")
    @Mapping(target = "flowName", constant = "Blaze Customer Verification Status Call")
    @Mapping(target = "eventStage", constant = "Blaze-Customer-Verification-Status-API-Call")
    @Mapping(target = "sessionId", source = "sessionId")
    @Mapping(target = "countryCode", source = "paymentDetails.origination.countryIsoCode")
    @Mapping(target = "customerUmn", source = "customerUmn")
    BusinessEventData getBusinessEventRequest(CustomerInitiationRequest request);
}
