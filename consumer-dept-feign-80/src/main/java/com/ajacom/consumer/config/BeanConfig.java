package com.ajacom.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liucm
 *         Date 2019/4/23
 *         Time 15:36
 */
@Configuration
public class BeanConfig {

    @Bean
    public IRule ribbonRule(){
        return new RoundRobinRule();
    }
}
