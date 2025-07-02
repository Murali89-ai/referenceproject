package com.wu.brwallet.customer.profile.builder.request;
import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.model.request.customerRegister.CustomerRegisterRequest;
import com.wu.brwallet.customer.profile.model.request.ping.create.EmailDetails;
import com.wu.brwallet.customer.profile.model.request.ping.create.PingCreateUser;
import com.wu.brwallet.customer.profile.model.request.ping.update.Modifications;
import com.wu.brwallet.customer.profile.model.request.ping.update.PingUpdateRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PingRequestBuilder {

    @Value(("${ping.createUser.objectClass}"))
    private String objectClass;


    public PingCreateUser buildPingCreateUserRequest(CustomerRegisterRequest registrationRequest, String umn) {

        PingCreateUser pingCreateUser = new PingCreateUser();
        pingCreateUser.setObjectClass(Arrays.stream(objectClass.split(",")).toList());
        List<EmailDetails> emailJSON = new ArrayList<>();
        EmailDetails emailDetails = new EmailDetails();
        emailDetails.setType(AppConstants.PING_CREATEUSER_TYPE);
        emailDetails.setValue(registrationRequest.getEmail());
        emailDetails.setVerified(AppConstants.PING_CREATEUSER_VERIFIED);
        emailJSON.add(emailDetails);
        pingCreateUser.setEmailJSON(emailJSON);
        pingCreateUser.set_parentDN(AppConstants.PARENT_DN);
        if (registrationRequest.getAccountStatus() != null) {
            pingCreateUser.setAccountStatus(registrationRequest.getAccountStatus());
        } else {
            pingCreateUser.setAccountStatus(AppConstants.DEFAULT_ACCOUNT_ACTIVE_STATUS);
        }
        if (registrationRequest.getLocale() != null) {
            pingCreateUser.setLocale(registrationRequest.getLocale());
        } else {
            pingCreateUser.setLocale("en-GB");
        }
        pingCreateUser.setUmn(umn);

        return pingCreateUser;
    }


    public PingUpdateRequest pingUpdateRequestBuilder(String umn) {
        PingUpdateRequest pingUpdateRequest = new PingUpdateRequest();
        List<Modifications> modificationList = new ArrayList<>();
        Modifications modifications = new Modifications();
        modifications.setModificationType(AppConstants.PING_UPDATE_MODIFICATION_TYPE);
        modifications.setAttributeName(AppConstants.PING_UPDATE_ATTRIBUTE_UMN);
        modifications.setValues(umn);
        modificationList.add(modifications);
        pingUpdateRequest.setModifications(modificationList);
        return pingUpdateRequest;
    }

}
