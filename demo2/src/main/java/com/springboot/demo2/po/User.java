package com.springboot.demo2.po;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class User implements Serializable {
    private long id;
    private String userName;
    private String userNo;
    private Date createTime;
    private Date modifyTime;
}
