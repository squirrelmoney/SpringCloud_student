package com.lnsf.service;

import com.lnsf.pojo.TbTeacher;
import com.lnsf.pojo.TbTeacherExample;

import java.util.List;

public interface TbTeacherService {
    long countByExample(TbTeacherExample example);


    int deleteByPrimaryKey(String teachernum);

    int insertSelective(TbTeacher record);

    List<TbTeacher> selectByExample(TbTeacherExample example);

    TbTeacher selectByPrimaryKey(String teachernum);

    int updateByPrimaryKeySelective(TbTeacher record);
}