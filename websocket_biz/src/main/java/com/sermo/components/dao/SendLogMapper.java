package com.sermo.components.dao;

import java.util.List;

import com.sermo.components.domain.SendLog;
import com.sermo.components.domain.SendLogExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SendLogMapper {
    int countByExample(SendLogExample example);

    int deleteByExample(SendLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SendLog record);

    int insertSelective(SendLog record);

    List<SendLog> selectByExample(SendLogExample example);

    SendLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SendLog record, @Param("example") SendLogExample example);

    int updateByExample(@Param("record") SendLog record, @Param("example") SendLogExample example);

    int updateByPrimaryKeySelective(SendLog record);

    int updateByPrimaryKey(SendLog record);
}