package com.wu.brwallet.customer.profile.mapper.signon;

import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.model.common.ucd.customerlookup.CustomerLookupRequest;
import com.wu.brwallet.customer.profile.model.common.ucd.customerlookup.MultiParamNonKeyLookupRequest;
import com.wu.brwallet.customer.profile.model.common.ucd.profilemanagement.AddOrUpdateProfileElementsRequest;
import com.wu.brwallet.customer.profile.model.common.ucd.profilemanagement.Customer;
import com.wu.brwallet.customer.profile.model.common.ucd.profilemanagement.CustomerDevice;
import com.wu.brwallet.customer.profile.model.common.ucd.profilemanagement.Header;
import com.wu.brwallet.customer.profile.model.request.registerDevice.RegisterDeviceRequest;
import com.wu.brwallet.customer.profile.model.request.updateDevice.UpdateDeviceRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Mapper(componentModel = "spring",imports = {OffsetDateTime .class, DateTimeFormatter.class, UUID .class})
public interface UCDMapper {

    default Boolean toBoolean(String value) {
        return "Y".equalsIgnoreCase(value);
    }

    @Mapping(source = "customerUmn", target = "customerLookup.customerKey.customerUmn")
    @Mapping(constant = AppConstants.UCD_SOURCE, target = "header.source" )
    @Mapping(constant = AppConstants.UCD_APPNAME, target = "header.appName")
    @Mapping(constant = AppConstants.UCD_APPVERSION, target = "header.appVersion")
    @Mapping(target = "header.timeStamp", expression = "java(getCurrentTimestamp())")
    @Mapping(constant = AppConstants.UCD_TRANSACTION_ID, target = "header.trasactionId")
    @Mapping(constant = AppConstants.UCD_HOST_NAME, target = "header.hostName")
    @Mapping(constant = AppConstants.UCD_HOST_IP, target = "header.hostIp")
    @Mapping(expression = "java(toBoolean(\"Y\"))", target = "keyBased")
    @Mapping(constant = AppConstants.PROFILE_REGISTER_CHANNEL_TYPE_KYC, target = "channelType")
    @Mapping(constant = "Y", target = "sendPartnerDetails")
    @Mapping(constant = AppConstants.UCD_REQUEST_INITIATED_BY, target = "requestInitiatedBy")
    @Mapping(constant = "Y", target = "sendPartialCustomerFlag")
    @Mapping(constant = "Y", target = "sendNonWuAlsoFlag")
    @Mapping(constant = "Y", target = "sendAllPfc")
    CustomerLookupRequest mapUmn(String customerUmn);



    @Mapping(target = "lookupKey.idNumber", source = "idNumber")
    MultiParamNonKeyLookupRequest mapdata(String idNumber);

   default OffsetDateTime getCurrentTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss.SSS-hh:mm");
        return OffsetDateTime.parse(LocalDateTime.now().format(formatter));
    }

    @Mapping(constant = AppConstants.UCD_SOURCE, target = "header.source" )
    @Mapping(constant = AppConstants.UCD_APPNAME, target = "header.appName")
    @Mapping(constant = AppConstants.UCD_APPVERSION, target = "header.appVersion")
    @Mapping(target = "header.timeStamp", expression = "java(getCurrentTimestamp())")
    @Mapping(constant = AppConstants.UCD_TRANSACTION_ID, target = "header.trasactionId")
    @Mapping(constant = AppConstants.UCD_HOST_NAME, target = "header.hostName")
    @Mapping(constant = AppConstants.UCD_HOST_IP, target = "header.hostIp")
    @Mapping(source = "customerUmn", target = "customer.customerUmn")
    @Mapping(constant = AppConstants.UCD_NONWALLET_ACCOUNT_TYPE_ID, target = "account.accountTypeId")
    @Mapping(source = "accountKey", target = "account.accountKey")
    @Mapping(target = "account.lastAccessedDate", expression = "java(getCurrentTimestamp())")
    @Mapping(target = "account.accountActiveFlag", constant = "Y")
    @Mapping(constant = AppConstants.UCD_UPDATE, target = "requestType")
    @Mapping(constant = AppConstants.UCD_REQUEST_INITIATED_BY, target = "requestInitiatedBy")
    AddOrUpdateProfileElementsRequest mapAddOrUpdate(String customerUmn, String accountKey) ;

    default AddOrUpdateProfileElementsRequest mapAddDevice(RegisterDeviceRequest request, String accountTypeId, OffsetDateTime resultDateTime){
        AddOrUpdateProfileElementsRequest target = new AddOrUpdateProfileElementsRequest();
        Header header = new Header();
        header.setSource(AppConstants.UCD_SOURCE);
        header.setAppName(AppConstants.UCD_APPNAME);
        header.setAppVersion(AppConstants.UCD_APPVERSION);
        header.setHostName(AppConstants.UCD_HOST_NAME);
        header.setHostIp(AppConstants.UCD_HOST_IP);
        header.setTimeStamp(getCurrentTimestamp());
        header.setTrasactionId(AppConstants.UCD_TRANSACTION_ID);

        Customer customer = new Customer();
        customer.setCustomerUmn(request.getUmn());

        CustomerDevice customerDevice = new CustomerDevice();
        customerDevice.setAccountTypeId(Integer.valueOf(accountTypeId));
        customerDevice.setDeviceId(request.getDeviceId());
        customerDevice.setDeviceName(request.getDeviceName());
        customerDevice.setDeviceModel(request.getDeviceModel());
        customerDevice.setDeviceOs(request.getDeviceOs());
        customerDevice.setStatus("A");
        customerDevice.setStartDate(resultDateTime);
        customerDevice.setComments(request.getComments());

        target.setHeader(header);
        target.setCustomer(customer);
        target.setCustomerDevice(customerDevice);
        target.setRequestType("Update");
        target.setRequestInitiatedBy("Mulesoft");

        return target;
    }

    default AddOrUpdateProfileElementsRequest    mapUpdateDevice(UpdateDeviceRequest request){

        AddOrUpdateProfileElementsRequest target = new AddOrUpdateProfileElementsRequest();
        Header header = new Header();
        header.setSource(AppConstants.UCD_SOURCE);
        header.setAppName(AppConstants.UCD_APPNAME);
        header.setAppVersion(AppConstants.UCD_APPVERSION);
        header.setHostName(AppConstants.UCD_HOST_NAME);
        header.setHostIp(AppConstants.UCD_HOST_IP);
        header.setTimeStamp(getCurrentTimestamp());
        header.setTrasactionId(AppConstants.UCD_TRANSACTION_ID);

        Customer customer = new Customer();
        customer.setCustomerUmn(request.getUmn());

        CustomerDevice customerDevice = new CustomerDevice();
        customerDevice.setDeviceSeq(Long.valueOf(request.getDeviceSeq()));
        customerDevice.setAccountTypeId(Integer.valueOf(request.getAccountTypeId()));
        customerDevice.setDeviceId(request.getDeviceId());
        customerDevice.setStatus(request.getStatus().getValue());
        if(request.getStatus().getValue().equals("I")){
            customerDevice.setEndDate(getCurrentTimestamp());
        }
        customerDevice.setComments(request.getComments());

        target.setHeader(header);
        target.setCustomer(customer);
        target.setCustomerDevice(customerDevice);
        target.setRequestType("Update");
        target.setRequestInitiatedBy("Mulesoft");

        return target;

    }
}
