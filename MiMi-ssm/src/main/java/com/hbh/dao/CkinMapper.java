package com.hbh.dao;

import com.hbh.entity.Ckin;
import com.hbh.entity.CkinExample;
import java.util.List;

public interface CkinMapper {
    int deleteByPrimaryKey(Integer inid);

    int insert(Ckin record);

    int insertSelective(Ckin record);

    List<Ckin> selectByExample(CkinExample example);

    Ckin selectByPrimaryKey(Integer inid);

    int updateByPrimaryKeySelective(Ckin record);

    int updateByPrimaryKey(Ckin record);
}