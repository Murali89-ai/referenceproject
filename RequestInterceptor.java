package com.wu.brwallet.customer.profile.interceptor;



import com.wu.brwallet.customer.profile.model.common.kafka.TransactionData;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.servlet.HandlerInterceptor;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.wu.brwallet.customer.profile.constants.AppConstants.CORRELATION_ID_KEY;
import static com.wu.brwallet.customer.profile.constants.AppConstants.EXTERNAL_REFERENCE_ID_KEY;
import static com.wu.brwallet.customer.profile.constants.BusinessConstants.EXTERNAL_REF_ID;


public class RequestInterceptor implements HandlerInterceptor {

    public static final Logger logger = LoggerFactory.getLogger(RequestInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        TransactionData transactionData = new TransactionData();

        String correlationId = request.getHeader("x-wu-correlationId");
        if (correlationId == null) {
            correlationId = UUID.randomUUID().toString();
        }
        transactionData.setIncomingUri(request.getRequestURI());
        transactionData.setIncomingHeaders(extractHeaders(request));
        transactionData.setIncomingQueryparams(extractQueryParams(request));
        transactionData.setCorrelationId(correlationId);
        transactionData.setExternalRefId(request.getHeader("x-wu-externalRefId"));
        transactionData.setIncomingHttpMethod(request.getMethod());
        transactionData.setServiceId(request.getHeader("x-wu-serviceId"));
        transactionData.setXAPIKey(request.getHeader("x-api-key"));
        transactionData.setStartTime(LocalDateTime.now(ZoneOffset.UTC).toString());

        request.setAttribute("transactionData", transactionData);

        MDC.put(CORRELATION_ID_KEY, correlationId);
        MDC.put(EXTERNAL_REFERENCE_ID_KEY, request.getHeader(EXTERNAL_REF_ID));


        return true;
    }

    private Map<String, String> extractHeaders(HttpServletRequest request) {
        Map<String, String> headers = new HashMap<>();
        Collections.list(request.getHeaderNames())
                .forEach(headerName -> headers.put(headerName, request.getHeader(headerName)));
        return headers;
    }

    private Map<String, String> extractQueryParams(HttpServletRequest request) {
        Map<String, String> queryParams = new HashMap<>();
        request.getParameterMap().forEach((key, value) ->
                queryParams.put(key, value[0]));
        return queryParams;
    }

}
