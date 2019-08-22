package com.sblearn.mongodb.dao;

import com.sblearn.mongodb.model.User;

public interface UserDao {

    /**
     * 创建对象
     * @param user
     */
    public void saveUser(User user);

    /**
     * 根据用户名查询对象
     * @param userName
     * @return
     */
    public User findUserByUserName(String userName);

    /**
     * 更新对象
     * @param user
     */
    public long updateUser(User user);

    /**
     * 删除对象
     * @param id
     */
    public void deleteUserById(Long id);
}
