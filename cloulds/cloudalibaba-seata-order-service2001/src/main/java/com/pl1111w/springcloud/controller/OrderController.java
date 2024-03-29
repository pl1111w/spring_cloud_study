package com.pl1111w.springcloud.controller;

import com.pl1111w.springcloud.domain.CommonResult;
import com.pl1111w.springcloud.domain.Order;
import com.pl1111w.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 
 * @date 2020/3/25 21:24
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @PostMapping("create-order")
    public CommonResult create(@RequestBody Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
