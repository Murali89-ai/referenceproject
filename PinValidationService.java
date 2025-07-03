package com.wu.brwallet.customer.profile.service.validatepin;
import com.wu.brwallet.customer.profile.kafka.producer.KafkaProducer;
import com.wu.brwallet.customer.profile.adaptor.Mambu;
import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.mapper.common.ErrorResponseMapper;
import com.wu.brwallet.customer.profile.model.common.error.ErrorResponse;
import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.common.mambu.MambuChangePinResponse;
import com.wu.brwallet.customer.profile.model.request.changepin.ChangePinRequest;
import com.wu.brwallet.customer.profile.model.request.validatepin.PinValidationRequest;
import com.wu.brwallet.customer.profile.model.response.changepin.ChangePinResponse;
import com.wu.brwallet.customer.profile.model.response.validatepin.MambuClientResponse;
import com.wu.brwallet.customer.profile.model.response.validatepin.PinValidationResponse;
import com.wu.brwallet.customer.profile.service.common.BusinessEventService;
import com.wu.brwallet.customer.profile.util.BusinessEventBuilderUtility;
import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import static com.wu.brwallet.customer.profile.constants.BusinessConstants.*;


@RequiredArgsConstructor
@Service
public class PinValidationService {

    private static final Logger log = LogManager.getLogger(PinValidationService.class);

    @Autowired
    private Mambu mambu;

    @Autowired
    private EncryptionService encryptionService;

    @Autowired
    private BusinessEventService businessEventService;

    @Autowired
    private WUServiceExceptionUtils wuServiceExceptionUtils;

    @Autowired
    private ErrorResponseMapper errorResponseMapper;
  @Autowired
    private BusinessEventBuilderUtility businessEventBuilderUtility;
  @Autowired
    private KafkaProducer kafkaProducer;
//    @Autowired
//    private KafkaProducerHelper kafkaProducerHelper;

    @LoggingAnnotation
    public ResponseEntity<?> validatePin(PinValidationRequest request, TransactionData transactionData) {
        log.info("Started :: orchestration flow to validate Pin in Mambu");

//        ErrorResponse.Errors validationErrors = errorResponseMapper.validateRequest(request, transactionData);
        ErrorResponse validationErrorResponse = errorResponseMapper.validateRequest(request, transactionData);
        if (validationErrorResponse != null &&  !validationErrorResponse.getErrors().isEmpty()) {
            log.error("Invalid data provided: cardId is missing");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(validationErrorResponse);
        }
        MambuClientResponse mambuClientResponse = mambu.getClientDetails(request.getCustomerUmn(), transactionData);
        log.debug("MambuClientResponse: {}", mambuClientResponse);
        BusinessEventData businessEventData = buildMambuClientBusinessEvent(request.getCustomerUmn());
        businessEventService.sendEvent(BusinessConstants.VALIDATEPIN_BUSINESS_EVENT_CODE, businessEventData, transactionData);
        log.info("BusinessEventData: {}", businessEventData);
        if (mambuClientResponse.getPayload().isEmpty()) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponseMapper.pinNotPresent(transactionData));
        }

        MambuClientResponse.ClientDetails client = mambuClientResponse.getPayload().get(0);

        String storedPin = client.get_profile().getCustomerPin();

        if (!StringUtils.hasLength(storedPin)) {
            log.info("PIN is not present in Mambu");
            Exception e = new Exception("PIN is not present in Mambu");
            throw wuServiceExceptionUtils.prepareWuException(BusinessConstants.PIN_NOT_PRESENT,e, WUExceptionType.SERVER );
        }

        String decryptedPin = decryptPin(storedPin).replaceAll("\"", "");

        log.info("Ended :: Orchestration flow to validate Pin in Mambu");
        if (request.getPin().equals(decryptedPin)) {
            log.info("Entered PIN is valid");
            return ResponseEntity.ok(new PinValidationResponse("Success"));
        }else{
            log.info("Entered PIN is not valid");
            ErrorResponse InvalidPinErrorResponse = errorResponseMapper.buildInvalidatePinErrorResponse(transactionData);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(InvalidPinErrorResponse);
        }
    }

    @LoggingAnnotation
    private String decryptPin(String encryptedPin) {
        log.info("Attempt to decrypt PIN - Start");
            log.info("Started :: decrypting pin");
            String decryptedPin = encryptionService.decrypt(encryptedPin);
            log.info("Decrypted pin is : {}", decryptedPin);
            return decryptedPin;
    }

    private BusinessEventData buildMambuClientBusinessEvent(String customerUmn){
        return BusinessEventData.builder()
                .targetSystem(AppConstants.MAMBU_GETCLIENT_BUSINESS_EVENT_TARGET_SYSTEM)
                .sourceSystem(AppConstants.MAMBU_GETCLIENT_BUSINESS_EVENT_SOURCE)
                .eventStage(AppConstants.MAMBU_GETCLIENT_BUSINESS_EVENT_EVENT_STAGE)
                .description(AppConstants.MAMBU_GETCLIENT_BUSINESS_EVENT_DESCRIPTION)
                .flowName(AppConstants.MAMBU_GETCLIENT_FLOW_NAME)
                .processName(AppConstants.PROCESS_NAME)
                .customerUmn(customerUmn)
                .build();
    }

    @LoggingAnnotation
    public ResponseEntity<?> changePin(ChangePinRequest changePinRequest, TransactionData incomingRequestDetails) {

        ErrorResponse validationErrorResponse = errorResponseMapper.validateChangePinRequest(changePinRequest, incomingRequestDetails);
        if (validationErrorResponse != null &&  !validationErrorResponse.getErrors().isEmpty()) {
            log.error("Invalid data provided: cardId is missing");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(validationErrorResponse);
        }

            MambuClientResponse mambuClientResponse = mambu.getClientDetails(changePinRequest.getCustomerUmn(), incomingRequestDetails);

            if (mambuClientResponse.getPayload().isEmpty()) {
                log.error("Client not found in mambu with provided UMN");
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponseMapper.pinNotPresent(incomingRequestDetails));
            }

            ChangePinResponse mambuChangePinResponse = mambu.mambuPinUpdate(changePinRequest, incomingRequestDetails,mambuClientResponse.getPayload().get(0).getId());
            BusinessEventData ucdUpdateEventRequest = businessEventBuilderUtility.buildMambuChangePinBusinessEvent(changePinRequest);
            businessEventService.sendEvent(CHANGEPIN_BUSINESS_EVENT_CODE, ucdUpdateEventRequest, incomingRequestDetails);

            kafkaProducer.sendMessage(changePinRequest, incomingRequestDetails);
            return ResponseEntity.status(HttpStatus.OK).body(mambuChangePinResponse);

//            log.error("Empty data provided for field Customer UMN or CPF Number");
//            return ChangePinResponse.builder()
//                    .success(true)
//                    .httpStatus(500)
//                    .message("Change pin Failed")
//                    .correlationId(incomingRequestDetails.getCorrelationId())
//                    .externalRefId(incomingRequestDetails.getExternalRefId())
//                    .build();
    }

}