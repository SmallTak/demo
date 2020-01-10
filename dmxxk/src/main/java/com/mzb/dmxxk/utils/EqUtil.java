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

    public Map<String, Map> eq(TblPlaceAttrinfoWithBLOBs originData, TblPlaceAttrinfoWithBLOBs nowData) {

        Map<String, Map> map = new HashMap();
        Map maps = new HashMap();
        if (!originData.getPlaceOrigin().equals(nowData.getPlaceOrigin())) {
            String str = "placeOrigin";
            System.out.println(originData.getPlaceOrigin());
            maps.put(str, nowData.getPlaceOrigin());
            map.put(String.valueOf(nowData.getId()), maps);
        }
        if (!originData.getPlaceMeaning().equals(nowData.getPlaceMeaning())) {
            String str = "placeMeaning";
            System.out.println(originData.getPlaceMeaning());
            maps.put(str, nowData.getPlaceMeaning());
            map.put(String.valueOf(nowData.getId()), maps);
        }
        if (!originData.getPlaceHistory().equals(nowData.getPlaceHistory())) {
            String str = "placeMeaning";
            System.out.println(originData.getPlaceHistory());
            maps.put(str, nowData.getPlaceHistory());
            map.put(String.valueOf(nowData.getId()), maps);
        }
        return map;
    }

}
