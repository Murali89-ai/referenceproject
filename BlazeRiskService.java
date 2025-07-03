package com.wu.brwallet.customer.profile.service.signon;

import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.builder.request.BlazeRequestBuilder;
import com.wu.brwallet.customer.profile.adaptor.Blaze;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.model.common.blaze.BlazeRequest;
import com.wu.brwallet.customer.profile.model.common.blaze.BlazeResponse;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.request.signon.CustomerAccountInfoDetails;
import com.wu.brwallet.customer.profile.model.request.signon.customer.SignOnRequest;
import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import static com.wu.brwallet.customer.profile.constants.AppConstants.PROVIDER_STATUS_REGULAR;
import static com.wu.brwallet.customer.profile.constants.AppConstants.WALLET_ACCOUNT_TYPE_ID;
import static com.wu.brwallet.customer.profile.constants.BusinessConstants.APP_BLAZE_ERROR;
import static com.wu.brwallet.customer.profile.constants.BusinessConstants.BLAZE_CUSTOMER_VERIFICATION_SERVICE;

@Service
public class BlazeRiskService {

    @Value("${blaze.url}")
    private String BLAZE_URL;

    @Value("${blaze.csvl.init.path}")
    private String BLAZE_CSVL_INIT_PATH;

    @Value("${blaze.risk.logon.path}")
    private String BLAZE_RISK_INIT_PATH;

    @Value("${blaze.environment}")
    private String blazeEnvironment;

    @Autowired
    private WUServiceExceptionUtils exceptionUtils;

    @Autowired
    private Blaze blaze;

    @Autowired
    private BlazeRequestBuilder blazeRequestBuilder;

    private static final Logger logger = LoggerFactory.getLogger(BlazeRiskService.class);

    @LoggingAnnotation
    public BlazeResponse executeBlazeFlows(CustomerAccountInfoDetails accountInfoDetails, SignOnRequest request, TransactionData incomingRequestDetails, String countryCode, String idvStatus) {
        BlazeResponse blazeResponse= null;
        if (isSingleWalletAccount(accountInfoDetails) || isMultipleRegularWalletAccount(accountInfoDetails)) {
            blazeResponse=blazeLogonRiskInitSubflow(request,incomingRequestDetails);
        } else if (isNonWalletOrIrregularAccount(accountInfoDetails)) {
            blazeResponse= blazeLogonRiskInitSubflow(request,incomingRequestDetails);
            blazeCustomerVerificationStatusSubflow(request,incomingRequestDetails,countryCode,idvStatus);
        } else {
            blazeResponse=  blazeLogonRiskInitSubflow(request,incomingRequestDetails);
            blazeCustomerVerificationStatusSubflow(request,incomingRequestDetails,countryCode,idvStatus);
        }
        return blazeResponse;
    }


    @LoggingAnnotation
    private boolean isSingleWalletAccount(CustomerAccountInfoDetails accountInfoDetails) {
        return accountInfoDetails.accountInfoSize() == 1
                && accountInfoDetails.accountTypeId().equals(WALLET_ACCOUNT_TYPE_ID);
    }

    @LoggingAnnotation
    private boolean isMultipleRegularWalletAccount(CustomerAccountInfoDetails accountInfoDetails) {
        return accountInfoDetails.accountInfoSize() > 1
                && accountInfoDetails.accountTypeId().equals(WALLET_ACCOUNT_TYPE_ID)
                && PROVIDER_STATUS_REGULAR.equals(accountInfoDetails.providerAccountStatus());
    }

    @LoggingAnnotation
    private boolean isNonWalletOrIrregularAccount(CustomerAccountInfoDetails accountInfoDetails) {
        return ((accountInfoDetails.accountInfoSize() == 1 && ! accountInfoDetails.accountTypeId().equals(WALLET_ACCOUNT_TYPE_ID))
                || (accountInfoDetails.accountInfoSize() > 1 && ! accountInfoDetails.accountTypeId().equals(WALLET_ACCOUNT_TYPE_ID))
                || (accountInfoDetails.accountInfoSize() > 1
                && accountInfoDetails.accountTypeId().equals(WALLET_ACCOUNT_TYPE_ID)
                && !PROVIDER_STATUS_REGULAR.equals(accountInfoDetails.providerAccountStatus())
                && accountInfoDetails.providerAccountStatus() != null));
    }

    @LoggingAnnotation
    private BlazeResponse blazeLogonRiskInitSubflow(SignOnRequest request, TransactionData incomingRequestDetails) {
        System.out.println("Executing blaze-logon-risk-init-subflow...");
        //set applicationHeaders
        BlazeRequest loginSessionRiskRequest = blazeRequestBuilder.buildBlazeLogonInitRequest(request.getSessionId(), request.getCustomerUmn(),
                request.getEndUserIp(), request.getLoginAuthType(), request.getAppVersion(), request.getBlackBoxData(), request.getDeviceDetails());
        try {
            String BASE_URL = BLAZE_URL + BLAZE_RISK_INIT_PATH;
            BlazeResponse loginSessionRiskResponse = blaze.sendPostRequest(BASE_URL,loginSessionRiskRequest, incomingRequestDetails, BlazeResponse.class, BusinessConstants.BLAZE_LOGON_RISK_SERVICE_NAME);
            validateBlazeResponse(loginSessionRiskResponse);
            logger.debug("loginSessionRiskResponse {}",loginSessionRiskResponse);
            return loginSessionRiskResponse;
        } catch (WUServiceException e) {
            throw  e;
        }

    }

    private void blazeCustomerVerificationStatusSubflow(SignOnRequest request, TransactionData incomingRequestDetails, String countryCode, String idvStatus) {
        logger.info("Executing blaze-customer-verification-status-subflow...");
        //set application headers
        try {
        String BASE_URL = BLAZE_URL + BLAZE_CSVL_INIT_PATH;
        BlazeRequest cvslRequest = blazeRequestBuilder.buildBlazeCvslRequest(request.getSessionId(), request.getCustomerUmn(),
                request.getLoginAuthType(), countryCode, request.getAuthenticationKey(), request.getClientIp(),idvStatus);
            BlazeResponse blazeResponse = blaze.sendPostRequest(BASE_URL, cvslRequest, incomingRequestDetails, BlazeResponse.class, BLAZE_CUSTOMER_VERIFICATION_SERVICE);
            validateBlazeResponse(blazeResponse);
        } catch (WUServiceException e) {
            throw  e;
        }

    }

    private void validateBlazeResponse(BlazeResponse response) {

        String responseCode = response.getRiskMessageEnvelope().getData().getResponseCode();
        if (!"000000".equals(responseCode)) {
            throw exceptionUtils.prepareWuException(APP_BLAZE_ERROR, new RuntimeException(BLAZE_CUSTOMER_VERIFICATION_SERVICE), WUExceptionType.SERVER);
        }
    }

}
