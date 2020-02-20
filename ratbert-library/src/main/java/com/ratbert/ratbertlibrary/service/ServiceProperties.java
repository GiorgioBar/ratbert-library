package com.ratbert.ratbertlibrary.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/*
Isolate configuration properties into a separate POJO
 */

@Configuration
@ConfigurationProperties("service")
public class ServiceProperties {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
