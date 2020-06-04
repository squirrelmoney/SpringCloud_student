package com.lnsf.service.Impl;

import com.lnsf.mapper.TbCourseMapper;
import com.lnsf.pojo.TbCourse;
import com.lnsf.pojo.TbCourseExample;
import com.lnsf.service.TbCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbCourseServiceImpl implements TbCourseService {
    @Autowired
    private TbCourseMapper tbCourseMapper;
    @Override
    public long countByExample(TbCourseExample example) {
        return tbCourseMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer coursenum) {
        return tbCourseMapper.deleteByPrimaryKey(coursenum);
    }

    @Override
    public int insertSelective(TbCourse record) {
        return tbCourseMapper.insertSelective(record);
    }

    @Override
    public List<TbCourse> selectByExample(TbCourseExample example) {

        return tbCourseMapper.selectByExample(example);
    }

    @Override
    public TbCourse selectByPrimaryKey(Integer coursenum) {
        return tbCourseMapper.selectByPrimaryKey(coursenum);
    }

    @Override
    public int updateByPrimaryKeySelective(TbCourse record) {
        return tbCourseMapper.updateByPrimaryKeySelective(record);
    }
}

