package com.pl1111w.springcloud.service.impl;

import com.pl1111w.springcloud.service.HystrixConsumerService;
import org.springframework.stereotype.Component;

/**
 * @title: pl1111w
 * @description: 服务降级代码解耦统一处理类
 * @author: Kris
 * @date 2021/1/21 23:19
 */
@Component
public class HystrixFallbackService implements HystrixConsumerService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back--paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back--paymentInfo_TimeOut";
    }
}
