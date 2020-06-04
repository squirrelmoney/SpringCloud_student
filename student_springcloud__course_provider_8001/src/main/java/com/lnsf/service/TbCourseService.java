package com.lnsf.service;
import com.lnsf.pojo.TbCourse;
import com.lnsf.pojo.TbCourseExample;

import java.util.List;
public interface TbCourseService {
    long countByExample(TbCourseExample example);

    int deleteByPrimaryKey(Integer coursenum);

    int insertSelective(TbCourse record);

    List<TbCourse> selectByExample(TbCourseExample example);


    TbCourse selectByPrimaryKey(Integer coursenum);


    int updateByPrimaryKeySelective(TbCourse record);

}