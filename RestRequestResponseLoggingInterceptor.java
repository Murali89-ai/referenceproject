package com.wu.brwallet.customer.profile.interceptor.logging;

import com.wu.brwallet.customer.profile.service.common.AsyncLoggingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@Slf4j
public class RestRequestResponseLoggingInterceptor implements ClientHttpRequestInterceptor {

  private final AsyncLoggingService loggingService;
  private final ApplicationEventPublisher eventPublisher;

  public RestRequestResponseLoggingInterceptor(AsyncLoggingService loggingService, ApplicationEventPublisher eventPublisher) {
    this.loggingService = loggingService;
    this.eventPublisher = eventPublisher;
  }
  @Override
  public ClientHttpResponse intercept(HttpRequest request, byte[] requestBody,
                                      ClientHttpRequestExecution executionJointPoint) throws IOException {
    StringBuilder requestResponseDetails = new StringBuilder();

    URI url = request.getURI();
    HttpMethod method = request.getMethod();
    long startTime = System.currentTimeMillis();
    ClientHttpResponse response = null;
    String responseBodyStr = null;
    try {

      String requestBodyStr = new String(requestBody, StandardCharsets.UTF_8);
      HttpHeaders headers = populateLogHeaders(request.getHeaders());
      eventPublisher.publishEvent(new RequestLogEvent(this, request, requestBodyStr, headers));
      response = executionJointPoint.execute(request, requestBody);
      long stopTime = System.currentTimeMillis();
      long timeTaken = stopTime - startTime;
      Integer httpStatusCode = response.getStatusCode().value();
      responseBodyStr = StreamUtils.copyToString(response.getBody(), Charset.defaultCharset());
      eventPublisher.publishEvent(new ResponseLogEvent(this, request, response, responseBodyStr, timeTaken, httpStatusCode));

    } catch (Exception e) {
      long stopTime = System.currentTimeMillis();
      long timeTaken = stopTime - startTime;
      eventPublisher.publishEvent(new ErrorLogEvent(this, url, method, timeTaken, e));
      throw e;
    }
    return response;
  }

  private HttpHeaders populateLogHeaders(HttpHeaders extractedHeaders) {
    HttpHeaders headersToLog = new HttpHeaders();
    if (!CollectionUtils.isEmpty(extractedHeaders)) {
      for (Map.Entry<String, String> curHeader : extractedHeaders.toSingleValueMap().entrySet()) {
        headersToLog.add(curHeader.getKey(), curHeader.getValue());
      }
      headersToLog.remove("x-api-key");
      headersToLog.remove("Authorization");
    }
    return headersToLog;
  }

}
