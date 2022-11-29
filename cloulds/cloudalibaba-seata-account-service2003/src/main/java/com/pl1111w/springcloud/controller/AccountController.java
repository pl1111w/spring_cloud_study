package com.pl1111w.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pl1111w.springcloud.domain.CommonResult;
import com.pl1111w.springcloud.service.AccountService;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author wsk
 * @date 2020/3/25 22:14
 */
@RestController
public class AccountController {

    @Resource
    AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功");
    }
}