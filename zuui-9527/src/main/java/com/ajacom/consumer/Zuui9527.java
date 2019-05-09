package com.ajacom.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author liucm
 *         Date 2019/4/23
 *         Time 15:46
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuui9527 {
    public static void main(String[] args) {
        SpringApplication.run(Zuui9527.class,args);
    }
}
