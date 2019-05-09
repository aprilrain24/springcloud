package com.ajacom.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author liucm
 *         Date 2019/4/23
 *         Time 15:46
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerHystrixDashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerHystrixDashboard9001.class,args);
    }
}
