package com.sblearn.jpa;

import com.sblearn.jpa.entity.User;
import com.sblearn.jpa.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestJpa {

    @Autowired
    UserService userService;

    @Test
    public void testUser(){
        User user = new User();
        user.setAccount("10086");
        user.setUserDesc("中國移動");
        user.setUserEmail("a@139.com");
        user.setUserPassword("10081");
        user.setUserName("中移");
        userService.save(user);
        System.out.println(userService.findOne("10086"));

    }
}
