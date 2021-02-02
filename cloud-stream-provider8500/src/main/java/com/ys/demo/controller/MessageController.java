package com.ys.demo.controller;

import com.ys.demo.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ys
 * @date 2021/2/2 18:20
 */
@RestController
public class MessageController {

    @Resource
    private MessageService messageService;

    @GetMapping("/sendMe")
    public String send(){
        return messageService.send();
    }
}
