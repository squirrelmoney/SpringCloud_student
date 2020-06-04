package com.lnsf.service.Impl;

import com.lnsf.mapper.TbMajorMapper;
import com.lnsf.pojo.TbMajor;
import com.lnsf.pojo.TbMajorExample;
import com.lnsf.service.TbMajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbMajorServiceImpl implements TbMajorService {
    @Autowired
    private TbMajorMapper tbMajorMapper;
    @Override
    public long countByExample(TbMajorExample example) {
        return tbMajorMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TbMajorExample example) {
        return tbMajorMapper.deleteByExample(example);
    }



    @Override
    public int deleteByPrimaryKey(Integer Majornum) {
        return tbMajorMapper.deleteByPrimaryKey(Majornum);
    }

    @Override
    public int insertSelective(TbMajor record) {
        return tbMajorMapper.insertSelective(record);
    }

    @Override
    public List<TbMajor> selectByExample(TbMajorExample example) {
        return tbMajorMapper.selectByExample(example);
    }

    @Override
    public TbMajor selectByPrimaryKey(Integer majornum) {
        return tbMajorMapper.selectByPrimaryKey(majornum);
    }


    @Override
    public int updateByExampleSelective(TbMajor record, TbMajorExample example) {
        return  tbMajorMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TbMajor record, TbMajorExample example) {
        return  tbMajorMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TbMajor record) {
        return tbMajorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbMajor record) {
        return tbMajorMapper.updateByPrimaryKey(record);
    }
}

