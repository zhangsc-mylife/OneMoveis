package com.oneroom.zsc.onemovies.server.impl;

import com.oneroom.zsc.onemovies.mapper.UserMapper;
import com.oneroom.zsc.onemovies.model.User;
import com.oneroom.zsc.onemovies.server.UserService;
import com.oneroom.zsc.onemovies.utils.MD5Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("")
@Slf4j

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findAll(){
        return userMapper.findAll();
    }

    @Override
    public User findByUserName(String userName){
        log.info("findByUserName:"+userName);
        return userMapper.findByUserName(userName);
    }

    @Override
    public User findById(int id){
        log.info("findById:"+id);
        return userMapper.findById(id);
    }

    @Override
    public void addUser(User user){
        log.info("addUser"+user);
        if(user.getUid()!=null){
            User dbUser = userMapper.findById(user.getId());
            dbUser.setUserName(user.getUserName());
            if(user.getUserPwd().length()<20){
                //避免二次加密
                dbUser.setUserPwd(MD5Utils.md5Encode(user.getUserPwd()));
            }
            dbUser.setUserTelephone(user.getUserTelephone());
            dbUser.setUserEmail(user.getUserEmail());
            dbUser.setLocked(user.getLocked());
            dbUser.setUpdateTime(new Date());

            log.info("userinfo:"+user.toString());
            userMapper.update(user);
        }else{

            user.setUpdateTime(new Date());
            user.setDeleteStatus(0);
            user.setUserPwd(MD5Utils.md5Encode(user.getUserPwd()));

        }
    }



}
