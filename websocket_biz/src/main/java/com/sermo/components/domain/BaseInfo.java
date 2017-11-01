package com.sermo.components.domain;

import java.util.Date;

/**
 * 基础信息
 */
public class BaseInfo {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer mId;

    /**
     * 消息
     */
    private String msg;

    /**
     * url
     */
    private String url;

    /**
     * 标题
     */
    private String title;

    /**
     * 0-未完成 1-已完成
     */
    private Integer status;

    /**
     * 系统 0-合同系统
     */
    private Integer system;

    /**
     * 0-发给系统多个人 1-发给系统所有人
     */
    private Integer type;

    private Date createTime;

    private Date updateTime;

    public BaseInfo() {
    }

    public BaseInfo(Integer mId, String msg, String url, String title, Integer system, Integer type) {
        this.mId = mId;
        this.msg = msg;
        this.url = url;
        this.title = title;
        this.system = system;
        this.type = type;
        this.createTime = new Date();
        this.updateTime = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSystem() {
        return system;
    }

    public void setSystem(Integer system) {
        this.system = system;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
