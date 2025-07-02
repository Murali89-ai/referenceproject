package com.wu.brwallet.customer.profile.helper;

import com.wu.brwallet.customer.profile.model.common.ucd.customerlookup.*;
import com.wu.brwallet.customer.profile.model.request.signon.customer.CustomerAccountInfoDetails;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UCDHelper {

    // Returns the size of customerAccountInfo
    public int sizeOfAccountInfo(CustomerLookupResponse ucdLookupResponse) {
        if(Optional.ofNullable(ucdLookupResponse.getCustomerDetails()).isEmpty()){
            return 0;
        }
        List<AccountAndAudit> accountInfoList =
                ucdLookupResponse.getCustomerDetails().get(0).getCustomerAccountInfo();
        return accountInfoList == null ? 0 : accountInfoList.size();
    }

    //Returns countrycode from address
    public String findCountryCode(CustomerLookupResponse ucdLookupResponse){
        if(Optional.ofNullable(ucdLookupResponse).isEmpty()){
            return null;
        }
        return ucdLookupResponse.getCustomerDetails().get(0)
                .getCustomerAddress().get(0)
                .getAddress().getCountryCodeIso2();
    }

    //Returns Verification status
    public String findIDVStatus(CustomerLookupResponse ucdLookupResponse){
        if(Optional.ofNullable(ucdLookupResponse).isEmpty()
                || Optional.ofNullable(ucdLookupResponse.getCustomerDetails().get(0)).isEmpty()
                || Optional.ofNullable(ucdLookupResponse.getCustomerDetails().get(0).getCustomerVerificationDetails()).isEmpty()
        ){
            return null;
        }
        return ucdLookupResponse.getCustomerDetails().get(0)
                .getCustomerVerificationDetails().get(0)
                .getCustomerVerificationDetail().getVerificationStatus();
    }

    // Returns the accountTypeId for single or multiple accounts
    public String findWalletAccountTypeId(CustomerLookupResponse ucdLookupResponse,int size) {
        if (size == 1) {
            return String.valueOf(ucdLookupResponse.getCustomerDetails().get(0)
                    .getCustomerAccountInfo().get(0)
                    .getAccount().getAccountTypeId());
        }
        if (size > 1) {
            return String.valueOf(ucdLookupResponse.getCustomerDetails().get(0)
                    .getCustomerAccountInfo().stream()
                    .filter(info -> info.getAccount() != null && info.getAccount().getAccountTypeId().equals(14))
                    .findFirst()
                    .map(accountInfo -> accountInfo.getAccount().getAccountTypeId())
                    .orElse(null));
        }
        return null;
    }

    // Returns the providerAccountStatus only if there are multiple accounts with wallet accountTypeId
    public String findProviderAccountStatus(CustomerLookupResponse ucdLookupResponse, String walletAccountTypeId) {
        if (StringUtils.isNotEmpty(walletAccountTypeId) && StringUtils.equals(walletAccountTypeId, "14")) {
            return ucdLookupResponse.getCustomerDetails().get(0)
                    .getCustomerAccountInfo().stream()
                    .filter(info -> info.getAccount() != null && info.getAccount().getAccountTypeId().equals(14))
                    .findFirst()
                    .map(accountInfo -> accountInfo.getAccount().getProviderAccountStatus())
                    .orElse(null);
        }
        return null;
    }

    public List<CustomerDeviceAndAudit> getDeviceList(CustomerLookupResponse customerLookupResponse){
        return   Optional.ofNullable(customerLookupResponse.getCustomerDetails())
                .filter(details -> !details.isEmpty())
                .map(details -> details.get(0))
                .map(CustomerDetailsSet6::getCustomerDevices)
                .filter(device ->!device.isEmpty())
                .orElse(null);

    }

}
