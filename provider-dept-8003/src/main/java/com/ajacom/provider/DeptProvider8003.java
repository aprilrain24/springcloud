package com.ajacom.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liucm
 *         Date 2019/4/23
 *         Time 15:11
 */
@SpringBootApplication
@MapperScan("com.ajacom.provider.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8003 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003.class, args);
    }
}
