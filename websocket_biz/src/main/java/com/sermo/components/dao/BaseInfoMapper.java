package com.sermo.components.dao;

import java.util.List;

import com.sermo.components.domain.BaseInfo;
import com.sermo.components.domain.BaseInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseInfoMapper {

    int countByExample(BaseInfoExample example);

    int deleteByExample(BaseInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseInfo record);

    int insertSelective(BaseInfo record);

    List<BaseInfo> selectByExample(BaseInfoExample example);

    BaseInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseInfo record, @Param("example") BaseInfoExample example);

    int updateByExample(@Param("record") BaseInfo record, @Param("example") BaseInfoExample example);

    int updateByPrimaryKeySelective(BaseInfo record);

    int updateByPrimaryKey(BaseInfo record);
}