package com.lnsf.mapper;

import com.lnsf.pojo.TbControl;
import com.lnsf.pojo.TbControlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TbControlMapper {
    long countByExample(TbControlExample example);

    int deleteByExample(TbControlExample example);

    int insert(TbControl record);

    int insertSelective(TbControl record);

    List<TbControl> selectByExample(TbControlExample example);

    int updateByExampleSelective(@Param("record") TbControl record, @Param("example") TbControlExample example);

    int updateByExample(@Param("record") TbControl record, @Param("example") TbControlExample example);
}