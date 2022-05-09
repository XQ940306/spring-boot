package com.springboot.demo1.controllers;

import com.springboot.demo1.config.AppConfig;
import com.springboot.demo1.config.UserConfig;
import com.springboot.demo1.services.BeanService;
import com.springboot.demo1.services.UserService;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.naming.Context;
import java.applet.AppletContext;

@RestController
public class accountcontroller {

    @GetMapping("index")
    public String index() {
        return "Hello World";
    }


    @Value("${name1:default}")
    private String name1;
    @Value("${name2:default}")
    private String name2;
    @Value("${name3:default}")
    private String name3;


    @GetMapping("/keyAndvalue")
    public String keyAndvalue() {
        System.out.println("name1:" + name1);
        System.out.println("name2:" + name2);
        System.out.println("name3:" + name3);
        return "name1:" + name1 + ",name2:" + name2 + ",name3:" + name3;
    }

    @Autowired
    private AppConfig appConfig;

    @Autowired
    private UserConfig userConfig;

    @GetMapping("/map")
    public String map() {
        System.out.println("name:" + appConfig.name);
        System.out.println("address:" + appConfig.address);
        System.out.println("port:" + appConfig.port);
        System.out.println(appConfig.listStr.get(0)+","+appConfig.listStr.get(1));
        System.out.println(appConfig.prop.get("name"));
        System.out.println("[0] name:"+appConfig.dependOn.get(0).getName()+",url:"+appConfig.dependOn.get(0).getUrl());
        return "name:" + appConfig.name + ",address:" + appConfig.address + ",port:" + appConfig.port;
    }

    @GetMapping("/user")
    public  String User(){
        System.out.println(userConfig);
        return  userConfig.toString();
    }


    @Autowired
    private UserService userService;

    @Autowired
    private BeanService beanService11;

    @Resource
    private ConfigurableApplicationContext context;
    
    @GetMapping("/bean")
    public  void bean(){
        UserService userServiceAAA = context.getBean("userServiceAAA",UserService.class);
        BeanService beanServiceBBB = context.getBean("beanServiceBBB", BeanService.class);
        System.out.println(userServiceAAA);
        System.out.println(beanServiceBBB);

        System.out.println(beanService11);
        System.out.println(userService);
    }
}
