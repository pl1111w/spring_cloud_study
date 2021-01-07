package com.pl1111w.springcloud.controller;

import com.pl1111w.springcloud.entities.CommonResult;
import com.pl1111w.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @title: pl1111w
 * @description: TODO
 * @author: Kris
 * @date 2021/1/7 21:37
 */
@RestController
@Slf4j
@RequestMapping("consumer/payment/")
public class OrderController {

    private static final String URL = "http://localhost:8001/";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/create")
    public CommonResult create(Payment payment) {
        CommonResult commonResult = restTemplate.postForObject(URL + "/payment/create", payment, CommonResult.class);
        log.info("插入数据的ID:\t" + payment.getId());
        log.info("插入结果：" + commonResult);
        return commonResult;
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(URL + "/payment/get/" + id, CommonResult.class, id);
    }
}
