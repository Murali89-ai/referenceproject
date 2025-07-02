package com.wu.brwallet.customer.profile.mapper.signon;

import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.common.ucd.customerlookup.CustomerLookupResponse;
import com.wu.brwallet.customer.profile.model.request.signon.customer.SignOnRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BusinessEventsBlazeMapper {

    @Mapping(target = "description", constant = "Blaze Login Risk Call Completed")
    @Mapping(target = "sourceSystem", constant = "Mulesoft")
    @Mapping(target = "targetSystem", constant = "Blaze")
    @Mapping(target = "processName", constant = "Customer Profile API")
    @Mapping(target = "flowName", constant = "Blaze Login Risk Call")
    @Mapping(target = "eventStage", constant = "Blaze-Logon-Risk-InIt-API-Call")
    @Mapping(target = "sessionId", source = "request.sessionId")
    //@Mapping(target = "countryCode", source = "customerLookupResponse.customerDetails.customerAddress.address.countryCodeIso2")
    @Mapping(target = "countryCode", constant = "US_CODE")
    @Mapping(target = "customerUmn", source = "request.customerUmn")
    BusinessEventData getBusinessEventBlazeRequest(SignOnRequest request, CustomerLookupResponse customerLookupResponse);
}
