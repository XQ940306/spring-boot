package com.springboot.demo1.config;

import com.springboot.demo1.services.BeanService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanSpringConfig {
    @Bean
    public BeanService beanServiceBBB(){
        return  new BeanService();
    }
}
