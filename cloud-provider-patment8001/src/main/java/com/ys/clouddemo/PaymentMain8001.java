package com.ys.clouddemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ys
 * @date 2020/12/25 14:55
 */

@SpringBootApplication
@MapperScan(basePackages = {"com.ys.clouddemo.**.mapper"})
public class PaymentMain8001 {

    public static void main(String[] args) {

        SpringApplication.run(PaymentMain8001.class,args);
    }
}
