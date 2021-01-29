package cloud.ys.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



/**
 * @author ys
 * @date 2021/1/8 17:49
 */

@SpringBootApplication
@EnableEurekaClient
public class GatewayMain9527 {

    public static void main(String[] args) {

        SpringApplication.run(GatewayMain9527.class,args);
    }
}
