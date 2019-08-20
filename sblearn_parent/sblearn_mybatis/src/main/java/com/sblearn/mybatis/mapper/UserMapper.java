package com.sblearn.mybatis.mapper;

import com.sblearn.mybatis.model.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM t_user")
    @Results({
            @Result(property = "userEmail",  column = "user_email"),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "userPassword", column = "user_password")
    })
    List<UserEntity> getAll();

    @Select("SELECT * FROM t_user WHERE account = #{account}")
    @Results({
            @Result(property = "userEmail",  column = "user_email"),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "userPassword", column = "user_password"),
            @Result(property = "userDesc", column = "user_desc")
    })
    UserEntity getOne(String account);

    @Insert("INSERT INTO t_user(account,user_password,user_email) VALUES(#{account}, #{userPassword}, #{userEmail})")
    void insert(UserEntity user);

    @Update("UPDATE t_user SET user_name=#{userName},user_email=#{userEmail},user_password=#{userPassword},user_desc=#{userDesc} WHERE account =#{account}")
    void update(UserEntity user);

    @Delete("DELETE FROM t_user WHERE account =#{account}")
    void delete(String account);

}
