package com.ajacom.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author liucm
 *         Date 2019/4/29
 *         Time 10:34
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer3344.class,args);
    }
}
