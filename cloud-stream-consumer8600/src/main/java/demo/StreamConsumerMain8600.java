package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ys
 * @date 2021/2/2 16:40
 */

@SpringBootApplication
@EnableEurekaClient
public class StreamConsumerMain8600 {
    public static void main(String[] args){
        SpringApplication.run(StreamConsumerMain8600.class);
    }
}
