package com.mzb.dmxxk.service;

import com.github.pagehelper.PageInfo;
import com.mzb.dmxxk.entity.TblPlaceAttrinfo;
import com.mzb.dmxxk.entity.TblPlaceAttrinfoWithBLOBs;

import java.util.List;

/**
 * @description:
 * @author: ZYF
 * @date: 2019-12-27 16:03
 */

public interface AttrinfoService {

    PageInfo<TblPlaceAttrinfoWithBLOBs> findAllData(Integer pageNo, String standardName);

    TblPlaceAttrinfo findById(Integer id);

//    List<TblPlaceAttrinfoWithBLOBs> findMovieByDirector(String standardName);
}
