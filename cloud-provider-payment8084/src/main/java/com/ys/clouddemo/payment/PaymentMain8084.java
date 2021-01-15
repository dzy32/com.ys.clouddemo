package com.ys.clouddemo.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ys
 * @date 2020/12/25 14:55
 */

@SpringBootApplication
@MapperScan(basePackages = {"com.ys.clouddemo.**.mapper"})
@EnableDiscoveryClient
public class PaymentMain8084 {

    public static void main(String[] args) {

        SpringApplication.run(PaymentMain8084.class,args);
    }
}
