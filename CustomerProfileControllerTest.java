package com.wu.brwallet.customer.profile.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.request.initcusverify.customer.CustomerInitiationRequest;
import com.wu.brwallet.customer.profile.model.request.registerDevice.RegisterDeviceRequest;
import com.wu.brwallet.customer.profile.model.request.signon.customer.SignOnRequest;
import com.wu.brwallet.customer.profile.model.request.updateDevice.UpdateDeviceRequest;
import com.wu.brwallet.customer.profile.model.request.validatepin.PinValidationRequest;
import com.wu.brwallet.customer.profile.model.response.initiateCusVerify.CustomerInitiationResponse;
import com.wu.brwallet.customer.profile.model.response.signon.SignOnResponse;
import com.wu.brwallet.customer.profile.model.response.updateDevice.UpdateDeviceResponse;
import com.wu.brwallet.customer.profile.model.response.validatepin.PinValidationResponse;
import com.wu.brwallet.customer.profile.service.device.CustomerDeviceService;
import com.wu.brwallet.customer.profile.service.initcusverify.CustomerVerificationInitiationService;
import com.wu.brwallet.customer.profile.service.registration.CustomerRegistrationService;
import com.wu.brwallet.customer.profile.service.signon.CustomerSignOnService;
import com.wu.brwallet.customer.profile.service.validatepin.PinValidationService;
import com.wu.era.library.auth.AuthException;
import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class CustomerProfileControllerTest {

    @Mock
    private WUServiceExceptionUtils exceptionUtils;

    @Mock
    private CustomerVerificationInitiationService customerInitiationService;

    @Mock
    private PinValidationService pinValidationService;

    @Mock
    private CustomerRegistrationService registrationService;

    @Mock
    private CustomerSignOnService customerSignOnService;

    @Mock
    private CustomerDeviceService customerDeviceService;

    @InjectMocks
    private CustomerProfileController customerProfileController;

    private TransactionData transactionData;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        transactionData = new TransactionData();
        transactionData.setCorrelationId("test-correlation-id");
    }

    @Test
    void initiateCustomerVerification_WhenServiceThrowsException_ShouldPropagateWUServiceException() {
        CustomerInitiationRequest request = new CustomerInitiationRequest();
        when(customerInitiationService.getCustomerVerification(any(), any()))
            .thenThrow(new WUServiceException());

        assertThrows(WUServiceException.class, () ->
            customerProfileController.initiateCustomerVerification(request, transactionData));
    }

    @Test
    void customerSignOn_WithValidCredentials_ShouldReturnSuccessResponse() throws JAXBException, AuthException, ExecutionException {
        SignOnRequest request = new SignOnRequest();
        SignOnResponse expectedResponse = new SignOnResponse();

        // Uncomment this line to properly mock the service behavior
        when(customerSignOnService.getCustomerSignOn(any(), any())).thenReturn(expectedResponse);

        ResponseEntity<?> response = customerProfileController.customerSignOn(request, transactionData);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        // Add this line to verify the response body matches the expected response
        assertEquals(expectedResponse, response.getBody());
    }


    @Test
    void registerCustomer_WithNullRequest_ShouldThrowException() throws JsonProcessingException {
        when(registrationService.registerCustomer(null, transactionData))
            .thenThrow(new IllegalArgumentException());

        assertThrows(Exception.class, () ->
            customerProfileController.registerCustomer(null, transactionData));
    }

    @Test
    void customerSignOn_WithValidCredentials_ShouldReturnSuccessResponse1() throws JAXBException, AuthException, ExecutionException {
        SignOnRequest request = new SignOnRequest();
        SignOnResponse expectedResponse = new SignOnResponse();

        ResponseEntity<?> response = customerProfileController.customerSignOn(request, transactionData);

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    void registerDevice_WithInvalidRequest_ShouldThrowException() throws AuthException, ExecutionException {
        RegisterDeviceRequest request = new RegisterDeviceRequest();
        when(customerDeviceService.registerDevice(any(), any()))
            .thenThrow(new IllegalStateException());

        assertThrows(Exception.class, () ->
            customerProfileController.registerDevice(request, transactionData));
    }

    @Test
    void updateDevice_WithValidRequest_ShouldReturnSuccessResponse() {
        UpdateDeviceRequest request = new UpdateDeviceRequest();
        UpdateDeviceResponse expectedResponse = new UpdateDeviceResponse();
        when(customerDeviceService.updateDevice(any(), any())).thenReturn(expectedResponse);

        ResponseEntity<UpdateDeviceResponse> response = customerProfileController.updateDevice(request, transactionData);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedResponse, response.getBody());
    }

    @Test
    void initiateCustomerVerification_WithValidRequest_ShouldReturnSuccessResponse() {
        CustomerInitiationRequest request = new CustomerInitiationRequest();
        CustomerInitiationResponse expectedResponse = new CustomerInitiationResponse();
        when(customerInitiationService.getCustomerVerification(any(), any())).thenReturn(expectedResponse);

        ResponseEntity<?> response = customerProfileController.initiateCustomerVerification(request, transactionData);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(expectedResponse, response.getBody());
    }

    @Test
    void validatePin_WhenGenericExceptionOccurs_ShouldThrowWUServiceException() {
        PinValidationRequest request = new PinValidationRequest();
        when(pinValidationService.validatePin(any(), any()))
            .thenThrow(new RuntimeException("Unexpected error"));
        when(exceptionUtils.prepareWuException((String) any(), (Exception) any(), (WUExceptionType) any(), (String[]) any()))
            .thenReturn(new WUServiceException());

        assertThrows(WUServiceException.class, () ->
            customerProfileController.validatePin(request, transactionData));
    }
}
