package com.springboot.demo2;

import com.springboot.demo2.mappers.UserMapper;
import com.springboot.demo2.po.User;
import com.springboot.demo2.po.UserPlus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class Demo2ApplicationTests {

    @Test
    void contextLoads() {

    }

    @Autowired
    private UserMapper userMapper;

    @Test
    void getAllUsers() {
        List<User> users = userMapper.getAllUsers();
        System.out.println("*************getAllUsers****************");
        System.out.println(users);
    }

    @Test
    void getUserById() {
        UserPlus user = userMapper.getUserById(1L);
        System.out.println("*************getUserById****************");
        System.out.println(user);
    }

    @Test
    void getUsersByName() {
        List<User> users = userMapper.getUsersByName("强");
        System.out.println("*************getUsersByName****************");
        System.out.println(users);
    }

    @Test
    void addUser() {
        User user = new User();
        user.setUserName("黎强");
        user.setUserNo("Liq");
        user.setCreateTime(new Date());

        long id = userMapper.addUser(user);

        System.out.println("*************addUser****************");
        System.out.println("id:" + id);
    }

    @Test
    void updateUserById() {
        User user = new User();
        user.setUserName("X强");
        user.setUserNo("XIAOQ");
        user.setModifyTime(new Date());
        user.setId(1L);

        long rowCount = userMapper.updateUserById(user);

        System.out.println("*************updateUserById****************");
        System.out.println("rowCount:" + rowCount);
    }


    @Test
    void deleteUserById() {
        long rowCount = userMapper.deleteUserById(3L);
        System.out.println("*************deleteUserById****************");
        System.out.println("rowCount:" + rowCount);
    }
}
