package com.ys.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ys
 * @date 2021/2/1 14:37
 */

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3242 {

    public static void main(String[] args){
        SpringApplication.run(ConfigClientMain3242.class);
    }
}
