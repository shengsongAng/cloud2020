package com.ang.springcloud.service;

import com.ang.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
