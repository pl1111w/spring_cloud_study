package com.pl1111.springcloud.service;

import com.pl1111.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @title: pl1111w
 * @description: 支付service
 * @author: Kris
 * @date 2021/1/6 22:25
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
