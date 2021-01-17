package com.pl1111w.springcloud.controller;

import com.pl1111w.springcloud.config.LoadBalance;
import com.pl1111w.springcloud.entities.CommonResult;
import com.pl1111w.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

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

    //private static final String URL = "http://localhost:8001/";
    private static final String URL = "http://CLOUD-PAYMENT-SERVICE/";

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private LoadBalance loadBalance;

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

    @GetMapping("/getEntity/{id}")
    public CommonResult<Payment> getPaymentEntityById(@PathVariable("id") Long id) {
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(URL + "/payment/get/" + id, CommonResult.class, id);
        if (entity.getStatusCode().is2xxSuccessful()) {
            return entity.getBody();
        } else {
            return new CommonResult<>(000, "failed");
        }
    }

    @GetMapping("lb")
    public CommonResult getIb() {
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        ServiceInstance instance = loadBalance.instances(serviceInstances);
        return restTemplate.getForObject("http://" + instance.getHost() + ":" + instance.getPort() + "/payment/lb", CommonResult.class);
    }
}
