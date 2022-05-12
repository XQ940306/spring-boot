package com.springboot.demo2;

import com.alibaba.fastjson.JSON;
import com.springboot.demo2.mappers.User2Mapper;
import com.springboot.demo2.mappers.User3Mapper;
import com.springboot.demo2.po.User;
import com.springboot.demo2.po.User2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@SpringBootTest
class Demo2ApplicationTest3 {

    @Test
    void contextLoads() {

    }

    @Autowired
    private User3Mapper user3Mapper;

    @Test
    void getAllUsers() {
        Example example = new Example(User2.class);
        example.and().andLike("userName","%强%");

        List<User2> users = user3Mapper.selectByExample(example);
        System.out.println("*************getAllUsers****************");
        System.out.println(users);
        System.out.println(JSON.toJSONString(users));
    }
}