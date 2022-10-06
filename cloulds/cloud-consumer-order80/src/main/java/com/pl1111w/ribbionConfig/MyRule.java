package com.pl1111w.ribbionConfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @title: pl1111w
 * @description: TODO
 * @author: Kris
 * @date 2021/1/16 14:48
 */

/**
 * eureka jar包包含了ribbon
 * 对于Ribbon的配置必须用@Configuration注解标识，
 * 并且不能被@Component注解或者@SpringBootApplication
 * （因为里面包含了@ComponentScan）扫描到。
 * 因为如果被@ComponetScan扫描到
 * 会导致所有的RibbonClient都去共享这个配置
 */
@Configuration
public class MyRule {

    @Bean
    public IRule rule() {
        return new RandomRule();
    }
}
