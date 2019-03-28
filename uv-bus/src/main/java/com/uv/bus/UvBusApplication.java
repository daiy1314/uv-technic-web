package com.uv.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UvBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(UvBusApplication.class, args);
    }

}
