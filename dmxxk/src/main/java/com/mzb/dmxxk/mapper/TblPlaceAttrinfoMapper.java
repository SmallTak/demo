package com.mzb.dmxxk.mapper;

import com.mzb.dmxxk.entity.TblPlaceAttrinfo;
import com.mzb.dmxxk.entity.TblPlaceAttrinfoExample;
import com.mzb.dmxxk.entity.TblPlaceAttrinfoWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TblPlaceAttrinfoMapper {
    long countByExample(TblPlaceAttrinfoExample example);

    int deleteByExample(TblPlaceAttrinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblPlaceAttrinfoWithBLOBs record);

    int insertSelective(TblPlaceAttrinfoWithBLOBs record);

    List<TblPlaceAttrinfoWithBLOBs> selectByExampleWithBLOBs(TblPlaceAttrinfoExample example);

    List<TblPlaceAttrinfo> selectByExample(TblPlaceAttrinfoExample example);

    TblPlaceAttrinfoWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblPlaceAttrinfoWithBLOBs record, @Param("example") TblPlaceAttrinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TblPlaceAttrinfoWithBLOBs record, @Param("example") TblPlaceAttrinfoExample example);

    int updateByExample(@Param("record") TblPlaceAttrinfo record, @Param("example") TblPlaceAttrinfoExample example);

    int updateByPrimaryKeySelective(TblPlaceAttrinfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TblPlaceAttrinfoWithBLOBs record);

    int updateByPrimaryKey(TblPlaceAttrinfo record);
}