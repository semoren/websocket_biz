package com.sermo.components.packet;

public class BasePacket {
    /**
     * 业务编码
     */
    private int code;

    /**
     * 业务提示
     */
    private String msg;

    /**
     * 业务数据
     */
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BasePacket{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
