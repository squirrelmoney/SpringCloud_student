package com.lnsf.service.Impl;

import com.lnsf.mapper.TbDeptMapper;
import com.lnsf.pojo.TbDept;
import com.lnsf.pojo.TbDeptExample;
import com.lnsf.service.TbDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbDeptServiceImpl implements TbDeptService {
    @Autowired
    private TbDeptMapper tbDeptMapper;

    @Override
    public long countByExample(TbDeptExample example) {
        return tbDeptMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer Deptnum) {
        return tbDeptMapper.deleteByPrimaryKey(Deptnum);
    }


    @Override
    public int insertSelective(TbDept record) {
        return tbDeptMapper.insertSelective(record);
    }

    @Override
    public List<TbDept> selectByExample(TbDeptExample example) {
        return tbDeptMapper.selectByExample(example);
    }

    @Override
    public TbDept selectByPrimaryKey(Integer Deptnum) {
        return tbDeptMapper.selectByPrimaryKey(Deptnum);
    }

    @Override
    public int updateByPrimaryKeySelective(TbDept record) {
        return tbDeptMapper.updateByPrimaryKeySelective(record);
    }
}

