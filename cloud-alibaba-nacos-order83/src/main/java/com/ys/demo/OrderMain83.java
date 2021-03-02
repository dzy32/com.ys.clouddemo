package com.ys.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author YS
 * @data 2021/3/2 21:56
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderMain83 {
    public static void main(String[] args) {

        SpringApplication.run(OrderMain83.class,args);
    }
}
