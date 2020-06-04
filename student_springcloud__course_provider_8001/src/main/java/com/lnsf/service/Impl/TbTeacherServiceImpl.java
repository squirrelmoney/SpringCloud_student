package com.lnsf.service.Impl;

import com.lnsf.mapper.TbTeacherMapper;
import com.lnsf.pojo.TbTeacher;
import com.lnsf.pojo.TbTeacherExample;
import com.lnsf.service.TbTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbTeacherServiceImpl implements TbTeacherService {
    @Autowired
    private TbTeacherMapper tbTeacherMapper;
    @Override
    public long countByExample(TbTeacherExample example) {
        return tbTeacherMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String Teachernum) {
        return tbTeacherMapper.deleteByPrimaryKey(Teachernum);
    }


    @Override
    public int insertSelective(TbTeacher record) {
        return tbTeacherMapper.insertSelective(record);
    }

    @Override
    public List<TbTeacher> selectByExample(TbTeacherExample example) {
        return tbTeacherMapper.selectByExample(example);
    }

    @Override
    public TbTeacher selectByPrimaryKey(String Teachernum) {
        return tbTeacherMapper.selectByPrimaryKey(Teachernum);
    }

    @Override
    public int updateByPrimaryKeySelective(TbTeacher record) {
        return tbTeacherMapper.updateByPrimaryKeySelective(record);
    }
}

