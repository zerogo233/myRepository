package com.zero.mapper;

import com.zero.pojo.payInfo;
import com.zero.pojo.payInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface payInfoMapper {
    int countByExample(payInfoExample example);

    int deleteByExample(payInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(payInfo record);

    int insertSelective(payInfo record);

    List<payInfo> selectByExample(payInfoExample example);

    payInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") payInfo record, @Param("example") payInfoExample example);

    int updateByExample(@Param("record") payInfo record, @Param("example") payInfoExample example);

    int updateByPrimaryKeySelective(payInfo record);

    int updateByPrimaryKey(payInfo record);
}