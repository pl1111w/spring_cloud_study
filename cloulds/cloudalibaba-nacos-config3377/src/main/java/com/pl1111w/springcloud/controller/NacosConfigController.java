package com.pl1111w.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: pl1111w
 * @description: TODO
 * @author: Kris
 * @date 2021/2/5 22:28
 */
@RestController
@RefreshScope
public class NacosConfigController {

    @Value("${com.pl1111w.springcloud.config.info}")
    private String configInfo;

    @GetMapping("/com.pl1111w.springcloud.config/info")
    public String getConfigInfo() {
        return configInfo;
    }


}