package com.wu.brwallet.customer.profile.interceptor.logging;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;

@Getter
public class RequestLogEvent extends ApplicationEvent {

    private final HttpRequest request;
    private final String requestBody;
    private final HttpHeaders headers;

    public RequestLogEvent(Object source, HttpRequest request, String requestBody, HttpHeaders headers) {
        super(source);
        this.request = request;
        this.requestBody = requestBody;
        this.headers = headers;
    }

}
