package com.ajacom.consumer;

import com.ajacom.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author liucm
 *         Date 2019/4/23
 *         Time 15:46
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "DEPT-PROVIDER",configuration = MySelfRule.class)
public class DeptConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80.class,args);
    }
}
