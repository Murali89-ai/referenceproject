package com.wu.brwallet.customer.profile.mapper.initcusverify;


import com.wu.brwallet.customer.profile.model.common.blaze.BlazeResponse;
import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.CustomerInitiationRequest;
import com.wu.brwallet.customer.profile.model.response.initiateCusVerify.CustomerInitiationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BlazeResponseMapper {


    @Mapping(source = "request.customerUmn", target = "wuCardNumber")
    @Mapping(source = "blazeCVSLResponse.riskMessageEnvelope.data.isEligibleToTransact", target = "isEligibleToTransact")
   @Mapping(source = "blazeCVSLResponse.riskMessageEnvelope.data.customerStatus", target = "customerStatus")
    CustomerInitiationResponse mapBlazeResponse(CustomerInitiationRequest request, BlazeResponse blazeCVSLResponse);

}