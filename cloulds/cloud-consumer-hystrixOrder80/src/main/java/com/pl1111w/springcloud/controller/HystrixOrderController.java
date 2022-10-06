package com.pl1111w.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.pl1111w.springcloud.service.HystrixConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: pl1111w
 * @description: TODO
 * @author: Kris
 * @date 2021/1/19 22:55
 */
@Slf4j
@RestController
@RequestMapping("/consumer")
/*//【服务降级2.0 配置统一服务降级方法 避免代码膨胀
@DefaultProperties(defaultFallback = "paymentGlobalFallbackMethod")*/
public class HystrixOrderController {

    @Autowired
    private HystrixConsumerService hystrixConsumerService;
    /**
     * 正常访问
     * http://localhost/consumer/payment/hystrix/ok/1
     *
     * @param id
     * @return
     */
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        return hystrixConsumerService.paymentInfo_OK(id);
    }

    /**
     * 超时访问
     *
     * @param id
     * @return
     */
    @GetMapping("/payment/hystrix/timeout/{id}")
   /*
   //【服务降级1.0 为单独的请求配置fallBack方法,存在代码膨胀，以及降级代码与业务代码耦合的问题】
    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })*/


 /*   @HystrixCommand
    //【服务降级2.0 配置统一服务降级方法 避免代码膨胀*/
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
//        int age = 10 / 0;  //服务降级1.0 2.0可以客户端错误
        return hystrixConsumerService.paymentInfo_TimeOut(id);
    }

    private String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id) {
        return "消费  者80，对方支付系统繁忙，或自己运行出错请检查自己，请10秒后再试。";
    }

    private String paymentGlobalFallbackMethod() {
        return "消费者80，对方支付系统繁忙，或自己运行出错，请稍后再试。";
    }

}
