package com.oneroom.zsc.onemovies.model;

import com.oneroom.zsc.onemovies.common.BaseModel;
import lombok.Data;

@Data
public class User extends BaseModel {

    private static final long serialVersionUID = 2401834536131259473L;
    /**
     * UID
     */
    private Integer id;

    /**
     *用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String userPwd;

    /**
     * 手机号
     */
    private String userTelephone;

    /**
     *邮箱
     */
    private String userEmail;

    /**
     * 角色（0：用户，1：管理员）
     */
     private String userRole;

    /**
     * IP
     */
    private String userIp;

    /**
     * 是否锁定（0：未锁定，1：锁定）
     */
    private Integer locked;

    /**
     * 逻辑删除状态（0：未删除，1：删除）
     */
    private Integer deleteStatus;


}
