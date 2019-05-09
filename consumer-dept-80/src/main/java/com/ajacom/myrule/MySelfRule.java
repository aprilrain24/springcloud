package com.ajacom.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liucm
 *         Date 2019/4/24
 *         Time 15:31
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new MyRandomRule();
    }
}
