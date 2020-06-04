package com.lnsf.service;

import com.lnsf.pojo.TbManager;
import com.lnsf.pojo.TbManagerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbManagerService {
    long countByExample(TbManagerExample example);

    int deleteByPrimaryKey(String managernum);

    int insertSelective(TbManager record);

    List<TbManager> selectByExample(TbManagerExample example);

    TbManager selectByPrimaryKey(String managernum);

    int updateByPrimaryKeySelective(TbManager record);

}
