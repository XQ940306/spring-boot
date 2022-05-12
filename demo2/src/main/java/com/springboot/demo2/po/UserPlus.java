package com.springboot.demo2.po;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class UserPlus implements Serializable {
    private long id;
    private String personName;
    private String personNo;
    private Date addTime;
    private Date updateTime;
}
