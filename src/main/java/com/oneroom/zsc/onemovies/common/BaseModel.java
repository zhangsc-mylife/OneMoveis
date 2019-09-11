package com.oneroom.zsc.onemovies.common;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class BaseModel implements Serializable {

    private static final long serialVersionUID = -250118731239275742L;

    /**
     * 添加时间
     */
    private Date addUserTime;

    /**
     * 添加人
     */
    private String addUser;

    /**
     *修改时间
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * Setter and Getter
     */

    public Date getAddUserTime() {
        return addUserTime;
    }

    public void setAddUserTime(Date addUserTime) {
        this.addUserTime = addUserTime;
    }

    public String getAddUser() {
        return addUser;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}
