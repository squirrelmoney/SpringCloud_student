package com.lnsf.service;

import com.lnsf.pojo.TbDept;
import com.lnsf.pojo.TbDeptExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbDeptService {
    long countByExample(TbDeptExample example);

    int deleteByPrimaryKey(Integer deptnum);

    List<TbDept> selectByExample(TbDeptExample example);

    int insertSelective(TbDept record);

    TbDept selectByPrimaryKey(Integer deptnum);

    int updateByPrimaryKeySelective(TbDept record);

}