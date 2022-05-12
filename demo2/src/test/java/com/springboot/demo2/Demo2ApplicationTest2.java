package com.springboot.demo2;

import com.alibaba.fastjson.JSON;
import com.springboot.demo2.mappers.User2Mapper;
import com.springboot.demo2.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class Demo2ApplicationTest2 {

    @Test
    void contextLoads() {

    }

    @Autowired
    private User2Mapper user2Mapper;

    @Test
    void getAllUsers() {
        List<User> users = user2Mapper.getAllUsers();
        System.out.println("*************getAllUsers****************");
        System.out.println(users);
        System.out.println(JSON.toJSONString(users));
    }
}