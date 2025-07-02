package com.wu.brwallet.customer.profile.builder.response;

import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.common.ucd.customerregistration.CustomerRegistrationResponse;
import com.wu.brwallet.customer.profile.model.request.customerRegister.CustomerRegisterRequest;
import com.wu.brwallet.customer.profile.model.response.registration.AdditionalFields;
import com.wu.brwallet.customer.profile.model.response.registration.CustomerRegisterResponse;
import com.wu.brwallet.customer.profile.model.response.ping.PingResponse;
import com.wu.brwallet.customer.profile.util.PingHttpStatusUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationResponseBuilder {

    @Autowired
    private PingHttpStatusUtility pingHttpStatusUtility;

    public CustomerRegisterResponse customerRegistartionResponseBuilder(CustomerRegisterRequest registrationRequest, CustomerRegistrationResponse ucdRegistrationResponse, PingResponse pingResponse, TransactionData transactionData
    ){
        CustomerRegisterResponse customerRegisterResponse =new CustomerRegisterResponse();
        customerRegisterResponse.setSuccess(AppConstants.REGISTRATION_SUCCESS);
        customerRegisterResponse.setHttpStatus(AppConstants.REGISTRATION_HTTP_STATUS_CODE);
        customerRegisterResponse.setMessage(AppConstants.REGISTRATION_STATUS_MESSAGE);
        customerRegisterResponse.setExternalRefId(transactionData.getExternalRefId());
        AdditionalFields additionalFields=new AdditionalFields();
        additionalFields.setCustomerUmn(ucdRegistrationResponse.getCustomerUmn());
        additionalFields.setSessionId(registrationRequest.getSessionId());
        if(pingHttpStatusUtility.checkStatusCode409() && pingResponse!=null && pingResponse.getPingGetResponse()!=null) {
           String _dn= pingResponse.getPingGetResponse().get_embedded().getEntries().get(0).get_dn();
            additionalFields.setUserDn(_dn);
        }
        else{
            additionalFields.setUserDn(pingResponse.getPingCreateResponse().getDn());
        }
        if(pingHttpStatusUtility.checkStatusCode409() && pingResponse!=null && pingResponse.getPingGetResponse()!=null) {
            String pwpAccountStateJSON= pingResponse.getPingGetResponse().get_embedded().getEntries().get(0).getPwpAccountStateJSON();
            additionalFields.setPwpAccountStateJson(pwpAccountStateJSON);
        }
        else{
            additionalFields.setPwpAccountStateJson(pingResponse.getPingCreateResponse().getPwpAccountState());
        }
        customerRegisterResponse.setAdditionalFields(additionalFields);

        return customerRegisterResponse;
    }
}
