package com.wu.brwallet.customer.profile.kafka.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wu.brwallet.customer.profile.adaptor.Biz;
import com.wu.brwallet.customer.profile.adaptor.CustomerNotification;
import com.wu.brwallet.customer.profile.adaptor.Mambu;
import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.constants.AppConstants;
import com.wu.brwallet.customer.profile.model.common.kafka.BusinessEventData;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.request.biz.BizChangePinRequest;
import com.wu.brwallet.customer.profile.model.request.changepin.ChangePinRequest;
import com.wu.brwallet.customer.profile.model.response.biz.BizGetCardDetailsResponse;
import com.wu.brwallet.customer.profile.model.response.validatepin.MambuClientResponse;
import com.wu.brwallet.customer.profile.model.retry.RetryDetails;
import com.wu.brwallet.customer.profile.model.retry.RetryKey;
import com.wu.brwallet.customer.profile.service.common.BusinessEventService;
import com.wu.brwallet.customer.profile.util.BusinessEventBuilderUtility;
import com.wu.era.kafka.consumer.*;
import com.wu.era.kafka.consumer.config.KafkaConsumerConfig;
import com.wu.era.library.redis.sb.utils.RedisSBUtil;
import jakarta.annotation.PostConstruct;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.listener.DefaultErrorHandler;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.backoff.ExponentialBackOff;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import static com.wu.brwallet.customer.profile.constants.AppConstants.CORRELATION_ID_KEY;
import static com.wu.brwallet.customer.profile.constants.AppConstants.REDIS_PREFIX_KEY;
import static com.wu.brwallet.customer.profile.constants.BusinessConstants.CHANGEPIN_BUSINESS_EVENT_CODE;
import static com.wu.era.kafka.consumer.model.Header.HEADERS.CorrelationId;

@Service
public class KafkaConsumerImpl implements IKafkaRetryRecordManualConsumer {
    private static final Logger logger = LogManager.getLogger(KafkaConsumerImpl.class);

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private Biz bizClient;

    @Autowired
    private BusinessEventService businessEventService;

    @Autowired
    private Mambu mambuClient;

    @Autowired
    private CustomerNotification customerNotification;

    @Autowired
    private BusinessEventBuilderUtility businessEventBuilderUtility;

    @Autowired
    private RedisSBUtil redisSBUtil;

    @Autowired
    public KafkaConsumerConfig kafkaConsumerConfig;

    @Value("${kafka.consumer.retry.max.elapsed.time.millis:30000}")
    private long maxElapsedTime;

    @PostConstruct
    public void postConstruct() {
        init();
    }

    void init(){
        ExponentialBackOff exponentialBackOff = new ExponentialBackOff(100L, (double)2.0F);
        exponentialBackOff.setMaxElapsedTime(maxElapsedTime);
        DefaultErrorHandler errorHandler = new DefaultErrorHandler((record, exception) -> {
            logger.info("***In recovery call back post to DLQ topic : " + record.value());
        }, exponentialBackOff);
        this.kafkaConsumerConfig.retryKafkaListenerContainerFactory().setCommonErrorHandler(errorHandler);
    }

    @LoggingAnnotation
    @Override
    @Async
    public void sendObject(String payLoad, ConsumerRecord<?, ?> consumerRecord, Map<String, String> headers, Acknowledgment ack) {
        logger.info("KafkaConsumerImpl.sendObject reecived request {} {}",payLoad,headers);

        try {
            process(payLoad, headers);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }

        ack.acknowledge();
    }

    /**
     * @param payLoad
     * @param headers
     */
    @Override
    @LoggingAnnotation
    @Async
    public void sendRetryObject(String payLoad, Map<String, String> headers) {
        logger.info("KafkaConsumerImpl.sendRetryObject reecived request {} {}",payLoad,headers);

        try {
            process(payLoad, headers);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }


    }

    @LoggingAnnotation
    private void process(String payLoad, Map<String, String> headers) throws InterruptedException, IOException {
        MDC.put(CORRELATION_ID_KEY, headers.get(CorrelationId));

        String jsonPayload = payLoad.replace("\\", "");
        if (jsonPayload.startsWith("\"") && jsonPayload.endsWith("\"")) {
            jsonPayload = jsonPayload.substring(1, jsonPayload.length() - 1);
        }

        ChangePinRequest changePinRequest = objectMapper.readValue(jsonPayload, ChangePinRequest.class);
        TransactionData transactionData = getHeaders(headers);

        RetryDetails retryDetails = redisSBUtil.getObject(REDIS_PREFIX_KEY+transactionData.getExternalRefId(), RetryDetails.class, false);

        if (retryDetails == null) {
            logger.info("Retry Details is null");
            retryDetails = new RetryDetails();
            RetryKey retryKey = new RetryKey();
            retryKey.setCusnotifySuccess(false);
            retryKey.setBizPinUpdateSuccess(false);
            retryDetails.setRetryKey(retryKey);
        }
        logger.info("Redis Response :: {}", retryDetails.toString());

        if (!retryDetails.getRetryKey().getBizPinUpdateSuccess()) {
            logger.info("Started :: change pin subscriber flow :: CorrelationId:" + transactionData.getCorrelationId());
            logger.info("Started :: biz change pin orchestration :: CorrelationId: " + transactionData.getCorrelationId());
            MambuClientResponse mambuClientResponse = mambuClient.getClientDetails(changePinRequest.getCustomerUmn(), transactionData);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            OffsetDateTime requestTimestamp = OffsetDateTime.parse(transactionData.getStartTime(), formatter);
            OffsetDateTime lastPinUpdatedDate = OffsetDateTime.parse(mambuClientResponse.getPayload().get(0).get_profile().getLastPinUpdatedDate(), formatter);

            if (!requestTimestamp.isAfter(lastPinUpdatedDate)) {
                BizGetCardDetailsResponse bizGetCardDetailsResponse = bizClient.getCardDetails(changePinRequest.getCpfNumber(), transactionData);

                BusinessEventData ucdUpdateEventRequest = businessEventBuilderUtility.buildBizCardDetailsBusinessEvent(changePinRequest, changePinRequest.getCustomerUmn());
                businessEventService.sendEvent(CHANGEPIN_BUSINESS_EVENT_CODE, ucdUpdateEventRequest, transactionData);

                for (BizGetCardDetailsResponse.CardContent cardContent : bizGetCardDetailsResponse.getContent()) {
                    if (cardContent.getStatusGroupId() != Integer.parseInt(AppConstants.CANCELLED_STATUS_GROUP_ID)) {
                        logger.info("Changing PIN for Card : " + bizGetCardDetailsResponse);
                        String cardId = cardContent.getCardId();
                        BizChangePinRequest bizChangePinRequest = new BizChangePinRequest();
                        bizChangePinRequest.setPin(changePinRequest.getPin());
                        bizClient.bizChangePin(bizChangePinRequest, cardId, transactionData);

                        BusinessEventData changePinEventRequest = businessEventBuilderUtility.buildBizChangePinBusinessEvent(changePinRequest);
                        businessEventService.sendEvent(CHANGEPIN_BUSINESS_EVENT_CODE, changePinEventRequest, transactionData);
                    } else {
                        logger.info("Skipped card with StatusGroupId = 3");
                    }
                }
            } else {
                logger.info("Skipping pin update since new pin is set");
            }

            BusinessEventData ucdUpdateEventRequest = businessEventBuilderUtility.buildCustomerNotificationBusinessEvent();
            businessEventService.sendEvent(CHANGEPIN_BUSINESS_EVENT_CODE, ucdUpdateEventRequest, transactionData);

            logger.debug("After KafkaConsumerImpl.sendObject call");
            System.out.println("consumer Resp" + changePinRequest.toString());

            logger.info("Ended :: biz change pin orchestration :: CorrelationId: " + transactionData.getCorrelationId());

        } else {
            logger.info("Biz pin update call skipped");
        }

        if (!retryDetails.getRetryKey().getCusnotifySuccess()) {
            customerNotification.customerNotificationCall(changePinRequest.getCustomerUmn(), transactionData);
        }

    }




    public TransactionData getHeaders(Map<String,String> header){
        TransactionData transactionData=new TransactionData();
        transactionData.setExternalRefId(header.get("ExternalRefId"));
        transactionData.setCorrelationId(header.get("CorrelationId"));
        transactionData.setXAPIKey(header.get("ApiKey"));
        transactionData.setServiceId(header.get("cuszprfl"));

        java.time.ZonedDateTime saoPauloTime = java.time.ZonedDateTime.now(java.time.ZoneId.of("America/Sao_Paulo"));
        String formattedTimestamp = saoPauloTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss.SSSxxx"));
        transactionData.setStartTime(formattedTimestamp);
        return transactionData;
    }
}
