package com.ys.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ys
 * @date 2021/1/8 17:49
 */

@SpringBootApplication
@MapperScan(basePackages = {"com.ys.clouddemo.**.mapper"})
public class OrderMain80 {

    public static void main(String[] args) {

        SpringApplication.run(OrderMain80.class,args);
    }
}
