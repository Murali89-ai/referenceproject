package com.wu.brwallet.customer.profile.service.initcusverify;

import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.mapper.initcusverify.BlazeResponseMapper;
import com.wu.brwallet.customer.profile.model.common.blaze.BlazeResponse;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.CustomerInitiationRequest;
import com.wu.brwallet.customer.profile.model.response.initiateCusVerify.CustomerInitiationResponse;
import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerVerificationInitiationService {

    @Autowired
    private CustomerInitService customerInitService;

    @Autowired
    private CustomerCsvlService customerCsvlService;

    @Autowired
    private CustomerOtpService customerOtpService;

    @Autowired
    private WUServiceExceptionUtils exceptionUtils;

    @Autowired
    private BlazeResponseMapper blazeResponseMapper;

    private static final Logger logger = LoggerFactory.getLogger(CustomerVerificationInitiationService.class);


    @LoggingAnnotation
    public CustomerInitiationResponse getCustomerVerification(CustomerInitiationRequest request, TransactionData incomingRequestDetails) {
        BlazeResponse customerOtpResponse = null;
        try {
            BlazeResponse customerInitResponse = customerInitService.initiateCustomerVerification(request, incomingRequestDetails);
            logger.info("response received from custInit : {}", customerInitResponse);
            BlazeResponse customerCsvlResponse = customerCsvlService.initiateCustomerStatusLookup(request, incomingRequestDetails);
            logger.info("response received from custCsvl : {}", customerCsvlResponse);
            customerOtpResponse = customerOtpService.initiateCustomerOtpNotification(request, incomingRequestDetails);
            logger.info("response received from custOtp : {}", customerOtpResponse);
            return blazeResponseMapper.mapBlazeResponse(request,customerCsvlResponse);
        } catch (WUServiceException wuEx) {
            throw wuEx;
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            throw exceptionUtils.prepareWuException(BusinessConstants.GENERIC_EXCEPTION, ex, WUExceptionType.SERVER);
        }

    }
}

