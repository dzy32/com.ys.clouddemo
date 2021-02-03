package demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ys
 * @date 2021/2/2 18:20
 */
@Component
@EnableBinding(Sink.class)
public class MessageController {


    @Value("${server.port}")
    private String port;

    @StreamListener(Sink.INPUT)
    public void send(Message<String> message){
        System.out.println("*******消费者1好 port:"+port+" ----receive message："+message.getPayload());
    }
}
