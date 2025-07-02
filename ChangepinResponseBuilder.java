package com.wu.brwallet.customer.profile.builder.response;

import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.response.changepin.ChangePinResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

@Component
public class ChangepinResponseBuilder {
    public ChangePinResponse changePinSuccessResponse(TransactionData transactionData){
        ChangePinResponse changePinResponse=new ChangePinResponse();
        changePinResponse.setSuccess(true);
        changePinResponse.setHttpStatus(200);
        changePinResponse.setMessage(AppConstants.PIN_CHANGE_SUCCESS_RESPONSE);
        changePinResponse.setExternalRefId(transactionData.getExternalRefId());
        changePinResponse.setCorrelationId(transactionData.getCorrelationId());
        changePinResponse.setErrors(new ArrayList<>());
        return changePinResponse;
    }

    public ChangePinResponse changePinErrorResponse(TransactionData transactionData){
        ChangePinResponse changePinResponse=new ChangePinResponse();
        changePinResponse.setSuccess(true);
        changePinResponse.setHttpStatus(500);
        changePinResponse.setMessage("change pin failed");
        changePinResponse.setExternalRefId(transactionData.getExternalRefId());
        changePinResponse.setCorrelationId(transactionData.getCorrelationId());
        changePinResponse.setErrors(new ArrayList<>());
        return changePinResponse;
    }
}
