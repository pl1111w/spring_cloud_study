package com.pl1111w.springcloud.service.impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.pl1111w.springcloud.dao.AccountDao;
import com.pl1111w.springcloud.service.AccountService;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @date 2020/3/25 22:10
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------>account-service中扣减账户余额开始");
        //模拟超时异常，全局事务回滚
        accountDao.decrease(userId,money);
        LOGGER.info("------>account-service中扣减账户余额结束");
    }
}
