package com.mzb.dmxxk.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.mzb.dmxxk.entity.TblPlaceAttrinfo;
import com.mzb.dmxxk.entity.TblPlaceAttrinfoExample;
import com.mzb.dmxxk.entity.TblPlaceAttrinfoWithBLOBs;
import com.mzb.dmxxk.mapper.TblPlaceAttrinfoMapper;
import com.mzb.dmxxk.service.AttrinfoService;
import com.mzb.dmxxk.utils.EqUtil;
import com.mzb.dmxxk.utils.OutExcelUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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

        if (tblPlaceAttrinfoWithBLOBs.isEmpty() || tblPlaceAttrinfoWithBLOBs.equals(null)) {
            PageHelper.startPage(pageNo, 4);
            TblPlaceAttrinfoExample tblPlaceAttrinfoWithBLOBsNot = new TblPlaceAttrinfoExample();
            tblPlaceAttrinfoWithBLOBsNot.createCriteria().andStandardNameLike(standardName + "%");
            List<TblPlaceAttrinfoWithBLOBs> tblPlaceAttrinfoWithBLOBsother = attrinfoMapper.selectByExampleWithBLOBs(tblPlaceAttrinfoWithBLOBsNot);
            logger.info("查询条件标准名称为：" + standardName + "-->查询数据 {}", tblPlaceAttrinfoWithBLOBsother);
            return new PageInfo<>(tblPlaceAttrinfoWithBLOBsother);
        } else {
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
        TblPlaceAttrinfoWithBLOBs tblPlaceAttrinfoWithBLOBs = attrinfoMapper.selectByPrimaryKey(Long.valueOf(placeAttrinfoWithBLOBs.getId()));
        EqUtil eqUtil = new EqUtil();
        OutExcelUtil outExcelUtil = new  OutExcelUtil();
        Map<String, Map> eq = eqUtil.eq(tblPlaceAttrinfoWithBLOBs, placeAttrinfoWithBLOBs);
        for (Map.Entry entry : eq.entrySet()) {
            Map<String,String> value = (Map) entry.getValue();
            for (Map.Entry entry1 : value.entrySet()){
                System.out.println(entry1.getKey() + "-----> " + entry1.getValue());
                System.out.println(entry.getKey() + ": " + entry.getValue());
                String ID = (String) entry.getKey();
                String field = (String) entry1.getKey();
                String fieldValue = (String) entry1.getValue();
                try {
                    outExcelUtil.excel(ID, field, fieldValue);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        attrinfoMapper.updateByPrimaryKeySelective(placeAttrinfoWithBLOBs);
    }

}
