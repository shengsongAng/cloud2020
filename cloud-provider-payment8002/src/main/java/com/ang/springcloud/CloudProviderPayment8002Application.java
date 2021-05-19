package com.ang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: ${description}
 * @author: ssang
 * @create: 2021/5/19 0019 9:56
 **/

@EnableEurekaClient
@SpringBootApplication
public class CloudProviderPayment8002Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8002Application.class, args);
    }
}
