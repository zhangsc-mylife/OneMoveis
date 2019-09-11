package com.oneroom.zsc.onemovies.mapper;

import com.oneroom.zsc.onemovies.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {


    /**
     * find all user
     * excepting the password
     * @return
     */
    public List<User> findAll();

    /**
     * find
     * @param userName
     * @param userPwd
     * @return
     */
    public User find(@Param("userName") String userName,@Param("userPwd") String userPwd);

    /**
     * find user By id
     * @param id
     * @return
     */
    public User findById(int id);

    /**
     * find user By userName
     * @param userName
     * @return
     */
    public User findByUserName(String userName);

    /**
     * insert user
     * @param user
     * @return
     */
    public int insert(User user);

    /**
     * update user
     * @param user
     * @return
     */
    public int update(User user);

    /**
     * delete by id
     * @param id
     * @return
     */
    public int deleteById(int id);

    /**
     * delete by userName
     * @param userName
     * @return
     */
    public int deleteByUserNmae(String userName);
}
