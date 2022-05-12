package com.springboot.demo2.mappers;

import com.springboot.demo2.po.User;
import com.springboot.demo2.po.UserPlus;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> getAllUsers();

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "personName", column = "user_name"),
            @Result(property = "personNo", column = "no"),
            @Result(property = "updateTime", column = "modify_time"),
            @Result(property = "addTime", column = "createTime"),
    })
    @Select("select user_name ,user_no as no ,id as id,modify_time,create_time as createTime from user where id=#{id}")
    UserPlus getUserById(Long id);

    @Select("select * from user where user_name like concat('%',#{name},'%')")
    List<User> getUsersByName(String name);

    @Insert({"insert into user(user_name,user_no,create_time) values(#{userName},#{userNo},#{createTime})"})
    @SelectKey(statement = "select last_insert_id()", keyProperty = "id", before = false, resultType = Long.class)
    Integer addUser(User user);

    @Update("update user set user_name=#{userName},modify_time=#{modifyTime} where id=#{id}")
    Integer updateUserById(User user);

    @Delete("delete from user where id=#{id}")
    Integer deleteUserById(Long id);
}
