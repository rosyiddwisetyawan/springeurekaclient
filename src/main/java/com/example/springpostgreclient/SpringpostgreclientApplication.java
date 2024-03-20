package com.example.springpostgreclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringpostgreclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringpostgreclientApplication.class, args);
    }

}
