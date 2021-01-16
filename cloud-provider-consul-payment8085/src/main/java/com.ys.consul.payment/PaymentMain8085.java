package com.ys.consul.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ys
 * @date 2020/12/25 14:55
 */

@SpringBootApplication
@MapperScan(basePackages = {"com.ys.consul.**.mapper"})
@EnableDiscoveryClient
public class PaymentMain8085 {

    public static void main(String[] args) {

        SpringApplication.run(PaymentMain8085.class,args);
    }
}
