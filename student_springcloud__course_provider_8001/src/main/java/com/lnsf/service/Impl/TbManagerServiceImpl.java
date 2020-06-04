package com.lnsf.service.Impl;


import com.lnsf.mapper.TbManagerMapper;
import com.lnsf.pojo.TbManager;
import com.lnsf.pojo.TbManagerExample;
import com.lnsf.service.TbManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbManagerServiceImpl implements TbManagerService {
    @Autowired
    private TbManagerMapper tbManagerMapper;
    @Override
    public long countByExample(TbManagerExample example) {
        return tbManagerMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String Managernum) {
        return tbManagerMapper.deleteByPrimaryKey(Managernum);
    }


    @Override
    public int insertSelective(TbManager record) {
        return tbManagerMapper.insertSelective(record);
    }

    @Override
    public List<TbManager> selectByExample(TbManagerExample example) {
        return tbManagerMapper.selectByExample(example);
    }

    @Override
    public TbManager selectByPrimaryKey(String Managernum) {
        return tbManagerMapper.selectByPrimaryKey(Managernum);
    }

    @Override
    public int updateByPrimaryKeySelective(TbManager record) {
        return tbManagerMapper.updateByPrimaryKeySelective(record);
    }
}

