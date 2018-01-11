package com.lxit.lrc.action;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
@EnableAutoConfiguration
@EnableEurekaClient
public class WebApplication {
    public static void main(String[] args) {
    	new SpringApplicationBuilder(WebApplication.class).web(true).run(args);
    }
}