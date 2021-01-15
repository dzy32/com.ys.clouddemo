package com.ys.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author ys
 * @date 2021/1/8 17:49
 */

@SpringBootApplication
@MapperScan(basePackages = {"com.ys.demo.**.mapper"})
@EnableDiscoveryClient
public class OrderMain81 {

    public static void main(String[] args) {

        SpringApplication.run(OrderMain81.class,args);
    }
}
