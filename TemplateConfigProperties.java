package com.wu.brwallet.customer.profile.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("template")
@Data
public class TemplateConfigProperties {

    private String id;
    private String version;
}
