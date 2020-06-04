package com.lnsf.service;

import com.lnsf.pojo.TbControl;
import com.lnsf.pojo.TbControlExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbControlService {

    int deleteByExample(TbControlExample example);

    int insert(TbControl record);

    int insertSelective(TbControl record);

    List<TbControl> selectByExample(TbControlExample example);

    int updateByExampleSelective(@Param("record") TbControl record, @Param("example") TbControlExample example);

}