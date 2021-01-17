package com.pl1111w.springcloud.service;

import com.pl1111w.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @title: pl1111w
 * @description: TODO
 * @author: Kris
 * @date 2021/1/17 22:03
 */
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
@Component
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult getPaymentById(@PathVariable("id") Long id);

    /**
     * 模拟feign超时
     */
    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();
}