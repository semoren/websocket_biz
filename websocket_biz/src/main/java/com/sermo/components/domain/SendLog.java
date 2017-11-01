package com.sermo.components.domain;

import java.util.Date;

public class SendLog {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String wbiId;

    private String wsiId;

    private String user;

    private Integer system;

    /**
     * 0-发送出去 1-已接收
     */
    private Integer status;

    private Date time;

    public SendLog(String wbiId, String wsiId, String user, Integer system, Integer status) {
        this.wbiId = wbiId;
        this.wsiId = wsiId;
        this.user = user;
        this.system = system;
        this.status = status;
        this.time = new Date();
    }

    public SendLog(String wbiId, String wsiId, String user) {
        this.wbiId = wbiId;
        this.wsiId = wsiId;
        this.user = user;
        this.system = 0;
        this.status = 0;
        this.time = new Date();
    }

    public SendLog(String wbiId, String wsiId, String user, Integer status) {
        this.wbiId = wbiId;
        this.wsiId = wsiId;
        this.user = user;
        this.status = status;
        this.system = 0;
        this.time = new Date();
    }

    public SendLog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWbiId() {
        return wbiId;
    }

    public void setWbiId(String wbiId) {
        this.wbiId = wbiId;
    }

    public String getWsiId() {
        return wsiId;
    }

    public void setWsiId(String wsiId) {
        this.wsiId = wsiId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getSystem() {
        return system;
    }

    public void setSystem(Integer system) {
        this.system = system;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
