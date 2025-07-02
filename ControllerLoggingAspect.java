package com.wu.brwallet.customer.profile.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.wu.brwallet.customer.profile.constants.LoggingConstants;
import com.wu.brwallet.customer.profile.service.common.AsyncLoggingService;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Aspect
@Component
public class ControllerLoggingAspect {

  public static final Logger log = LoggerFactory.getLogger(ControllerLoggingAspect.class);
  private final ObjectMapper mapper = new ObjectMapper();
  @Autowired
  AsyncLoggingService loggingService;

  @Around("@annotation(LogControllerEntryExit)")
  public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
    Object response = null;
    String httpStatusCode = null;
    long startTime = System.currentTimeMillis();
    ResponseEntity<?> responceEntity = null;
    String requestBody = null;
    String requestHeader = null;
    try {
      requestBody = captureRequest(joinPoint).toString();

      response = joinPoint.proceed();
      HttpServletRequest servletRequest = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
      HttpServletResponse servletResponse = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getResponse();
      if (response instanceof ResponseEntity<?>) {
        responceEntity = (ResponseEntity<?>) response;
        httpStatusCode = String.valueOf(responceEntity.getStatusCodeValue());
      }
      if (httpStatusCode == null && servletResponse != null) {
        httpStatusCode = String.valueOf(servletResponse.getStatus());
      }

      if (response instanceof ResponseEntity<?>) {
        String parsedResponse = captureResponse(response);
        long stopTime = System.currentTimeMillis();
        Long timeTaken = stopTime - startTime;
        loggingService.logControllerJSONAudit(joinPoint, timeTaken, httpStatusCode, parsedResponse, requestBody, requestHeader);
        loggingService.logControllerEntryExit(joinPoint, timeTaken, servletRequest, parsedResponse, requestBody, mapper);
      }
      return response;
    } catch (Throwable e) {
      long stopTime = System.currentTimeMillis();
      long timeTaken = stopTime - startTime;
      HttpServletRequest servletRequest = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
      HttpServletResponse servletResponse = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getResponse();

      if (responceEntity != null) {
        httpStatusCode = String.valueOf(responceEntity.getStatusCodeValue());
      }
      if (httpStatusCode == null && servletResponse != null) {
        httpStatusCode = String.valueOf(servletResponse.getStatus());
      }
      if (e instanceof WUServiceException) {
        var errorCode = ((WUServiceException) e).getCode();
        var errorMessage = ((WUServiceException) e).getErrorMessage();
        httpStatusCode = "null";
        if (!ObjectUtils.isEmpty(((WUServiceException) e).getHttpStatus()) &&
                !ObjectUtils.isEmpty(((WUServiceException) e).getHttpStatus().value())) {
          httpStatusCode = String.valueOf((((WUServiceException) e).getHttpStatus()).value());
        }

        log.error(loggingService.generateWuErrorMessage(joinPoint, httpStatusCode, errorCode, errorMessage, requestBody, (WUServiceException) e, requestHeader, LoggingConstants.JSON_AUDIT));
        log.error("StackTrace:", e);
        var error = (WUServiceException) e;
        error.setMessage(errorMessage);
        loggingService.logControllerEntryExit(joinPoint, timeTaken, servletRequest, null, requestBody, mapper);
        throw error;
      } else {
        log.error(loggingService.generateErrorMessage(joinPoint, timeTaken, httpStatusCode, servletRequest, LoggingConstants.JSON_AUDIT));
        log.error("StackTrace:", e);
        loggingService.logControllerEntryExit(joinPoint, timeTaken, servletRequest, null, requestBody, mapper);
      }
      throw e;
    }
  }

  private String captureResponse(Object response) {
    if (response instanceof ResponseEntity) {
      Object responseBody = (((ResponseEntity<?>) response).getBody());

      try {
        String responseBodyStr  = mapper.writeValueAsString(((ResponseEntity<?>) response).getBody());
        if (responseBody != null && (responseBodyStr.contains("null"))) {
          Gson gson = new Gson();
          JsonObject jsonObject = gson.fromJson(responseBodyStr, JsonObject.class);
          return gson.toJson(jsonObject);
        } else {
          return responseBodyStr;
        }
      } catch (Exception e) {
        log.error("Exception at captureResponse for responseBody "+ responseBody + "\nException::{}", Arrays.toString(e.getStackTrace()));
      }

      return responseBody==null? StringUtils.EMPTY:responseBody.toString();
    } else {
      return (applyWriteValueAsString(response));
    }
  }

  public StringBuilder captureRequest(ProceedingJoinPoint joinPoint) {

    StringBuilder requestMessage = new StringBuilder();
    String parsedRequest = StringUtils.EMPTY;
    if (!ObjectUtils.isEmpty(joinPoint.getArgs())) {
      parsedRequest = Arrays.stream(joinPoint.getArgs())
              .filter(Objects::nonNull)
              .filter(e -> !e.getClass().toString().contains("TransactionData"))
              .map(this::applyWriteValueAsString)
              .collect(Collectors.joining(","));
      parsedRequest = getParsedRequest(parsedRequest);

    }
    requestMessage
        .append(LoggingConstants.LOG_SEPERATOR)
        .append(ObjectUtils.isEmpty(parsedRequest) ? StringUtils.EMPTY : parsedRequest)
        .append(LoggingConstants.LOG_SEPERATOR);

    return requestMessage;
  }

  private String getParsedRequest(String parsedRequest) {
    if (parsedRequest.contains("},\"")) {
      // Extract the JSON portion
      int startIndex = parsedRequest.indexOf('{');
      int endIndex = parsedRequest.lastIndexOf('}') + 1;
      String jsonBody = parsedRequest.substring(startIndex, endIndex);

      try {
        mapper.readTree(jsonBody);
        parsedRequest = jsonBody;
      } catch (JsonProcessingException e) {
        log.error("Not getting RequestJSON body as JsonProcessingException while reading the request with error :: {}", e.toString());
      }
    }
    return parsedRequest;
  }



  private String applyWriteValueAsString(Object responseArgument) {
    try {
      //mapper.enable(SerializationFeature.INDENT_OUTPUT);
      mapper.findAndRegisterModules();
      return mapper.writeValueAsString(responseArgument);
    } catch (JsonProcessingException jsonProcessingExcepton) {
      String errorMsg = "ControllerLoggingAspect JsonProcessingException FAILED PARSING JSON RESPONSE";
      log.error(errorMsg, responseArgument.toString());
      return errorMsg;
    } catch (Throwable t) {
      String errorMsg = "ControllerLoggingAspect Throwable FAILED PARSING JSON RESPONSE";
      log.error(errorMsg, responseArgument.toString());
      return errorMsg;
    }
  }





}
