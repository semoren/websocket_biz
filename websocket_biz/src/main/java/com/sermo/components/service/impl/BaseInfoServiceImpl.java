package com.sermo.components.service.impl;

import com.sermo.components.dao.BaseInfoMapper;
import com.sermo.components.dao.SendInfoMapper;
import com.sermo.components.dao.SendLogMapper;
import com.sermo.components.domain.BaseInfo;
import com.sermo.components.domain.SendInfo;
import com.sermo.components.service.BaseInfoService;
import com.sermo.components.utils.UUIDGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BaseInfoServiceImpl implements BaseInfoService {

    @Resource
    private BaseInfoMapper baseInfoMapper;

    @Autowired
    private SendInfoMapper sendInfoMapper;

    @Resource
    private SendLogMapper sendLogMapper;

    @Override
    @Transactional
    public int insert(BaseInfo info) throws Exception {
        saveData(info);
        sendMsg();
        return 0;
    }

    private void sendMsg() {
    }

    private void saveData(BaseInfo info){
        String wbi = UUIDGenerate.generate();
        Date nowDate = new Date();
        info.setId(wbi);
        List<String> users = new ArrayList<>();
        List<SendInfo> sendInfos = new ArrayList<>(users.size());
        SendInfo sendInfo = null;
        for (String user : users){
            sendInfo = new SendInfo(wbi, user, nowDate, nowDate);
            sendInfos.add(sendInfo);
        }
        baseInfoMapper.insert(info);
        sendInfoMapper.insertByBatch(sendInfos);
    }
}
