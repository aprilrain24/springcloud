package com.ajacom.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author liucm
 *         Date 2019/4/23
 *         Time 15:46
 */
@SpringBootApplication(scanBasePackages = {"com.ajacom.cloud.service","com.ajacom.consumer"})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.ajacom.cloud.service"})
public class DeptConsumerFeign80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign80.class,args);
    }
}
