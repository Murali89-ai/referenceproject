package com.wu.brwallet.customer.profile.interceptor.logging;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import org.springframework.http.HttpMethod;

import java.net.URI;

@Getter
public class ErrorLogEvent extends ApplicationEvent {

   private final URI url;
   private final HttpMethod method;
   private final long timeTaken;
   private final Exception exception;

    public ErrorLogEvent(RestRequestResponseLoggingInterceptor source, URI url, HttpMethod method, long timeTaken, Exception e) {
        super(source);
        this.url = url;
        this.method = method;
        this.timeTaken = timeTaken;
        this.exception = e;
    }
}
