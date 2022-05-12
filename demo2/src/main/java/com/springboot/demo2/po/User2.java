package com.springboot.demo2.po;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name="user")
public class User2 implements Serializable {
    @Id
    private long id;
    private String userName;
    private String userNo;
    private Date createTime;
    private Date modifyTime;
}
