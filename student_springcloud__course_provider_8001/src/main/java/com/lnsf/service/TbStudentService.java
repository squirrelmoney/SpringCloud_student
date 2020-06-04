package com.lnsf.service;

import com.lnsf.pojo.TbStudent;
import com.lnsf.pojo.TbStudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbStudentService {
    long countByExample(TbStudentExample example);

    int deleteByPrimaryKey(String studentnum);

    int insert(TbStudent record);

    int insertSelective(TbStudent record);

    List<TbStudent> selectByExample(TbStudentExample example);

    TbStudent selectByPrimaryKey(String studentnum);

    int updateByPrimaryKeySelective(TbStudent record);

}