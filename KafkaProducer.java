package com.wu.brwallet.customer.profile.kafka.producer;

import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.builder.response.ChangepinResponseBuilder;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.brwallet.customer.profile.model.request.changepin.ChangePinRequest;
import com.wu.brwallet.customer.profile.model.response.changepin.ChangePinResponse;
import com.wu.era.kafka.producer.model.Header;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private static final Logger logger = LogManager.getLogger(KafkaProducer.class);

    @Autowired
    @Qualifier("CommonKafkaProducer")
    private com.wu.era.kafka.producer.KafkaProducer kafkaProducer;

    @Value("${kafka.producer.topic}")
    private String topic;

    @Autowired
    ChangepinResponseBuilder changePinResponseBuilder;

    @LoggingAnnotation
    public ChangePinResponse sendMessage(ChangePinRequest changePinRequest, TransactionData requestContext) {
        Header header = Header.builder()
                .externalRefId(requestContext.getExternalRefId())
                .serviceId(requestContext.getServiceId())
                .apiKey(requestContext.getXAPIKey())
                .correlationId(requestContext.getCorrelationId())
                .build();
        logger.debug("Publishing kafka message to Change pin KafkaProducer.sendMessage request {} {}",requestContext,changePinRequest);

        try {
            RecordMetadata resp = kafkaProducer.publishDomainObject(topic, changePinRequest.getCustomerUmn(), changePinRequest, header);
            logger.debug("Change pin KafkaProducer.sendMessage response {}",resp.toString());
            System.out.println("Kafka producer Resp::"+resp.toString());
             return  changePinResponseBuilder.changePinErrorResponse(requestContext);

        } catch (Exception e) {
            logger.error("- error occured while calling Change pin KafkaProducer.sendMessage {}",e.getMessage());
            System.out.println(e.getMessage());
            return changePinResponseBuilder.changePinErrorResponse(requestContext);
        }
    }
}

