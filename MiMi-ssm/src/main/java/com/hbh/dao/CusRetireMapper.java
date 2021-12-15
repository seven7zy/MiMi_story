package com.hbh.dao;

import com.hbh.entity.CusRetire;
import com.hbh.entity.CusRetireExample;
import java.util.List;

public interface CusRetireMapper {
    int deleteByPrimaryKey(Integer saleid);

    int insert(CusRetire record);

    int insertSelective(CusRetire record);

    List<CusRetire> selectByExample(CusRetireExample example);

    CusRetire selectByPrimaryKey(Integer saleid);

    int updateByPrimaryKeySelective(CusRetire record);

    int updateByPrimaryKey(CusRetire record);
}