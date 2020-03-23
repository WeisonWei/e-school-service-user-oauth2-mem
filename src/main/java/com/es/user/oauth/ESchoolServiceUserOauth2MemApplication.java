package com.es.user.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ESchoolServiceUserOauth2MemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ESchoolServiceUserOauth2MemApplication.class, args);
    }

}
