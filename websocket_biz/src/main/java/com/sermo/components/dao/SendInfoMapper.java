package com.sermo.components.dao;

import java.util.List;

import com.sermo.components.domain.SendInfo;
import com.sermo.components.domain.SendInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SendInfoMapper {

    int countByExample(SendInfoExample example);

    int deleteByExample(SendInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(SendInfo record);

    int insertByBatch(List<SendInfo> infos);

    int insertSelective(SendInfo record);

    List<SendInfo> selectByExample(SendInfoExample example);

    SendInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SendInfo record, @Param("example") SendInfoExample example);

    int updateByExample(@Param("record") SendInfo record, @Param("example") SendInfoExample example);

    int updateByPrimaryKeySelective(SendInfo record);

    int updateByPrimaryKey(SendInfo record);
}