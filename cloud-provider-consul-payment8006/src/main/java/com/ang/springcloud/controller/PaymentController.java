package com.ang.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @description: ${description}
 * @author: ssang
 * @create: 2021/5/19 0019 16:30
 **/
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    /**
     * http://localhost:8006/payment/zk
     *
     * @return
     */
    @RequestMapping(value = "payment/consul")
    public String payment() {
        return "SpringCloud with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
