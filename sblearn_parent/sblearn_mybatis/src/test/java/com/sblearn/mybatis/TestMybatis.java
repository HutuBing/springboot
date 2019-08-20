package com.sblearn.mybatis;

import com.sblearn.mybatis.mapper.UserMapper;
import com.sblearn.mybatis.model.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMybatis {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
        UserEntity userEntity = new UserEntity();
        userEntity.setAccount("admin");
        userEntity.setUserEmail("111@qq.com");
        userEntity.setUserPassword("admin123");
        userMapper.insert(userEntity);
        UserEntity userEntity1 = userMapper.getOne("admin");
        System.out.println(userEntity1);
        userEntity1.setUserDesc("用户描述");
        userEntity1.setUserName("改名字");
        userMapper.update(userEntity1);
        System.out.println(userMapper.getOne("admin"));
        userMapper.delete("admin");
        System.out.println(userMapper.getOne("admin"));
    }
}
