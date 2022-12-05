package com.pl1111w.springcloud.controller;

import com.pl1111w.springcloud.domain.CommonResult;
import com.pl1111w.springcloud.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * 
 * @date 2020/3/25 22:14
 */
@RestController
public class AccountController {

    @Resource
    AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(Long userId, BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult(200, "扣减账户余额成功");
    }
}