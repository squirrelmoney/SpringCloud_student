package com.lnsf.service.Impl;

import com.lnsf.mapper.TbStucourseMapper;
import com.lnsf.pojo.TbStucourse;
import com.lnsf.pojo.TbStucourseExample;
import com.lnsf.pojo.TbStucourseKey;
import com.lnsf.service.TbStucourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbStucourseServiceImpl implements TbStucourseService {
    @Autowired
    private TbStucourseMapper tbStucourseMapper;


    @Override
    public long countByExample(TbStucourseExample example) {
        return tbStucourseMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(TbStucourseKey key) {
        return tbStucourseMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insertSelective(TbStucourse record) {
        return tbStucourseMapper.insertSelective(record);
    }

    @Override
    public TbStucourse selectByPrimaryKey(TbStucourseKey key) {
        return tbStucourseMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByPrimaryKeySelective(TbStucourse record) {
        return tbStucourseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbStucourse record) {
        return tbStucourseMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TbStucourse> selectByExample(TbStucourseExample example) {
        return tbStucourseMapper.selectByExample(example);
    }

    @Override
    public List<TbStucourse> selectByStudentnum(String studentnum) {
        return tbStucourseMapper.selectByStudentnum(studentnum);
    }

    @Override
    public List<TbStucourse> selectByCoursenum(int Coursenum) {
        return tbStucourseMapper.selectByCoursenum(Coursenum);
    }

    @Override
    public List<TbStucourse> selectByTeachernum(int Teachernum) {
        return tbStucourseMapper.selectByTeachernum(Teachernum);
    }

    @Override
    public TbStucourse selectBystudentnumandcoursenum(String studentnum, int Coursenum) {
        return null;
    }


}

