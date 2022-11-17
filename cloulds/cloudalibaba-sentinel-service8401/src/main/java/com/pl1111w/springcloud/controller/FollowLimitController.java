package com.pl1111w.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: pl1111w
 * @description:o
 * @author: Kris
 * @date 2022/11/15 11:42
 */
@RestController
public class FollowLimitController {

    @GetMapping("/testA")
    public String testA() {
        System.out.println(Thread.currentThread().getName());
        return "This is testA AA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "This is testB BB";
    }

    @GetMapping("testC/{id}/{name}")
    @SentinelResource(value="testC",blockHandler = "handleException")
    public String testC(@PathVariable("id") String id,
                        @PathVariable("name") String name) {
        System.out.println(name + "/t" + id);
        return "This is testC CC";
    }
    public String handleException(String id, String name, BlockException e){
       return "热点id qps>1 ~==~";
    }
}
