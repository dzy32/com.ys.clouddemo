package com.ys.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author YS
 * @data 2021/3/4 22:33
 */

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigMain3377 {

    public static void main(String[] args) {

        SpringApplication.run(NacosConfigMain3377.class,args);
    }
}
