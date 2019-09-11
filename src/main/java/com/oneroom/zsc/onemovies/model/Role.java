package com.oneroom.zsc.onemovies.model;

import com.oneroom.zsc.onemovies.common.BaseModel;
import lombok.Data;

@Data
public class Role extends BaseModel {
    private static final long serialVersionUID = -1894163644285296223L;

    /**
     * 角色Id
     */
    private Integer id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色key;
     */
    private String roleKey;

    /**
     * 角色状态,0：正常；1：禁用,
     */
    private Integer roleStatus;

    /**
     * 角色描述
     */
    private String description;
}
