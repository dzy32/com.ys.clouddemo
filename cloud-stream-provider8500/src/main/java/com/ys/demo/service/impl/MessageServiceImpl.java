package com.ys.demo.service.impl;

import com.ys.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author ys
 * @date 2021/2/2 18:11
 */

@EnableBinding(Source.class)
public class MessageServiceImpl implements MessageService {


    @Autowired(required = true)
    @Qualifier("output")
    private MessageChannel ouput;

    @Override
    public String send() {
        String uuid = UUID.randomUUID().toString();
        ouput.send(MessageBuilder.withPayload(uuid).build());
        System.out.println("******stream send message "+uuid);
        return null;
    }
}
