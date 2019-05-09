package com.ajacom.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liucm
 *         Date 2019/4/24
 *         Time 10:44
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7002 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7002.class,args);
    }
}
