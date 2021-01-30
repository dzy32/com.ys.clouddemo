package com.ys.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ys
 * @date 2021/1/30 16:32
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServerMain3232 {
    public static void main(String[] args){
        System.out.println("test");
        SpringApplication.run(ConfigServerMain3232.class);
    }
}
