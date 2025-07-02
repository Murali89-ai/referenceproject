package com.wu.brwallet.customer.profile.interceptor.logging;

import com.wu.brwallet.customer.profile.service.common.AsyncLoggingService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RestRequestResponseLogEventListener {

    private final AsyncLoggingService loggingService;

    public RestRequestResponseLogEventListener(AsyncLoggingService loggingService) {
        this.loggingService = loggingService;
    }

    @EventListener
    public void handleRequestLogEvent(RequestLogEvent event) {
        loggingService.logRequestAsync(event.getRequest(), event.getRequestBody(), event.getHeaders());
    }

    @EventListener
    public void handleResponseLogEvent(ResponseLogEvent event) {
        loggingService.logResponseAsync(event.getRequest(),event.getResponse(), event.getResponseBody(), event.getTimeTaken(),event.getHttpStatusCode());
    }

    @EventListener
    public void handleErrorLogEvent(ErrorLogEvent event) {
        loggingService.logErrorAsync(event.getUrl(),event.getMethod(),event.getTimeTaken(),event.getException());
    }
}
