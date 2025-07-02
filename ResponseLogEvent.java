package com.wu.brwallet.customer.profile.interceptor.logging;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpResponse;

@Getter
public class ResponseLogEvent extends ApplicationEvent {

    private final HttpRequest request;
    private final ClientHttpResponse response;
    private final String responseBody;
    private final long timeTaken;
    private final int httpStatusCode;


    public ResponseLogEvent(RestRequestResponseLoggingInterceptor source, HttpRequest request, ClientHttpResponse response, String responseBodyStr, long timeTaken, Integer httpStatusCode) {
        super(source);
        this.request = request;
        this.response = response;
        this.responseBody = responseBodyStr;
        this.timeTaken = timeTaken;
        this.httpStatusCode = httpStatusCode;
    }
}
