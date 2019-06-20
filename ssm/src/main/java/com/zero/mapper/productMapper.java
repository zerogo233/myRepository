package com.zero.mapper;

import com.zero.pojo.product;
import com.zero.pojo.productExample;
import com.zero.pojo.productWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface productMapper {
    int countByExample(productExample example);

    int deleteByExample(productExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(productWithBLOBs record);

    int insertSelective(productWithBLOBs record);

    List<productWithBLOBs> selectByExampleWithBLOBs(productExample example);

    List<product> selectByExample(productExample example);

    productWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") productWithBLOBs record, @Param("example") productExample example);

    int updateByExampleWithBLOBs(@Param("record") productWithBLOBs record, @Param("example") productExample example);

    int updateByExample(@Param("record") product record, @Param("example") productExample example);

    int updateByPrimaryKeySelective(productWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(productWithBLOBs record);

    int updateByPrimaryKey(product record);
}