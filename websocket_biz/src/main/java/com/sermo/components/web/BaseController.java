package com.sermo.components.web;

import com.sermo.components.exception.BaseException;
import com.sermo.components.packet.BasePacket;

public abstract class BaseController {

    protected BasePacket getSuccessPacket(Object data) {
        BasePacket packet = new BasePacket();
        packet.setCode(200);
        packet.setMsg("");
        packet.setData(data);
        return packet;
    }

    protected BasePacket getErrorPacker(BaseException e) {
        BasePacket packet = new BasePacket();
        if (packet.getCode() == 503) {
            System.out.println("System error!" + e);
        }
        packet.setData("");
        return packet;
    }
}
