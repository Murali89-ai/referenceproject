/*
package com.wu.brwallet.customer.profile.helper;

import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.request.changepin.ChangePinRequest;
import com.wu.era.kafka.producer.KafkaProducer;
import com.wu.era.kafka.producer.model.Header;
import com.wu.era.library.exception.exceptiontype.WUExceptionType;
import com.wu.era.library.exception.utils.WUServiceExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class KafkaProducerHelper {

    private static final Logger logger = LogManager.getLogger(KafkaProducerHelper.class);
    private static final String KEY_SERIAL = "KEY_SERIAL_";
    private static final String EVENT_PUBLISH_SUCCESS = "Successful response from the adaptor.";
    private static final String CHANGEPIN_EVENT = "CHANGEPINEVENT";

    @Autowired
    @Qualifier("CommonKafkaProducer")
    private KafkaProducer kafkaProducer;

    @Value("${kafka.producer.changepin.topic}")
    private String changePinTopic;

    @Value("${ServiceName}")
    private String serviceName;

    @Value("${ServiceId}")
    private String serviceId;

    @Autowired
    private WUServiceExceptionUtils exceptionUtils;

    @LoggingAnnotation
    public String publishCardEvent(ChangePinRequest changePinRequest, TransactionData transactionData) {
        try {
            logger.info("Publishing changePin request for umn : {}",changePinRequest.getCustomerUmn());
            kafkaProducer.publishDomainObject(changePinTopic, KEY_SERIAL+ changePinRequest.getCpfNumber(), changePinRequest, getHeaders(transactionData));
        } catch (InterruptedException e) {
            logger.error("InterruptedException occurred while publishing changePin request for umn: {}",changePinRequest.getCustomerUmn());
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            logger.error("Error occurred while publishing changePin request for umn: {}",changePinRequest.getCustomerUmn());
            throw exceptionUtils.prepareWuException(BusinessConstants.GENERIC_EXCEPTION, new RuntimeException(), WUExceptionType.BUSINESS);
        }
        return EVENT_PUBLISH_SUCCESS;
    }


    private Header getHeaders( TransactionData transactionData) {
        return Header.builder()
                .eventType(KafkaProducerHelper.CHANGEPIN_EVENT)
                .serviceId(serviceId)
                .serviceName(serviceName)
                .correlationId(transactionData.getCorrelationId())
                .externalRefId(transactionData.getExternalRefId())
                .build();
    }
}
*/
