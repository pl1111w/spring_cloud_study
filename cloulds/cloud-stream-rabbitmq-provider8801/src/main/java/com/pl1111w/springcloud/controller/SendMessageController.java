package com.pl1111w.springcloud.controller;

import com.pl1111w.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: pl1111w
 * @description: TODO
 * @author: Kris
 * @date 2021/1/30 16:14
 */
@RestController
public class SendMessageController {

    @Autowired
    private IMessageProvider provider;

    @GetMapping("/sendMessage")
    public void sendMessage(){
         provider.send();
    }
}
