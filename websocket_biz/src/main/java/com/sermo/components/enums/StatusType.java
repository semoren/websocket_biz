package com.sermo.components.enums;

public enum StatusType {
    NOTSEND(0), SEND(1);

    private int value;

    StatusType(int value) {
        this.value = value;
    }
}
