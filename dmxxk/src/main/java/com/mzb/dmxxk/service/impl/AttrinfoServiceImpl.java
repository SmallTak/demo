package com.mzb.dmxxk.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mzb.dmxxk.entity.TblPlaceAttrinfo;
import com.mzb.dmxxk.entity.TblPlaceAttrinfoExample;
import com.mzb.dmxxk.entity.TblPlaceAttrinfoWithBLOBs;
import com.mzb.dmxxk.mapper.TblPlaceAttrinfoMapper;
import com.mzb.dmxxk.service.AttrinfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    private Logger logger = LoggerFactory.getLogger(AttrinfoServiceImpl.class);


    @Override
    public PageInfo<TblPlaceAttrinfoWithBLOBs> findAllData(Integer pageNo, String standardName) {
        PageHelper.startPage(pageNo, 4);

        TblPlaceAttrinfoExample placeAttrinfoExample = new TblPlaceAttrinfoExample();
        placeAttrinfoExample.createCriteria().andStandardNameEqualTo(standardName);
        List<TblPlaceAttrinfoWithBLOBs> tblPlaceAttrinfoWithBLOBs = attrinfoMapper.selectByExampleWithBLOBs(placeAttrinfoExample);

        if (tblPlaceAttrinfoWithBLOBs.isEmpty() || tblPlaceAttrinfoWithBLOBs.equals(null)){
            PageHelper.startPage(pageNo, 4);
            System.out.println("数据为空");
            TblPlaceAttrinfoExample tblPlaceAttrinfoWithBLOBsNot = new TblPlaceAttrinfoExample();
            tblPlaceAttrinfoWithBLOBsNot.createCriteria().andStandardNameLike(standardName + "%");
            List<TblPlaceAttrinfoWithBLOBs> tblPlaceAttrinfoWithBLOBsother = attrinfoMapper.selectByExampleWithBLOBs(tblPlaceAttrinfoWithBLOBsNot);
            logger.info("查询条件标准名称为：" + standardName + "-->查询数据 {}", tblPlaceAttrinfoWithBLOBsother);
            return new PageInfo<>(tblPlaceAttrinfoWithBLOBsother);
        }else {
            logger.info("查询条件标准名称为：" + standardName + "-->查询数据 {}", tblPlaceAttrinfoWithBLOBs);
            return new PageInfo<>(tblPlaceAttrinfoWithBLOBs);
        }

    }

    @Override
    public TblPlaceAttrinfoWithBLOBs findById(Integer id) {
        return attrinfoMapper.selectByPrimaryKey(Long.valueOf(id));
    }

    @Transactional
    @Override
    public void update(TblPlaceAttrinfoWithBLOBs placeAttrinfoWithBLOBs) {
        attrinfoMapper.updateByPrimaryKeySelective(placeAttrinfoWithBLOBs);
    }

}
