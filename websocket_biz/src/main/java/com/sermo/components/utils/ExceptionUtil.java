package com.sermo.components.utils;

import com.sermo.components.exception.BaseException;
import com.sermo.components.packet.BasePacket;

public class ExceptionUtil {

    public static BaseException exception(int code, String msg) {
        BasePacket packet = new BasePacket();
        packet.setCode(code);
        packet.setMsg(msg);
        return new BaseException(packet);
    }
}
