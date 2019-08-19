package com.sblearn.jpa.service;

import com.sblearn.jpa.entity.User;

import java.util.List;

public interface UserService {

    public void save(User user);

    public void delete(String id);

    public void update(User user);

    public List<User> findAll();

    public User findOne(String id);

}
