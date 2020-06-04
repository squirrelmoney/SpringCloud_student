package com.lnsf.service.Impl;


import com.lnsf.mapper.TbControlMapper;
import com.lnsf.pojo.TbControl;
import com.lnsf.pojo.TbControlExample;
import com.lnsf.service.TbControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbControlServiceImpl implements TbControlService {
    @Autowired
    private TbControlMapper tbControlMapper;
    @Override
    public int deleteByExample(TbControlExample example) {
        return tbControlMapper.deleteByExample(example);
    }

    @Override
    public int insert(TbControl record) {
        return tbControlMapper.insert(record);
    }

    @Override
    public int insertSelective(TbControl record) {
        return tbControlMapper.insertSelective(record);
    }

    @Override
    public List<TbControl> selectByExample(TbControlExample example) {
        return tbControlMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TbControl record, TbControlExample example) {
        return tbControlMapper.updateByExampleSelective(record,example);
    }
}
