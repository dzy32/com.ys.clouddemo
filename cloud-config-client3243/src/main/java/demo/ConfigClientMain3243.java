package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ys
 * @date 2021/2/1 14:37
 */

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3243 {

    public static void main(String[] args){
        SpringApplication.run(ConfigClientMain3243.class);
    }
}
