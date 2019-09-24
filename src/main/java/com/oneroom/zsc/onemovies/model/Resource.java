package com.oneroom.zsc.onemovies.model;

import com.oneroom.zsc.onemovies.common.BaseModel;
import lombok.Data;

/**
 * 资源
 */
@Data
public class Resource extends BaseModel {
    private static final long serialVersionUID = 4558392989351717868L;

    /**
     * 资源ID
     */
    private Integer id;

    /**
     * 资源名称
     */
    private String sourceName;

    /**
     * 资源唯一标识
     */
    private String sourceKey;

    /**
     * 资源类型
     */
    private String sourceUrl;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 图标
     */
    private String icon;

    /**
     * 是否隐藏
     * 0显示，1隐藏
     */
    private Integer isHide;

    /**
     * 描述
     */
    private String description;

    /**
     * 时间
     */
    private String sourceTime;
}
