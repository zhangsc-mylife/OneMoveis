package com.oneroom.zsc.onemovies.mapper;

import com.oneroom.zsc.onemovies.model.Resource;
import org.apache.ibatis.annotations.Param;

public interface ResourceMapper {

    /**
     * 查询资源通过id
     * @param id
     * @return
     */

    Resource findById(@Param("id") Integer id);

    /**
     * 资源类型查找
     * @param sourceUrl
     * @return
     */

    Resource findBySourceUrl(String sourceUrl);

    /**
     * 资源名称查找
     * @param sourceName
     * @return
     */
    Resource findBySourceName(String sourceName);

    /**
     * 增加资源
     * @param source
     * @return
     */
     int insert(Resource source);

    /**
     * 删除角色的权限
     * @param id
     */

    void deleteGrant(@Param("id") Integer id);

    /**
     * 删出资源
     * @param sourceName
     */
     void deleteSource(String sourceName);




}
