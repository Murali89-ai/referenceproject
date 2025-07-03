package com.wu.brwallet.customer.profile.util;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.*;

@Component
public class RetryTemplateUtil {

        @Retryable(maxAttempts = 3,
                backoff = @Backoff(delay = 2000),retryFor = {ResourceAccessException.class, HttpServerErrorException.class, HttpClientErrorException.class, RestClientException.class})
        public <T> T doWithRetry(RestTemplate restTemplate, String url, Object request, Class<T> responseType) {
            return restTemplate.postForObject(url, request, responseType);
        }
    }
