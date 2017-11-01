package com.sermo.components.domain;

import com.sermo.components.utils.UUIDGenerate;

import java.util.Date;


public class SendInfo {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 对应base_info中的id
     */
    private String wbiId;

    /**
     * 接收人
     */
    private String user;

    /**
     * 0-未完成 1-已完成
     */
    private Integer status;

    private Date createTime;

    private Date updateTime;

    public SendInfo() {
    }

    public SendInfo(String wbiId, String user) {
        this.id = UUIDGenerate.generate();
        this.wbiId = wbiId;
        this.user = user;
        this.status = 0;
        this.createTime = new Date();
        this.updateTime = new Date();
    }

    public SendInfo(String wbiId, String user, Date createTime, Date updateTime) {
        this.id = UUIDGenerate.generate();
        this.wbiId = wbiId;
        this.user = user;
        this.status = 0;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public SendInfo(String id, String wbiId, Integer status) {
        this.id = id;
        this.wbiId = wbiId;
        this.status = status;
        this.updateTime = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWbiId() {
        return wbiId;
    }

    public void setWbiId(String wbiId) {
        this.wbiId = wbiId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
