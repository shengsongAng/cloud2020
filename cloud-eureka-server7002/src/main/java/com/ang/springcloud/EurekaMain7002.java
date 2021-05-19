package com.ang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description: ${description}
 * @author: ssang
 * @create: 2021/5/19 0019 13:56
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
