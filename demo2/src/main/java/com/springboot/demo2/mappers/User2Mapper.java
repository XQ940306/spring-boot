package com.springboot.demo2.mappers;

import com.springboot.demo2.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface User2Mapper {
    /*
     * 获取用户列表
     * */
    List<User> getAllUsers();
}
