package com.pl1111w.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.pl1111w.springcloud.entities.CommonResult;

/**
 * @title: pl1111w
 * @description:
 * @author: Kris
 * @date 2022/11/17 14:44
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----1");
    }


    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----2");
    }
}
