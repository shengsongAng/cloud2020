package com.ang.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description: ${description}
 * @author: ssang
 * @create: 2021/5/19 0019 10:38
 **/
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced     //实现均衡负载
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
