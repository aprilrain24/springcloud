package ajacom.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author liucm
 *         Date 2019/4/23
 *         Time 15:11
 */
@SpringBootApplication
@MapperScan("com.ajacom.provider.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableAspectJAutoProxy
public class DeptProviderHystrixConfig {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrixConfig.class, args);
    }
}
