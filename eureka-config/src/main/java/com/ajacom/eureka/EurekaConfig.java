package com.ajacom.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liucm
 *         Date 2019/4/23
 *         Time 16:50
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaConfig {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConfig.class,args);
    }
}
