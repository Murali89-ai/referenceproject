package com.wu.brwallet.customer.profile.mapper.signon;

import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.common.ucd.customerlookup.CustomerLookupResponse;
import com.wu.brwallet.customer.profile.model.request.signon.customer.SignOnRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BusinessEventsUcdMapper {
    @Mapping(target = "description", constant = "UCD Lookup Call Completed")
    @Mapping(target = "sourceSystem", constant = "Mulesoft")
    @Mapping(target = "targetSystem", constant = "UCD")
    @Mapping(target = "processName", constant = "Customer Profile API")
    @Mapping(target = "flowName", constant = "UCD Lookup Call")
    @Mapping(target = "eventStage", constant = "UCD-Customer-Lookup-API-Call")
    @Mapping(target = "countryCode", constant = "US_CODE")
    @Mapping(target = "customerUmn", source = "customerUmn")
    BusinessEventData getBusinessEventUcdRequest(String customerUmn );

    @Mapping(target = "description", constant = "Registering device for a customer in UCD Call Completed")
    @Mapping(target = "sourceSystem", constant = "Mulesoft")
    @Mapping(target = "targetSystem", constant = "UCD")
    @Mapping(target = "processName", constant = "Customer Profile API")
    @Mapping(target = "flowName", constant = "ucd-customer-device-registeration-flow")
    @Mapping(target = "eventStage", constant = "UCD-Customer-Device-Registeration-API-Call")
    @Mapping(target = "customerUmn", source = "customerUmn")
    BusinessEventData getBusinessEventUcdUpdateRequest(String customerUmn);
}
