package com.ys.clouddemo.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ys
 * @date 2020/12/25 14:55
 */

@SpringBootApplication
@MapperScan(basePackages = {"com.ys.clouddemo.**.mapper"})
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8082 {

    public static void main(String[] args) {

        SpringApplication.run(PaymentMain8082.class,args);
    }
}
