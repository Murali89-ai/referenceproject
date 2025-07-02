package com.wu.brwallet.customer.profile.mapper.common;

import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.model.common.error.ErrorResponse;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.request.changepin.ChangePinRequest;
import com.wu.brwallet.customer.profile.model.request.validatepin.PinValidationRequest;
import org.json.JSONObject;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ErrorResponseMapper {
    default ErrorResponse validateRequest(PinValidationRequest request, TransactionData transactionData){
        ErrorResponse.Errors errors = new ErrorResponse.Errors();
        StringBuilder missingFields = new StringBuilder();
        boolean hasErrors = false;

        if (isNullOrEmpty(request.getCardId())) {
            missingFields.append(AppConstants.REQUIRED_KEY_CARDID_NOT_FOUND).append("\n");
            hasErrors = true;
        }

        if (isNullOrEmpty(request.getCustomerUmn())) {
            missingFields.append(AppConstants.REQUIRED_KEY_CUSTOMER_UMN_NOT_FOUND).append("\n");
            hasErrors = true;
        }

        if (isNullOrEmpty(request.getPin())) {
            missingFields.append(AppConstants.REQUIRED_KEY_PIN_NOT_FOUND).append("\n");
            hasErrors = true;
        }

        if (hasErrors) {

            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setSuccess(false);
            errorResponse.setHttpStatus(400);
            errorResponse.setExternalRefId(transactionData.getExternalRefId());
            errorResponse.setCorrelationId(transactionData.getCorrelationId());
            errorResponse.setAdditionalFields(new HashMap<>());

            List<ErrorResponse.Errors> errorsList = new ArrayList<>();
            errors.setErrorCode(BusinessConstants.BAD_REQUEST);
            errors.setErrorType(AppConstants.MAMBU_VALIDATE_PIN_BAD_REQUEST);
            errors.setErrorMessage(AppConstants.MAMBU_VALIDATE_INVALID_DATA_PROVIDED);

            String errorMessage = missingFields.toString().trim();
            errors.setStackTrace(errorMessage);
            errorsList.add(errors);
            errorResponse.setErrors(errorsList);
            return errorResponse;
        }

        return null;

    }
    default ErrorResponse buildInvalidatePinErrorResponse(TransactionData transactionData) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setSuccess(false);
        errorResponse.setHttpStatus(400);
        errorResponse.setExternalRefId(transactionData.getExternalRefId());
        errorResponse.setCorrelationId(transactionData.getCorrelationId());
        errorResponse.setAdditionalFields(new HashMap<>());
        ErrorResponse.Errors errors = new ErrorResponse.Errors();
        List<ErrorResponse.Errors> errorsList = new ArrayList<>();
        errors.setErrorCode(BusinessConstants.INVALID_PIN);
        errors.setErrorType(AppConstants.INVALID_PIN);
        errors.setErrorMessage(AppConstants.MAMBU_VALIDATE_PIN_ERROR_MESSAGE);
        JSONObject stackTrace = new JSONObject ();
        stackTrace.put("errorType", AppConstants.INVALID_BOOLEAN);
        stackTrace.put("message", AppConstants.ENTERED_PIN_IS_NOT_VALID);
        stackTrace.put("error", true);

        errors.setStackTrace(stackTrace.toString());
        errorsList.add(errors);
        errorResponse.setErrors(errorsList);
        return errorResponse;
    }

    default ErrorResponse pinNotPresent(TransactionData transactionData) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setSuccess(false);
        errorResponse.setHttpStatus(500);
        errorResponse.setExternalRefId(transactionData.getExternalRefId());
        errorResponse.setCorrelationId(transactionData.getCorrelationId());
        errorResponse.setAdditionalFields(new HashMap<>());
        ErrorResponse.Errors errors = new ErrorResponse.Errors();
        List<ErrorResponse.Errors> errorsList = new ArrayList<>();
        errors.setErrorCode(BusinessConstants.PIN_NOT_PRESENT);
        errors.setErrorType(AppConstants.PIN_NOT_PRESENT);
        errors.setErrorMessage(AppConstants.PIN_NOT_PRESENT_MESSAGE);
        errors.setStackTrace(AppConstants.PIN_NOT_PRESENT_STACK_TRACE);
        errorsList.add(errors);
        errorResponse.setErrors(errorsList);
        return errorResponse;
    }

    default ErrorResponse validateChangePinRequest(ChangePinRequest request, TransactionData transactionData){
        ErrorResponse.Errors errors = new ErrorResponse.Errors();
        StringBuilder missingFields = new StringBuilder();
        boolean hasErrors = false;

        if (isNullOrEmpty(request.getCpfNumber())) {
            missingFields.append(AppConstants.REQUIRED_KEY_CPF_NUMBER_NOT_FOUND).append("\n");
            hasErrors = true;
        }

        if (isNullOrEmpty(request.getCustomerUmn())) {
            missingFields.append(AppConstants.REQUIRED_KEY_CUSTOMER_UMN_NOT_FOUND).append("\n");
            hasErrors = true;
        }

        if (isNullOrEmpty(request.getPin())) {
            missingFields.append(AppConstants.REQUIRED_KEY_PIN_NOT_FOUND).append("\n");
            hasErrors = true;
        }

        if (hasErrors) {

            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setSuccess(false);
            errorResponse.setHttpStatus(400);
            errorResponse.setExternalRefId(transactionData.getExternalRefId());
            errorResponse.setCorrelationId(transactionData.getCorrelationId());
            errorResponse.setAdditionalFields(new HashMap<>());

            List<ErrorResponse.Errors> errorsList = new ArrayList<>();
            errors.setErrorCode(BusinessConstants.BAD_REQUEST);
            errors.setErrorType(AppConstants.MAMBU_VALIDATE_PIN_BAD_REQUEST);
            errors.setErrorMessage(AppConstants.MAMBU_VALIDATE_INVALID_DATA_PROVIDED);

            String errorMessage = missingFields.toString().trim();
            errors.setStackTrace(errorMessage);
            errorsList.add(errors);
            errorResponse.setErrors(errorsList);
            return errorResponse;
        }

        return null;

    }

    private boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }
}

