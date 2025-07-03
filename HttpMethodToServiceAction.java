package com.wu.brwallet.customer.profile.model.common.kafka;

import com.wu.era.library.event.enums.ServiceAction;
import lombok.Getter;

@Getter
public enum HttpMethodToServiceAction {
    GET(ServiceAction.READ),
    POST(ServiceAction.INSERT),
    PUT(ServiceAction.UPDATE),
    PATCH(ServiceAction.UPDATE),
    DELETE(ServiceAction.DELETE);

    private final ServiceAction serviceAction;

    HttpMethodToServiceAction(ServiceAction serviceAction) {
        this.serviceAction = serviceAction;
    }
}
