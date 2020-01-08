package com.mzb.dmxxk.utils;

import com.mzb.dmxxk.entity.TblPlaceAttrinfoWithBLOBs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-08 9:17
 */
public class EqUtil {

    public Map<String,Map> eq(TblPlaceAttrinfoWithBLOBs originData,TblPlaceAttrinfoWithBLOBs nowData){

        Map<String,Map> map = new HashMap();
        Map maps = new HashMap();
        if (!originData.getPlaceOrigin().equals(nowData.getPlaceOrigin())){
            String str = "placeOrigin";
            maps.put(str,nowData.getPlaceOrigin());
            map.put(String.valueOf(nowData.getId()),maps);
        }
        return map;
    }

}
