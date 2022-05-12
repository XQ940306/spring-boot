package com.springboot.demo2.mappers;

import com.springboot.demo2.po.User2;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
@org.apache.ibatis.annotations.Mapper
public interface User3Mapper extends Mapper<User2> {

}