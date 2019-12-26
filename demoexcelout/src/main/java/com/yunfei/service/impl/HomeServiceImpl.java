package com.yunfei.service.impl;

import com.yunfei.mapper.ExcelMapper;
import com.yunfei.service.HomeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author:
 * @date: 2019-12-19 17:13
 */
@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private ExcelMapper excelMapper;

    @Test
    public void home(){
         //excelMapper.selectByPrimaryKey(1);
//        List<Excel> excelList = excelMapper.selectByExample(new ExcelExample());
//       for (Excel excel : excelList){
//            System.out.println(excel.getCode().substring(0,2));
//       }
//        System.out.println(excelList.size());
        System.out.println("??");
    }

}
