package com.mzb.dmxxk;

import com.github.pagehelper.PageInfo;
import com.mzb.dmxxk.entity.TblPlaceAttrinfoExample;
import com.mzb.dmxxk.entity.TblPlaceAttrinfoWithBLOBs;
import com.mzb.dmxxk.mapper.TblPlaceAttrinfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-06 12:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { DmxxkApplication.class }) // 指定启动类
public class Testservice {

    @Autowired
    private TblPlaceAttrinfoMapper attrinfoMapper;

    @Test
    public void  home(){
        TblPlaceAttrinfoExample tblPlaceAttrinfoWithBLOBs = new TblPlaceAttrinfoExample();
        tblPlaceAttrinfoWithBLOBs.createCriteria().andStandardNameLike("尼"+ "%");
        List<TblPlaceAttrinfoWithBLOBs> tblPlaceAttrinfoWithBLOBsother = attrinfoMapper.selectByExampleWithBLOBs(tblPlaceAttrinfoWithBLOBs);

        PageInfo<TblPlaceAttrinfoWithBLOBs> pageInfo = new PageInfo<>(tblPlaceAttrinfoWithBLOBsother);
        System.out.println(pageInfo.getTotal()/4+1);

    }

}
