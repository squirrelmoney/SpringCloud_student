package com.lnsf.mapper;

import com.lnsf.pojo.TbDept;
import com.lnsf.pojo.TbDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TbDeptMapper {
    long countByExample(TbDeptExample example);

    int deleteByExample(TbDeptExample example);

    int deleteByPrimaryKey(Integer deptnum);

    int insert(TbDept record);

    int insertSelective(TbDept record);

    List<TbDept> selectByExample(TbDeptExample example);

    TbDept selectByPrimaryKey(Integer deptnum);

    int updateByExampleSelective(@Param("record") TbDept record, @Param("example") TbDeptExample example);

    int updateByExample(@Param("record") TbDept record, @Param("example") TbDeptExample example);

    int updateByPrimaryKeySelective(TbDept record);

    int updateByPrimaryKey(TbDept record);
}