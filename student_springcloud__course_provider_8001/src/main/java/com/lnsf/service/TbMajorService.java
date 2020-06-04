package com.lnsf.service;

import com.lnsf.pojo.TbMajor;
import com.lnsf.pojo.TbMajorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbMajorService {
    long countByExample(TbMajorExample example);

    int deleteByExample(TbMajorExample example);

    int deleteByPrimaryKey(Integer majornum);


    int insertSelective(TbMajor record);

    List<TbMajor> selectByExample(TbMajorExample example);

    TbMajor selectByPrimaryKey(Integer majornum);

    int updateByExampleSelective(@Param("record") TbMajor record, @Param("example") TbMajorExample example);

    int updateByExample(@Param("record") TbMajor record, @Param("example") TbMajorExample example);

    int updateByPrimaryKeySelective(TbMajor record);

    int updateByPrimaryKey(TbMajor record);
}