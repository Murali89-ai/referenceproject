package com.wu.brwallet.customer.profile.service.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wu.brwallet.customer.profile.config.MaskingProperties;
import com.wu.brwallet.customer.profile.constants.LoggingConstants;
import com.wu.era.library.exception.exceptiontype.WUServiceException;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.net.URI;

import static com.wu.brwallet.customer.profile.util.Utility.maskPayload;

@Service
public class AsyncLoggingService {
    public static final Logger log = LoggerFactory.getLogger(AsyncLoggingService.class);

    private final MaskingProperties maskingProperties;
    private final ObjectMapper objectMapper;

    public AsyncLoggingService(MaskingProperties maskingProperties, ObjectMapper objectMapper) {
        this.maskingProperties = maskingProperties;
        this.objectMapper = objectMapper;
    }

    @Async
    public void logRequestAsync(HttpRequest request, String requestBody, HttpHeaders headers) {
        try {
            String maskedBody = requestBody;
            if(headers.get("Content-type") != null && !headers.get("Content-type").isEmpty()) {
                String contentType = headers.get("Content-type").get(0);
                if(contentType.contains("application/json")) {
                    maskedBody = String.valueOf(maskPayload(objectMapper.readTree(requestBody), maskingProperties.getMaskingFields()));
                } else if(contentType.contains("xml")) {
                    maskedBody = maskPayload(requestBody, maskingProperties.getMaskingFields());
                }
            }

            log.info("\n----------------------------\n" +
                            "event=IObound-request" +
                            "\nurl={}" +
                            "\nhttpMethod={}" +
                            "\nrequestHeader={}" +
                            "\nrequestBody={}",
                    request.getURI(), request.getMethod(), headers, maskedBody);
        } catch (Exception e) {
            log.error("Error logging request {}", e.getMessage());
        }
    }

    @Async
    public void logResponseAsync(HttpRequest request, ClientHttpResponse response,
                                 String responseBody, long timeTaken, int statusCode) {
        try {
            String maskedBody = responseBody;
            if(response.getHeaders().get("Content-type") != null && !response.getHeaders().get("Content-type").isEmpty()) {
                String contentType = response.getHeaders().get("Content-type").get(0);
                if(contentType.contains("application/json")) {
                    maskedBody = String.valueOf(maskPayload(objectMapper.readTree(responseBody), maskingProperties.getMaskingFields()));
                } else if(contentType.contains("xml")) {
                    maskedBody = maskPayload(responseBody, maskingProperties.getMaskingFields());
                }
            }

            log.info("\n----------------------------\n" +
                            "event=IObound-response" +
                            "\ntimeTaken={} ms" +
                            "\nhttpCode={}" +
                            "\nurl={}" +
                            "\nhttpMethod={}" +
                            "\nresponseBody={}" +
                            "\n----------------------------",
                    timeTaken, statusCode, request.getURI(), request.getMethod(), maskedBody);
        } catch (Exception e) {
            log.error("Error logging request {}", e.getMessage());
        }
    }

    @Async
    public void logErrorAsync(URI url, HttpMethod method, long timeTaken, Exception e) {
        log.error("\n----------------------------\n" +
                        "event=IObound-error" +
                        "\nhost={}" +
                        "\nuri={}" +
                        "\nurl={}" +
                        "\nhttpMethod={}" +
                        "\ntimeTaken={} ms" +
                        "\n----------------------------",
                url.getHost(), url.getPath(), url, method, timeTaken, e);
    }

    @Async
    public void logControllerJSONAudit(ProceedingJoinPoint joinPoint, Long timeTaken,
                                       String httpStatusCode, String parsedResponse, String requestBody,
                                       String requestHeader) {
        String isSuccess = (HttpStatus.valueOf(Integer.valueOf(httpStatusCode)).is2xxSuccessful()) ? LoggingConstants.YES : LoggingConstants.NO;
        StringBuilder jsonAuditResponse = new StringBuilder();
        try {
            parsedResponse = String.valueOf(maskPayload(objectMapper.readTree(parsedResponse), maskingProperties.getMaskingFields()));
            requestBody = String.valueOf(maskPayload(objectMapper.readTree(requestBody), maskingProperties.getMaskingFields()));
        } catch (JsonProcessingException e) {
            log.error("Error logging data {}",e.getMessage());
        }
        jsonAuditResponse.append(LoggingConstants.AUDIT_BEGIN)
                .append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.LOGEVENT)
                .append(LoggingConstants.EQUALS)
                .append(LoggingConstants.JSON_AUDIT)
                .append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.ISSUCCESS)
                .append(LoggingConstants.EQUALS)
                .append(isSuccess)
                .append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.HTTP_STATUS_CODE)
                .append(LoggingConstants.EQUALS)
                .append(httpStatusCode)
                .append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.TIME_TAKEN)
                .append(LoggingConstants.EQUALS)
                .append(timeTaken)
                .append(LoggingConstants.LOG_SEPERATOR)
                .append(LoggingConstants.MILLISECONDS)
                .append(LoggingConstants.NEW_LINE)
                .append(appendClassAndMethodNames(joinPoint))
                .append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.REQUEST_HEADER)
                .append(LoggingConstants.EQUALS)
                .append(requestHeader)
                .append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.REQUEST_BODY)
                .append(LoggingConstants.EQUALS)
                .append(requestBody)
                .append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.RESPONSE_BODY)
                .append(LoggingConstants.EQUALS)
                .append(parsedResponse)
                .append(LoggingConstants.AUDIT_END);
        log.info(jsonAuditResponse.toString());
    }
    @Async
    public void logControllerEntryExit(ProceedingJoinPoint joinPoint, Long timeTaken, HttpServletRequest servletRequest,
                                       String parsedResponse, String requestBody, ObjectMapper mapper) {
        StringBuilder entryExitLog = new StringBuilder();
        entryExitLog.append(LoggingConstants.LOGEVENT)
                .append(LoggingConstants.EQUALS)
                .append(LoggingConstants.ENTRYEXIT)
                .append(LoggingConstants.NEW_LINE)
                .append(appendClassAndMethodNames(joinPoint))
                .append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.TIME_TAKEN)
                .append(LoggingConstants.EQUALS)
                .append(timeTaken)
                .append(LoggingConstants.LOG_SEPERATOR)
                .append(LoggingConstants.MILLISECONDS)
                .append(LoggingConstants.NEW_LINE);

        if (!ObjectUtils.isEmpty(MDC.get(LoggingConstants.ERRORCODE))) {
            entryExitLog.append(LoggingConstants.NEW_LINE)
                    .append(LoggingConstants.ERRORCODE)
                    .append(LoggingConstants.EQUALS)
                    .append(MDC.get(LoggingConstants.ERRORCODE))
                    .append(LoggingConstants.NEW_LINE)
                    .append(LoggingConstants.ERRORMESSAGE)
                    .append(LoggingConstants.EQUALS);
        }
        log.info(entryExitLog.toString());
    }

    public StringBuilder appendClassAndMethodNames(ProceedingJoinPoint joinPoint) {
        StringBuilder request_message = new StringBuilder();
        request_message.append(LoggingConstants.CLASS_NAME)
                .append(LoggingConstants.EQUALS)
                .append(joinPoint.getTarget().getClass().getName())
                .append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.METHOD_NAME)
                .append(LoggingConstants.EQUALS)
                .append(joinPoint.getSignature().getName());
        return request_message;
    }

    public String generateErrorMessage(ProceedingJoinPoint joinPoint, long timeTaken,
                                       String httpStatusCode, HttpServletRequest servletRequest, String logEventType) {
        StringBuilder errorMessage = new StringBuilder();
        errorMessage.append(LoggingConstants.EX_AUDIT_BEGIN)
                .append(LoggingConstants.LOGEVENT)
                .append(LoggingConstants.EQUALS)
                .append(logEventType)
                .append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.ERRORCODE)
                .append(LoggingConstants.EQUALS)
                .append(MDC.get(LoggingConstants.ERRORCODE))
                .append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.ERRORMESSAGE)
                .append(LoggingConstants.EQUALS)
                .append(LoggingConstants.NEW_LINE)
                .append(appendClassAndMethodNames(joinPoint))
                .append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.TIME_TAKEN)
                .append(LoggingConstants.EQUALS)
                .append(timeTaken)
                .append(LoggingConstants.LOG_SEPERATOR)
                .append(LoggingConstants.MILLISECONDS);
        if (!ObjectUtils.isEmpty(httpStatusCode)) {
            errorMessage.append(LoggingConstants.NEW_LINE)
                    .append(LoggingConstants.HTTP_STATUS_CODE)
                    .append(LoggingConstants.EQUALS)
                    .append(httpStatusCode);
        }
        errorMessage.append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.EX_AUDIT_END);
        return errorMessage.toString();
    }

    public String generateWuErrorMessage(ProceedingJoinPoint joinPoint, String httpStatusCode, String errorCode,
                                         String wuErrorMessage, String requestBody, WUServiceException wuServiceException,
                                         String requestHeader, String logEventType) {
        StringBuilder errorMessage = new StringBuilder();
        if (!ObjectUtils.isEmpty(wuServiceException.getHttpStatus())) {
            httpStatusCode = Integer.toString(wuServiceException.getHttpStatus().value());
        }
        errorMessage.append(LoggingConstants.EX_AUDIT_BEGIN)
                .append(LoggingConstants.LOGEVENT)
                .append(LoggingConstants.EQUALS)
                .append(logEventType)
                .append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.ISSUCCESS)
                .append(LoggingConstants.EQUALS)
                .append(LoggingConstants.NO)
                .append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.ERRORCODE)
                .append(LoggingConstants.EQUALS)
                .append(errorCode)
                .append(LoggingConstants.NEW_LINE)
                .append(LoggingConstants.ERRORMESSAGE)
                .append(LoggingConstants.EQUALS)
                .append(wuErrorMessage)
                .append(LoggingConstants.NEW_LINE)
                .append(appendClassAndMethodNames(joinPoint));

        if (!ObjectUtils.isEmpty(httpStatusCode)) {
            errorMessage.append(LoggingConstants.NEW_LINE)
                    .append(LoggingConstants.HTTP_STATUS_CODE)
                    .append(LoggingConstants.EQUALS)
                    .append(httpStatusCode);
        }
        if (!StringUtils.isEmpty(requestHeader)) {
            errorMessage.append(LoggingConstants.NEW_LINE)
                    .append(LoggingConstants.REQUEST_HEADER)
                    .append(LoggingConstants.EQUALS)
                    .append(requestHeader);
        }
        if(!StringUtils.isEmpty(requestBody)) {
            errorMessage.append(LoggingConstants.NEW_LINE)
                    .append(LoggingConstants.REQUEST_BODY)
                    .append(LoggingConstants.EQUALS)
                    .append(requestBody);
        }

        logWUServiceExceptionDetails(wuServiceException, errorMessage);
        errorMessage.append(LoggingConstants.EX_AUDIT_END);
        return errorMessage.toString();
    }

    private void logWUServiceExceptionDetails(WUServiceException wuServiceException, StringBuilder errorMessage) {
        if (!ObjectUtils.isEmpty(wuServiceException) && !ObjectUtils.isEmpty(wuServiceException.getMessage())) {
            errorMessage.append(LoggingConstants.NEW_LINE)
                    .append("message")
                    .append(LoggingConstants.EQUALS)
                    .append(wuServiceException.getMessage());
        }
    }

}
