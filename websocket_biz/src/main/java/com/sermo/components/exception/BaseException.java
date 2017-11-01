package com.sermo.components.exception;

import com.sermo.components.packet.BasePacket;

public class BaseException extends Exception {

    private static final long serialVersionUID = 6193314902396086987L;

    private final BasePacket packet;

    public BaseException(BasePacket packet) {
        super(packet.toString());
        this.packet = packet;
    }

    public BaseException(BasePacket packet, Throwable throwable) {
        super(packet.toString(), throwable);
        this.packet = packet;
    }

    /**
     * 异常业务数据包
     * @return
     */
    public BasePacket getPacket() {
        return packet;
    }
}
