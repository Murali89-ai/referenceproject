package com.wu.brwallet.customer.profile.service.initcusverify;

import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.adaptor.Blaze;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.mapper.initcusverify.BusinessEventCustInitMapper;
import com.wu.brwallet.customer.profile.mapper.initcusverify.CustomerInitiationToBlazeOtpMapper;
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

import java.util.Objects;

import static com.wu.brwallet.customer.profile.constants.BusinessConstants.APP_BLAZE_ERROR;
import static com.wu.brwallet.customer.profile.constants.BusinessConstants.BLAZE_CUSTOMER_OTP_SERVICE;

@Service
public class CustomerOtpService {

    @Autowired
    private Blaze blaze;

    @Autowired
    private CustomerInitiationToBlazeOtpMapper blazeOtpNotificationMapper;

    @Value("${blaze.url}")
    private String BLAZE_URL;

    @Value("${blaze.otp.init.path}")
    private String BLAZE_OTP_INIT_PATH;

    @Autowired
    private BusinessEventService businessEventService;

    @Autowired
    private BusinessEventCustInitMapper businessEventMapper;

    @Autowired
    private WUServiceExceptionUtils exceptionUtils;

    private static final Logger logger = LoggerFactory.getLogger(CustomerOtpService.class);

    private BlazeResponse response=null;

    @Value("${blaze.environment}")
    private String environment;

    @LoggingAnnotation
    public BlazeResponse initiateCustomerOtpNotification(CustomerInitiationRequest request, TransactionData incomingRequestDetails) {
        String BASE_URL = BLAZE_URL + BLAZE_OTP_INIT_PATH;
        try {
            BlazeRequest blazeRequest= blazeOtpNotificationMapper.mapBlazeOtpNotificationRequest(request,environment);
            response = blaze.sendPostRequest(BASE_URL,blazeRequest, incomingRequestDetails, BlazeResponse.class,BLAZE_CUSTOMER_OTP_SERVICE);
            validateResponse(response);
            BusinessEventData businessEventData = businessEventMapper.getBusinessEventRequest(request);
            businessEventService.sendEvent(BusinessConstants.INITIATECUSVVERIFY_BUSINESS_EVENT_CODE,businessEventData,incomingRequestDetails);
            return response;
        } catch (WUServiceException e) {
            throw  e;
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            throw exceptionUtils.prepareWuException(BusinessConstants.GENERIC_EXCEPTION, ex, WUExceptionType.SERVER);
        }
    }

    private void validateResponse(BlazeResponse response) {

        if(!Objects.equals(response.getRiskMessageEnvelope().getData().getResponseCode(), "000000")){
            throw exceptionUtils.prepareWuException(APP_BLAZE_ERROR, new RuntimeException(BLAZE_CUSTOMER_OTP_SERVICE), WUExceptionType.SERVER);
        }
    }
}
