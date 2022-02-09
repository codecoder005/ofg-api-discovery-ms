package com.orgofarmsgroup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaServer
public class DiscoveryServiceMsStarter {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServiceMsStarter.class, args);
    }
}
