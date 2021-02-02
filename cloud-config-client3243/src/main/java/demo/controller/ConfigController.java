package demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ys
 * @date 2021/2/1 14:41
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${config.value}")
    private String configvalue;

    @GetMapping("/get")
    public String getConfigvalue(){
        return configvalue;
    }
}
