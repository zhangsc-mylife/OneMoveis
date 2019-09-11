package com.oneroom.zsc.onemovies.server;

import com.oneroom.zsc.onemovies.model.User;

import java.util.List;

public interface UserService  {

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 更新和保存
     * @param user
     * @return
     */
    User save(User user);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    User findById(int id);

    /**
     *根据姓名查询
     * @param userName
     * @return
     */
    User findByUserName(String userName);

    /**
     * 登陆操作
     * @param userName
     * @param userPwd
     * @return
     */
    User handleLogin(String userName,String userPwd);

    /**
     * 注册
     * @param user
     */
    void addUser(User user);

    /**
     * 更新密码
     * @param id
     * @param newPwd
     * @return
     */
    boolean updatePassword(int id,String newPwd);

    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean delete(int id);
}
