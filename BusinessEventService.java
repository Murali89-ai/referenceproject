package com.wu.brwallet.customer.profile.service.common;

import com.wu.brwallet.customer.profile.constants.BusinessConstants;
import com.wu.brwallet.customer.profile.model.common.kafka.HttpMethodToServiceAction;
import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import com.wu.era.library.event.config.BusinessEventHeader;
import com.wu.era.library.event.enums.BusinessEventType;
import com.wu.era.library.event.utils.WUBusinessEventUtils;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
@RequiredArgsConstructor
public class BusinessEventService {

    private static final Logger log = LogManager.getLogger(BusinessEventService.class);

    private final WUBusinessEventUtils eventUtils;

    private static BusinessEventHeader buildKafkaHeader(TransactionData incomingRequest) {
        var kafkaHeader = new BusinessEventHeader();
        kafkaHeader.setBusinessArea(BusinessConstants.KAFKA_HEADERS_BUSINESS_AREA);
        kafkaHeader.setBusinessDomain(BusinessConstants.KAFKA_HEADERS_BUSINESS_DOMAIN);
        kafkaHeader.setTenantId(BusinessConstants.KAFKA_HEADERS_TENANT_ID);
        kafkaHeader.setExternalRefId(incomingRequest.getExternalRefId());
        kafkaHeader.setApiKey(incomingRequest.getXAPIKey());
        kafkaHeader.setAuthPricipal(null);
        kafkaHeader.setServiceURI(incomingRequest.getIncomingUri());
        kafkaHeader.setEventTime(LocalDateTime.now(ZoneOffset.UTC).toString());
        kafkaHeader.setServiceStartTime(String.valueOf(incomingRequest.getStartTime()));
        return kafkaHeader;
    }


    @Async
    public void sendEvent(String eventCode, Object businessEventModelObject, TransactionData incomingRequest) {
        try {
            eventUtils.publishEvent(eventCode, BusinessEventType.BUSINESS ,
                    incomingRequest.getIncomingHttpMethod()!=null?HttpMethodToServiceAction.valueOf(incomingRequest.getIncomingHttpMethod()).getServiceAction():HttpMethodToServiceAction.valueOf("POST").getServiceAction(),
                    businessEventModelObject,
                    buildKafkaHeader(incomingRequest));
            log.info("business event published to kafka : {}", businessEventModelObject);
        } catch (Exception e) {
            log.error("exception {}", e.getMessage());
        }
    }


}
