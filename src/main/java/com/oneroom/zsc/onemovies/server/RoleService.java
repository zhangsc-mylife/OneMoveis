package com.oneroom.zsc.onemovies.server;

import com.oneroom.zsc.onemovies.model.Role;

public interface RoleService {
    /**
     * 添加或修改角色
     */
    void saveOrUpdate(Role role);

    /**
     * 给角色分配资源
     */
    void grant(Integer id,String[] resourceId);

    /**
     *
     */
    int find(Integer id);
}
