package com.pl1111w.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: pl1111w
 * @description: 引入bus前：curl -X POST "http://localhost:3355/actuator/refresh"
 *               引入bus后-指定通知【3355】：curl -X POST "http://localhost:3344/actuator/bus-refresh/cloud-config-client:3355"
 *               引入bus后-全部通知（3355，3366）：curl -X POST "http://localhost:3344/actuator/bus-refresh"
 * @author: Kris
 * @date 2021/1/26 22:49
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${com.pl1111w.springcloud.config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
