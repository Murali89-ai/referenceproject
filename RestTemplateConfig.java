package com.wu.brwallet.customer.profile.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wu.brwallet.customer.profile.aop.LoggingAnnotation;
import com.wu.brwallet.customer.profile.service.common.AsyncLoggingService;
import com.wu.brwallet.customer.profile.interceptor.logging.RestRequestResponseLoggingInterceptor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.ssl.SslBundles;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Component
public class RestTemplateConfig {

    @Value("${wu.resttemplate.connect.timeout.ms:30000}")
    private int connectTimeout;
    @Value("${wu.resttemplate.read.timeout.ms:30000}")
    private int readTimeout;
    @Value("${enable.log.payload:true}")
    private boolean enableLogPayload;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Autowired
    private SslBundles sslBundles;

    @Autowired
    private MaskingProperties maskingProperties;
    @Autowired
    private  ApplicationEventPublisher eventPublisher;

    @Getter
    private boolean localEnv = false;

    @Bean(
            name = {"defaultRestTemplate"}
    )
    @ConditionalOnProperty(
            prefix = "wu.mtls.resttemplate",
            name = {"include"},
            matchIfMissing = false,
            havingValue = "false"
    )
    @LoggingAnnotation
    public RestTemplate defaultRestTemplate() {
        localEnv = true;
        RestTemplate restTemplate = new RestTemplate();
        SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        clientHttpRequestFactory.setConnectTimeout(this.connectTimeout);
        clientHttpRequestFactory.setReadTimeout(this.readTimeout);
        restTemplate.setRequestFactory(new BufferingClientHttpRequestFactory(clientHttpRequestFactory));
        if (enableLogPayload) {
            restTemplate.getInterceptors().add(
                    new RestRequestResponseLoggingInterceptor(new AsyncLoggingService(maskingProperties,new ObjectMapper()),eventPublisher));
        }

        return restTemplate;
    }

    @Bean(
            name = {"defaultRestTemplate"}
    )
    @ConditionalOnProperty(
            prefix = "wu.mtls.resttemplate",
            name = {"include"},
            matchIfMissing = false,
            havingValue =  "true"
    )
    @LoggingAnnotation
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = restTemplateBuilder
                .setSslBundle(sslBundles.getBundle("client"))
                .setConnectTimeout(Duration.ofMillis(connectTimeout))
                .setReadTimeout(Duration.ofMillis(readTimeout))
                .build();
        restTemplate.setRequestFactory(new BufferingClientHttpRequestFactory(restTemplate.getRequestFactory()));
        if (enableLogPayload) {
            restTemplate.getInterceptors().add(
                    new RestRequestResponseLoggingInterceptor(new AsyncLoggingService(maskingProperties,new ObjectMapper()),eventPublisher));
        }
        return restTemplate;
    }


}
