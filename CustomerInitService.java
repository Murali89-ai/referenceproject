package com.wu.brwallet.customer.profile.service.initcusverify;

import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.adaptor.Blaze;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.mapper.initcusverify.BusinessEventCustInitMapper;
import com.wu.brwallet.customer.profile.mapper.initcusverify.CustomerInitRequestMapper;
import com.wu.brwallet.customer.profile.model.common.blaze.BlazeRequest;
import com.wu.brwallet.customer.profile.model.common.blaze.BlazeResponse;
import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.CustomerInitiationRequest;
import com.wu.brwallet.customer.profile.service.common.BusinessEventService;
import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.wu.brwallet.customer.profile.constants.BusinessConstants.APP_BLAZE_ERROR;
import static com.wu.brwallet.customer.profile.constants.BusinessConstants.BLAZE_CUSTOMER_VERIFICATION_INITIALIZATION;


@Service
public class CustomerInitService {

    @Autowired
    private Blaze blaze;

    @Autowired
    private CustomerInitRequestMapper customerToBlazeRequestMapper;

    @Value("${blaze.url}")
    private String BLAZE_URL;

    @Value("${blaze.init.path}")
    private String BLAZE_INIT_PATH;

    @Autowired
    private BusinessEventService businessEventService;

    @Autowired
    private BusinessEventCustInitMapper businessEventMapper;

    @Autowired
    private WUServiceExceptionUtils exceptionUtils;

    private static final Logger logger = LoggerFactory.getLogger(CustomerInitService.class);

    @Value("${blaze.environment}")
    private String environment;

    @LoggingAnnotation
    public BlazeResponse initiateCustomerVerification(CustomerInitiationRequest request, TransactionData incomingRequestDetails) {
        logger.info("starting initiateCustomerVerification()");
        String BASE_URL = BLAZE_URL + BLAZE_INIT_PATH;
        try {
            BlazeRequest blazeRequest = customerToBlazeRequestMapper.toBlazeCustInitRequest(request,environment);
            BlazeResponse response = blaze.sendPostRequest(BASE_URL, blazeRequest, incomingRequestDetails, BlazeResponse.class,BLAZE_CUSTOMER_VERIFICATION_INITIALIZATION);
            logger.info("response received from custInitVerify : {}", response);
            validateResponse(response);
            BusinessEventData businessEventData = businessEventMapper.getBusinessEventRequest(request);
            businessEventService.sendEvent(BusinessConstants.INITIATECUSVVERIFY_BUSINESS_EVENT_CODE, businessEventData, incomingRequestDetails);
            return response;
        } catch (WUServiceException e) {
            throw  e;
        } catch (Exception ex) {
            logger.error(ex.getMessage());
           throw exceptionUtils.prepareWuException(BusinessConstants.GENERIC_EXCEPTION, ex, WUExceptionType.SERVER);
        }
    }

    private void validateResponse(BlazeResponse response) {

        boolean isValidResponse = isValidBlazeResponse(response);
        if (!isValidResponse) {
            throw exceptionUtils.prepareWuException(APP_BLAZE_ERROR, new RuntimeException(BLAZE_CUSTOMER_VERIFICATION_INITIALIZATION), WUExceptionType.SERVER);
        }
    }

    private boolean isValidBlazeResponse(BlazeResponse response) {
        if (Optional.ofNullable(response).isEmpty()
                || Optional.ofNullable(response.getRiskMessageEnvelope()).isEmpty()
        || Optional.ofNullable(response.getRiskMessageEnvelope().getData()).isEmpty()
        ||Optional.ofNullable(response.getRiskMessageEnvelope().getData().getResponseCode()).isEmpty()
        || Optional.ofNullable(response.getRiskMessageEnvelope().getData().getRiskDecision()).isEmpty()
        || Optional.ofNullable(response.getRiskMessageEnvelope().getData().getRiskDecision().getDecisionResponseCode()).isEmpty()) {
            return false;
        }
        String responseCode = response.getRiskMessageEnvelope().getData().getResponseCode();
            String decisionCode = response.getRiskMessageEnvelope().getData().getRiskDecision().getDecisionResponseCode();
        return ("003083".equals(responseCode) && "003083".equals(decisionCode)) ||
                ("002083".equals(responseCode) && "002083".equals(decisionCode));
    }
}