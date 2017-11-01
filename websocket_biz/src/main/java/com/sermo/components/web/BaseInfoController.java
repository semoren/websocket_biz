package com.sermo.components.web;

import com.sermo.components.dao.BaseInfoMapper;
import com.sermo.components.domain.BaseInfo;
import com.sermo.components.packet.BasePacket;
import com.sermo.components.service.BaseInfoService;
import com.sermo.components.utils.ExceptionUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class BaseInfoController extends BaseController{

    @Resource
    private BaseInfoMapper mapper;

    @Resource
    private BaseInfoService service;

    @GetMapping("/test")
    public Object get(){
        return mapper.selectByPrimaryKey("1");
    }

    @PostMapping("/insert")
    public BasePacket insert(@RequestBody BaseInfo info){
        try {
            service.insert(info);
            return getSuccessPacket("");
        } catch (Exception e) {
           return getErrorPacker(ExceptionUtil.exception(500, "失败"));
        }
    }
}
