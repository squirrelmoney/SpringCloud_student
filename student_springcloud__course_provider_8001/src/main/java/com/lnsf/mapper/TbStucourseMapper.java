package com.lnsf.mapper;

import com.lnsf.pojo.TbStucourse;
import com.lnsf.pojo.TbStucourseExample;
import com.lnsf.pojo.TbStucourseKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.annotation.Priority;

@Repository
public interface TbStucourseMapper {
    long countByExample(TbStucourseExample example);

    int deleteByExample(TbStucourseExample example);

    int deleteByPrimaryKey(TbStucourseKey key);

    int insert(TbStucourse record);

    int insertSelective(TbStucourse record);

    List<TbStucourse> selectByExample(TbStucourseExample example);

    TbStucourse selectByPrimaryKey(TbStucourseKey key);

    int updateByExampleSelective(@Param("record") TbStucourse record, @Param("example") TbStucourseExample example);

    int updateByExample(@Param("record") TbStucourse record, @Param("example") TbStucourseExample example);

    int updateByPrimaryKeySelective(TbStucourse record);


    int updateByPrimaryKey(TbStucourse record);

    @Select("select * from tb_stucourse where StudentNum=#{studentnum}  ")
    List<TbStucourse> selectByStudentnum(@Param("studentnum") String studentnum);

    @Select("select * from tb_stucourse where CourseNum=#{Coursenum}")
    List<TbStucourse> selectByCoursenum(@Param("Coursenum") int Coursenum);

    @Select("select * from tb_stucourse where TeacherNum=#{Teachernum}")
    List<TbStucourse> selectByTeachernum(@Param("Teachernum") int Teachernum);

}