package com.yunfei.mapper;

import com.yunfei.entity.Excel;
import com.yunfei.entity.ExcelExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExcelMapper {
    long countByExample(ExcelExample example);

    int deleteByExample(ExcelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Excel record);

    int insertSelective(Excel record);

    List<Excel> selectByExample(ExcelExample example);

    Excel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Excel record, @Param("example") ExcelExample example);

    int updateByExample(@Param("record") Excel record, @Param("example") ExcelExample example);

    int updateByPrimaryKeySelective(Excel record);

    int updateByPrimaryKey(Excel record);
}