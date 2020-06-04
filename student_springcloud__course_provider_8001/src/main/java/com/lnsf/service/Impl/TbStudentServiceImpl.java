package com.lnsf.service.Impl;

import com.lnsf.mapper.TbStudentMapper;
import com.lnsf.pojo.TbStudent;
import com.lnsf.pojo.TbStudentExample;
import com.lnsf.service.TbStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbStudentServiceImpl implements TbStudentService {
    @Autowired
    private TbStudentMapper tbStudentMapper;
    @Override
    public long countByExample(TbStudentExample example) {
        return tbStudentMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String studentnum) {
        return tbStudentMapper.deleteByPrimaryKey(studentnum);
    }

    @Override
    public int insert(TbStudent record) {
        return tbStudentMapper.insert(record);
    }

    @Override
    public int insertSelective(TbStudent record) {
        return tbStudentMapper.insertSelective(record);
    }

    @Override
    public List<TbStudent> selectByExample(TbStudentExample example) {
        return tbStudentMapper.selectByExample(example);
    }

    @Override
    public TbStudent selectByPrimaryKey(String studentnum) {
        return tbStudentMapper.selectByPrimaryKey(studentnum);
    }

    @Override
    public int updateByPrimaryKeySelective(TbStudent record) {
        return tbStudentMapper.updateByPrimaryKeySelective(record);
    }
}