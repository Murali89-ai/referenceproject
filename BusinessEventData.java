package com.wu.brwallet.customer.profile.model.common.kafka;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BusinessEventData {
    private String description;
    private String sourceSystem;
    private String targetSystem;
    private String processName;
    private String flowName;
    private String eventStage;
    private String sessionId;
    private String loginAuthType;
    private String mtcn;
    private String customerUmn;
    private String countryCode;
}

