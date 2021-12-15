package com.hbh.dao;

import com.hbh.entity.Ckretire;
import com.hbh.entity.CkretireExample;
import java.util.List;

public interface CkretireMapper {
    int deleteByPrimaryKey(Integer inid);

    int insert(Ckretire record);

    int insertSelective(Ckretire record);

    List<Ckretire> selectByExample(CkretireExample example);

    Ckretire selectByPrimaryKey(Integer inid);

    int updateByPrimaryKeySelective(Ckretire record);

    int updateByPrimaryKey(Ckretire record);
}