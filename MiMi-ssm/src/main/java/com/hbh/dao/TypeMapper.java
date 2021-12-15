package com.hbh.dao;

import com.hbh.entity.Type;
import com.hbh.entity.TypeExample;
import java.util.List;

public interface TypeMapper {
    int deleteByPrimaryKey(Integer protypeid);

    int insert(Type record);

    int insertSelective(Type record);

    List<Type> selectByExample(TypeExample example);

    Type selectByPrimaryKey(Integer protypeid);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}