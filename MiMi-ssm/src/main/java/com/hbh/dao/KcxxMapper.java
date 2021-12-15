package com.hbh.dao;

import com.hbh.entity.Kcxx;
import com.hbh.entity.KcxxExample;
import java.util.List;

public interface KcxxMapper {
    int deleteByPrimaryKey(Integer proid);

    int insert(Kcxx record);

    int insertSelective(Kcxx record);

    List<Kcxx> selectByExample(KcxxExample example);

    Kcxx selectByPrimaryKey(Integer proid);

    int updateByPrimaryKeySelective(Kcxx record);

    int updateByPrimaryKey(Kcxx record);
}