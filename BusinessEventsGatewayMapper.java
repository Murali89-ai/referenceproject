package com.wu.brwallet.customer.profile.mapper.signon;

import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.common.ucd.customerlookup.CustomerLookupResponse;
import com.wu.brwallet.customer.profile.model.request.signon.customer.SignOnRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BusinessEventsGatewayMapper {

    @Mapping(target = "description", constant = "abmtCIS trasactionhistory call completed")
    @Mapping(target = "sourceSystem", constant = "Mulesoft")
    @Mapping(target = "targetSystem", constant = "abmt")
    @Mapping(target = "processName", constant = "Customer Profile API")
    @Mapping(target = "flowName", constant = "abmtCIS trasactionhistory call")
    @Mapping(target = "eventStage", constant = "transactionhistory-details-API-Call")
    @Mapping(target = "sessionId", source = "request.sessionId")
   // @Mapping(target = "countryCode", source = "customerLookupResponse.customerDetails.customerAddress.address.countryCodeIso2")
    @Mapping(target = "countryCode", constant = "US_CODE")
    @Mapping(target = "customerUmn", source = "request.customerUmn")
    BusinessEventData getBusinessEventGatewayRequest(SignOnRequest request, CustomerLookupResponse customerLookupResponse);
}
