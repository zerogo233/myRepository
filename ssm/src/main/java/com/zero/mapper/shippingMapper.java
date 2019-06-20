package com.zero.mapper;

import com.zero.pojo.shipping;
import com.zero.pojo.shippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface shippingMapper {
    int countByExample(shippingExample example);

    int deleteByExample(shippingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(shipping record);

    int insertSelective(shipping record);

    List<shipping> selectByExample(shippingExample example);

    shipping selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") shipping record, @Param("example") shippingExample example);

    int updateByExample(@Param("record") shipping record, @Param("example") shippingExample example);

    int updateByPrimaryKeySelective(shipping record);

    int updateByPrimaryKey(shipping record);
}