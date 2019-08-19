package com.sblearn.jpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "T_USER")
public class User implements Serializable {


    private String userEmail;
    @Id
    private String account;

    private String userPassword;

    private String userName;

    private String userDesc;

}
