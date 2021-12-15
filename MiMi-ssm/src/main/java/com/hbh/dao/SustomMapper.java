package com.hbh.dao;

import com.hbh.entity.Sustom;
import com.hbh.entity.SustomExample;
import java.util.List;

public interface SustomMapper {
    int deleteByPrimaryKey(Integer cusid);

    int insert(Sustom record);

    int insertSelective(Sustom record);

    List<Sustom> selectByExample(SustomExample example);

    Sustom selectByPrimaryKey(Integer cusid);

    int updateByPrimaryKeySelective(Sustom record);

    int updateByPrimaryKey(Sustom record);
}