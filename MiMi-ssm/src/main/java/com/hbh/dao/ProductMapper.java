package com.hbh.dao;

import com.hbh.entity.Product;
import com.hbh.entity.ProductExample;
import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer proid);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Integer proid);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}