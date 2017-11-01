package com.sermo.components.utils;

import java.util.UUID;

public class UUIDGenerate {

    public static String generate(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
