package com.lnsf.service;

import com.lnsf.pojo.TbStucourse;
import com.lnsf.pojo.TbStucourseExample;
import com.lnsf.pojo.TbStucourseKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbStucourseService {
    long countByExample(TbStucourseExample example);

    int deleteByPrimaryKey(TbStucourseKey key);


    int insertSelective(TbStucourse record);


    TbStucourse selectByPrimaryKey(TbStucourseKey key);

    int updateByPrimaryKeySelective(TbStucourse record);

    int updateByPrimaryKey(TbStucourse record);

    List<TbStucourse> selectByExample(TbStucourseExample example);

    List<TbStucourse> selectByStudentnum(String studentnum);

    List<TbStucourse> selectByCoursenum(int Coursenum);

    List<TbStucourse> selectByTeachernum(int Teachernum);

    TbStucourse selectBystudentnumandcoursenum(String studentnum ,int Coursenum );
}