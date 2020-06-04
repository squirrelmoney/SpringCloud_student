package com.lnsf.mapper;

import com.lnsf.pojo.TbMajor;
import com.lnsf.pojo.TbMajorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TbMajorMapper {
    long countByExample(TbMajorExample example);

    int deleteByExample(TbMajorExample example);

    int deleteByPrimaryKey(Integer majornum);

    int insert(TbMajor record);

    int insertSelective(TbMajor record);

    List<TbMajor> selectByExample(TbMajorExample example);

    TbMajor selectByPrimaryKey(Integer majornum);

    int updateByExampleSelective(@Param("record") TbMajor record, @Param("example") TbMajorExample example);

    int updateByExample(@Param("record") TbMajor record, @Param("example") TbMajorExample example);

    int updateByPrimaryKeySelective(TbMajor record);

    int updateByPrimaryKey(TbMajor record);
}