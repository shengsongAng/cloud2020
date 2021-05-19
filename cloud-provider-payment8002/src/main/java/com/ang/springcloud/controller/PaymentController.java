package com.ang.springcloud.controller;

import com.ang.springcloud.entity.CommonResult;
import com.ang.springcloud.entity.Payment;
import com.ang.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    /**
     * 服务对象
     */
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

//    @PostMapping(value = "/payment/create")
//    public CommonResult create(Payment payment){
//        int result = paymentService.create(payment);
//        log.info("*****插入结果："+result);
//        if (result>0){  //成功
//            return new CommonResult(200,"插入数据库成功，serverPort:"+serverPort,result);
//        }else {
//            return new CommonResult(444,"插入数据库失败",null);
//        }
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/get/{id}")
    public CommonResult<Payment> selectOne(@PathVariable("id") Long id) {
        Payment payment = this.paymentService.getPaymentById(id);

        return new CommonResult<Payment>(200, "select success， serverPort：" + serverPort, payment);
    }

    @GetMapping("/lb")
    public String getPaymentLB() {
        return serverPort;
    }

}
