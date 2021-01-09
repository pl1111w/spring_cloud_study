package com.pl1111.springcloud.controller;

import com.pl1111.springcloud.service.PaymentService;
import com.pl1111w.springcloud.entities.CommonResult;
import com.pl1111w.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @title: pl1111w
 * @description: TODO
 * @author: Kris
 * @date 2021/1/6 22:28
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    private static final String SERVER_PORT = "success";

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入数据的ID:\t" + payment.getId());
        log.info("插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功,serverport:" + SERVER_PORT, result);
        } else {
            return new CommonResult(444, "插入数据失败", null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("***查询结果：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询数据成功,serverport:" + SERVER_PORT, payment);
        } else {
            return new CommonResult(444, "没有对应记录", null);
        }
    }
}
