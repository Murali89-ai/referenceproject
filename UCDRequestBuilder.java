package com.wu.brwallet.customer.profile.builder.request;


import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.model.common.ucd.customerregistration.*;
import com.wu.brwallet.customer.profile.model.request.customerRegister.CustomerRegisterRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


@Component
public class UCDRequestBuilder {

    private static final Logger logger = LogManager.getLogger(UCDRequestBuilder.class);

    public CustomerRegistrationRequest buildUcdRequest(CustomerRegisterRequest registrationRequest){
        logger.debug("UCDRequestBuilder. buildUcdRequest");
        CustomerRegistrationRequest ucdRegistrationRequest=new CustomerRegistrationRequest();
        Header header=new Header();
        header.setSource(AppConstants.PROFILE_REGISTER_SOURCE);
        header.setAppName(AppConstants.PROFILE_REGISTER_APPNAME);
        header.setAppVersion(AppConstants.PROFILE_REGISTER_APPVERSION);
        header.setHostIp(AppConstants.PROFILE_REGISTER_HOSTIP);
        header.setHostName(AppConstants.PROFILE_REGISTER_HOSTNAME);
        header.setTimeStamp(getCurrentFormattedDateTime());
        header.setTrasactionId(UUID.randomUUID().toString());
        ucdRegistrationRequest.setHeader(header);
        Customer customer=new Customer();
        customer.setCustomerCategory(Customer.CustomerCategoryEnum.valueOf(AppConstants.PROFILE_CUSTOMER_CATEGORY));
        ucdRegistrationRequest.setCustomer(customer);

        List<Address> addressList=new ArrayList<>();
        Address address=new Address();
        address.setAddressType(Address.AddressTypeEnum.fromValue(Integer.valueOf(registrationRequest.getAddress().getAddressType())));
        address.setCountryCodeIso3(registrationRequest.getAddress().getCountryCodeIso3());
        addressList.add(address);
        ucdRegistrationRequest.setAddress(addressList);

        Account account=new Account();
        account.setAccountTypeId(Integer.valueOf(registrationRequest.getAccountTypeId()));
        account.setAccountKey(registrationRequest.getEmail());
        account.setLastAccessedDate(getCurrentFormattedDateTime());
        account.setAccountActiveFlag(determineAccountActiveFlag(registrationRequest.getAccountTypeId()));
        ucdRegistrationRequest.setAccount(account);

        ucdRegistrationRequest.setPhone(processPhone(registrationRequest));

        List<Email> emailList=new ArrayList<>();
        Email email=new Email();
        email.setEmailType(Email.EmailTypeEnum.fromValue(1));
        email.setEmailValue(registrationRequest.getEmail());
        email.setEmailVvDate(OffsetDateTime.parse(registrationRequest.getEmailVvDate()));
        email.setEmailVvStatus(registrationRequest.getEmailVvStatus());
        email.setEmailVvStatusBy(registrationRequest.getEmailVvStatusBy());
        emailList.add(email);
        ucdRegistrationRequest.setEmail(emailList);

        ucdRegistrationRequest.setCustomerKycDetails(getCustomerKycDetails(registrationRequest));

        List<CustomerVerificationDetail> customerVerificationDetailList=new ArrayList<>();
        CustomerVerificationDetail customerVerificationDetail=new CustomerVerificationDetail();
        customerVerificationDetail.setChannelType(Integer.valueOf(AppConstants.PROFILE_REGISTER_CHANNELTYPE));
        customerVerificationDetail.setVerificationFlagTypeId(Integer.valueOf(AppConstants.PROFILE_REGISTER_VERIFICATIONTYPE_FLAGID));
        customerVerificationDetail.setPcpNumber(AppConstants.PROFILE_REGISTER_PCP_NUMBER);
        customerVerificationDetailList.add(customerVerificationDetail);
        ucdRegistrationRequest.setCustomerVerification(customerVerificationDetailList);

        ucdRegistrationRequest.setCustomerUsageStatistics(generateCustomerUsageStatistics(registrationRequest.getAccountTypeId()));

        ucdRegistrationRequest.setRequestInitiatedBy("MuleSoft");

        return ucdRegistrationRequest;
    }

    public String determineAccountActiveFlag(String account) {
         if(account.equals(AppConstants.WALLET_ACCOUNT_TYPE_ID)){
            return "P";
        }
        else{
            return "Y";
        }
    }

    public List<Phone> processPhone(CustomerRegisterRequest registrationRequest) {
        if (registrationRequest.getAccountTypeId().equals(AppConstants.WALLET_ACCOUNT_TYPE_ID)) {
            Phone phone = new Phone();
            phone.setPhoneType(Phone.PhoneTypeEnum.NUMBER_1);
            phone.setPhoneSeq(1);
            phone.setPhoneNumber(registrationRequest.getPhone().getPhoneNumber());
            phone.setIsdCode(registrationRequest.getPhone().getIsdCode());
            phone.setPhoneVvStatus(Phone.PhoneVvStatusEnum.valueOf(registrationRequest.getPhone().getPhoneVvStatus()));
            phone.setPhoneVvStatusBy(registrationRequest.getPhone().getPhoneVvStatusBy());
            phone.setPhoneVvDate(OffsetDateTime.parse(registrationRequest.getPhone().getPhoneVvDate()));

            return Collections.singletonList(phone);
        }
        return null;
    }

    public List<CustomerKycDetail> getCustomerKycDetails(CustomerRegisterRequest request) {
        if (request.getAccountTypeId().equals(AppConstants.WALLET_ACCOUNT_TYPE_ID)) {
            CustomerKycDetail kycDetails = new CustomerKycDetail();
            kycDetails.setPcpNumber(AppConstants.PROFILE_REGISTER_PCP_NUMBER);
            kycDetails.setChannelType(Integer.valueOf(AppConstants.PROFILE_REGISTER_CHANNEL_TYPE_KYC));
            kycDetails.setIdType(AppConstants.PROFILE_REGISTER_ID_TYPE);
            kycDetails.setIdNumber(Optional.ofNullable(request.getIdNumber()).orElse(""));
            kycDetails.setKycDetailsSeq(Long.valueOf(AppConstants.PROFILE_REGISTER_KYC_DETAILS_SEQ));

            return Collections.singletonList(kycDetails);
        }
        return null;
    }

    public CustomerUsageStatistics generateCustomerUsageStatistics(String accountTypeId) {
        if (AppConstants.WALLET_ACCOUNT_TYPE_ID.equals(accountTypeId)) {
            CustomerUsageStatistics statistics = new CustomerUsageStatistics();
            statistics.setTcFlag("Y");
            statistics.setTcFlagUpdatedDate(getCurrentFormattedDateTime());
            return statistics;
        }
        return null;
    }

    private OffsetDateTime getCurrentFormattedDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss.SSS-hh:mm");
        return OffsetDateTime.parse(LocalDateTime.now().format(formatter));
    }

}
