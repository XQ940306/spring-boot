package com.springboot.demo1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(value = {"classpath:context/bean.xml"})
public class SpringConfig {

}
