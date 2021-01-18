package com.ys.myribbonrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ys
 * @date 2021/1/18 11:47
 */
@Configuration
public class SelfRibbonRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}
