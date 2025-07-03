package com.wu.brwallet.customer.profile.model.common.kafka;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

@Data
@ToString
public class TransactionData {
    private Object incomingBody;
    private String incomingUri;
    private Map<String, String> incomingHeaders;
    private Map<String, String> incomingQueryparams;
    private String correlationId;
    private String externalRefId;
    private String incomingHttpMethod;
    private String serviceId;
    private String xAPIKey;
    private String startTime;
}