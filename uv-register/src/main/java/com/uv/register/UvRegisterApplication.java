package com.uv.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UvRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UvRegisterApplication.class, args);
    }

}
