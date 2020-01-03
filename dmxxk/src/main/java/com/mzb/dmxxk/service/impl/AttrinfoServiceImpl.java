package com.mzb.dmxxk.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mzb.dmxxk.entity.TblPlaceAttrinfo;
import com.mzb.dmxxk.entity.TblPlaceAttrinfoExample;
import com.mzb.dmxxk.entity.TblPlaceAttrinfoWithBLOBs;
import com.mzb.dmxxk.mapper.TblPlaceAttrinfoMapper;
import com.mzb.dmxxk.service.AttrinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: ZYF
 * @date: 2019-12-27 16:04
 */
@Service
public class AttrinfoServiceImpl implements AttrinfoService {

    @Autowired
    private TblPlaceAttrinfoMapper attrinfoMapper;

    @Override
    public PageInfo<TblPlaceAttrinfoWithBLOBs> findAllData(Integer pageNo, String standardName) {
        TblPlaceAttrinfoExample placeAttrinfoExample = new TblPlaceAttrinfoExample();
        placeAttrinfoExample.createCriteria().andStandardNameEqualTo(standardName);
        PageHelper.startPage(pageNo, 3);
        return new PageInfo<>(attrinfoMapper.selectByExampleWithBLOBs(placeAttrinfoExample));
//        PageHelper.startPage(pageNo,5);
//        return new PageInfo<>(attrinfoMapper.selectByExampleWithBLOBs(new TblPlaceAttrinfoExample()));

    }

    @Override
    public TblPlaceAttrinfo findById(Integer id) {
        return attrinfoMapper.selectByPrimaryKey(Long.valueOf(id));
    }

//    @Override
//    public List<TblPlaceAttrinfoWithBLOBs> findMovieByDirector(String standardName) {
//
//        return null;
//    }
}
