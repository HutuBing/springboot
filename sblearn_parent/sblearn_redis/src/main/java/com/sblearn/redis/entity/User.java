package com.sblearn.redis.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private String email;
    private String account;
    private String password;
    private String userName;
    private String desc;

    public User(String email, String account, String password, String userName, String desc) {
        this.email = email;
        this.account = account;
        this.password = password;
        this.userName = userName;
        this.desc = desc;
    }

}
