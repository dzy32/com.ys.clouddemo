package com.ys.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author ys
 * @date 2021/1/8 17:49
 */

@SpringBootApplication
@MapperScan(basePackages = {"com.ys.demo.**.mapper"})
@EnableEurekaClient
@EnableFeignClients
public class OrderMain83 {

    public static void main(String[] args) {

        SpringApplication.run(OrderMain83.class,args);
    }
}
