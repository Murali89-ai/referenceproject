package com.wu.brwallet.customer.profile.controller;

import com.wu.brwallet.customer.profile.aop.LogControllerEntryExit;
import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.request.changepin.ChangePinRequest;
import com.wu.brwallet.customer.profile.model.request.customerRegister.CustomerRegisterRequest;
import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.CustomerInitiationRequest;
import com.wu.brwallet.customer.profile.model.request.registerDevice.RegisterDeviceRequest;
import com.wu.brwallet.customer.profile.model.request.signon.customer.SignOnRequest;
import com.wu.brwallet.customer.profile.model.request.updateDevice.UpdateDeviceRequest;
import com.wu.brwallet.customer.profile.model.response.changepin.ChangePinResponse;
import com.wu.brwallet.customer.profile.model.response.registerDevice.RegisterDeviceResponse;
import com.wu.brwallet.customer.profile.model.response.signon.SignOnResponse;
import com.wu.brwallet.customer.profile.model.request.validatepin.PinValidationRequest;
import com.wu.brwallet.customer.profile.model.response.initiateCusVerify.CustomerInitiationResponse;
import com.wu.brwallet.customer.profile.model.response.registration.CustomerRegisterResponse;
import com.wu.brwallet.customer.profile.model.response.updateDevice.UpdateDeviceResponse;
import com.wu.brwallet.customer.profile.model.response.validatepin.PinValidationResponse;
import com.wu.brwallet.customer.profile.service.device.CustomerDeviceService;
import com.wu.brwallet.customer.profile.service.initcusverify.CustomerVerificationInitiationService;
import com.wu.brwallet.customer.profile.service.registration.CustomerRegistrationService;
import com.wu.brwallet.customer.profile.service.signon.CustomerSignOnService;
import com.wu.brwallet.customer.profile.service.validatepin.PinValidationService;
import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.wu.brwallet.customer.profile.constants.BusinessConstants.GENERIC_INTERNAL_SERVER_ERROR;


@RestController
@RequestMapping("/v2/cus/customer")
public class CustomerProfileController {

    @Autowired
    private WUServiceExceptionUtils exceptionUtils;

    @Autowired
    private CustomerVerificationInitiationService customerInitiationService;

    @Autowired
    private PinValidationService pinValidationService;

    @Autowired
    private CustomerRegistrationService registrationService;

    @Autowired
    private CustomerSignOnService customerSignOnService;

    @Autowired
    private CustomerDeviceService customerDeviceService;

    private static final Logger logger = LoggerFactory.getLogger(CustomerProfileController.class);

    @LogControllerEntryExit
    @PostMapping("/initiatevcusverify")
    public ResponseEntity<?> initiateCustomerVerification(@RequestBody CustomerInitiationRequest customerInitiationRequest, @RequestAttribute("transactionData") TransactionData incomingRequestDetails) {

        try {
            CustomerInitiationResponse response=customerInitiationService.getCustomerVerification(customerInitiationRequest, incomingRequestDetails);
            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (WUServiceException wuEx) {
            throw wuEx;
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            throw exceptionUtils.prepareWuException(GENERIC_INTERNAL_SERVER_ERROR, ex, WUExceptionType.SERVER,new String[] {"Controller_Initiate"});

        }
    }

    @LogControllerEntryExit
    @PostMapping("/validatePin")
    public ResponseEntity<?> validatePin(
            @RequestBody PinValidationRequest request,
            @RequestAttribute("transactionData") TransactionData incomingRequestDetails) {

        logger.info("Received PIN validation request for correlationId: {}", incomingRequestDetails.getCorrelationId());

        try{
            //PinValidationResponse response = pinValidationService.validatePin(request, incomingRequestDetails);
            logger.info("Sending PIN validation response for correlationId: {}", incomingRequestDetails.getCorrelationId());

            return pinValidationService.validatePin(request, incomingRequestDetails);
          //  return ResponseEntity.ok(response);
        } catch (WUServiceException wuEx) {
            throw wuEx;
        } catch (Exception e) {
            logger.error("Exception in Customer Profile Controller Validate pin: {}", e.getMessage());
            throw exceptionUtils.prepareWuException(GENERIC_INTERNAL_SERVER_ERROR, e, WUExceptionType.SERVER,new String[] {"Controller_ValidatePin"});
        }
    }

    @LogControllerEntryExit
    @PostMapping("/register")
    public ResponseEntity<CustomerRegisterResponse> registerCustomer(@Valid @RequestBody CustomerRegisterRequest request, @RequestAttribute("transactionData") TransactionData incomingRequestDetails)  {
        logger.info("Received customer registartion request for correlationId: {}", incomingRequestDetails.getCorrelationId());
       try{
        CustomerRegisterResponse response = registrationService.registerCustomer(request,incomingRequestDetails);
           logger.info("Sending customer registartion response for correlationId: {}", incomingRequestDetails.getCorrelationId());
        return ResponseEntity.ok(response);

    } catch (WUServiceException wuEx) {
        throw wuEx;
    } catch (Exception e) {
        logger.error("Exception in Customer Profile Controller Register Customer: {}", e.getMessage());
        throw exceptionUtils.prepareWuException(GENERIC_INTERNAL_SERVER_ERROR, e, WUExceptionType.SERVER,new String[] {"Controller_RegisterCustomer"});
    }
    }

    @LogControllerEntryExit
    @PostMapping("/login")
    public ResponseEntity<?> customerSignOn(@Valid @RequestBody  SignOnRequest request,
                                            @RequestAttribute("transactionData") TransactionData incomingRequestDetails) {


        try {
            SignOnResponse response= customerSignOnService.getCustomerSignOn(request,incomingRequestDetails);
            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (WUServiceException wuEx) {
            throw wuEx;
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            throw exceptionUtils.prepareWuException(GENERIC_INTERNAL_SERVER_ERROR, ex, WUExceptionType.SERVER,new String[] {"Controller_Login"});

        }
    }

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/registerDevice",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    @LogControllerEntryExit
    public ResponseEntity<RegisterDeviceResponse> registerDevice(
            @Valid  @RequestBody RegisterDeviceRequest registerDeviceRequest,
            @RequestAttribute("transactionData") TransactionData incomingRequestDetails) {
        logger.info("Received register device request for correlationId: {}", incomingRequestDetails.getCorrelationId());
        try {
            RegisterDeviceResponse response = customerDeviceService.registerDevice(registerDeviceRequest, incomingRequestDetails);
            logger.info("Sending register device response for correlationId: {}", incomingRequestDetails.getCorrelationId());
            return ResponseEntity.ok(response);
        } catch (WUServiceException wuEx) {
            throw wuEx;
        } catch (Exception e) {
            logger.error("Exception in Customer Profile Controller Register Device: {}", e.getMessage());
            throw exceptionUtils.prepareWuException(GENERIC_INTERNAL_SERVER_ERROR, e, WUExceptionType.SERVER,new String[] {"Controller_RegisterDevice"});
        }
    }

    @RequestMapping(
            value = "/updateDevice",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    @LogControllerEntryExit
    public ResponseEntity<UpdateDeviceResponse> updateDevice(
           @Valid @RequestBody UpdateDeviceRequest updateDeviceRequest,
            @RequestAttribute("transactionData") TransactionData incomingRequestDetails) {
        logger.info("Received update device request for correlationId: {}", incomingRequestDetails.getCorrelationId());
        try {
            UpdateDeviceResponse response = customerDeviceService.updateDevice(updateDeviceRequest, incomingRequestDetails);
            logger.info("Sending update device response for correlationId: {}", incomingRequestDetails.getCorrelationId());
            return ResponseEntity.ok(response);
        } catch (WUServiceException wuEx) {
            throw wuEx;
        } catch (Exception e) {
            logger.error("Exception in Customer Profile Controller Update Device: {}", e.getMessage());
            throw exceptionUtils.prepareWuException(GENERIC_INTERNAL_SERVER_ERROR, e, WUExceptionType.SERVER,new String[] {"Controller_UpdateDevice"});
        }
    }

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/changepin",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    @LogControllerEntryExit
    public ResponseEntity<?> changePin(
            @RequestBody ChangePinRequest changePinRequest,
            @RequestAttribute("transactionData") TransactionData incomingRequestDetails) {
        logger.info("Received change pin request for correlationId: {}", incomingRequestDetails.getCorrelationId());
        try {
            logger.info("Sending change pin response for correlationId: {}", incomingRequestDetails.getCorrelationId());
            return pinValidationService.changePin(changePinRequest, incomingRequestDetails);
        } catch (WUServiceException wuEx) {
            throw wuEx;
        } catch (Exception e) {
            logger.error("Exception in Customer Profile Controller Change Pin: {}", e.getMessage());
            throw exceptionUtils.prepareWuException(GENERIC_INTERNAL_SERVER_ERROR, e, WUExceptionType.SERVER,new String[] {"Controller_ChangePin"});
        }
    }


}
