package com.autoinput.sqlser.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.autoinput.sqlser.entity.VisitorRecord;
import com.autoinput.sqlser.mapper.VisitorRecordMapper;
import com.autoinput.sqlser.utils.GetObject;
import com.autoinput.sqlser.utils.JsonHttpService;
import com.autoinput.sqlser.utils.RandomIp;
import javafx.scene.media.VideoTrack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-09 15:33
 */
@Service
public class InsertLogServiceImpl implements InsertLogService {

    @Value("${AK}")
    private String AK;

    @Autowired
    private VisitorRecordMapper visitorRecordMapper;


    @Override
    public void inserLog(String ak) throws IOException {
        List list = new ArrayList();
        list.add(0, "http://dmfw.mca.gov.cn/online/map.html");
        list.add(1, "http://dmfw.mca.gov.cn/history.html");
        list.add(2, "http://dmfw.mca.gov.cn/word.html");
        list.add(3, "http://dmfw.mca.gov.cn/sound.html");
        list.add(4, "http://dmfw.mca.gov.cn/feature.html");
        list.add(5, "http://dmfw.mca.gov.cn/expert.html");
        list.add(6, "http://dmfw.mca.gov.cn/login.html");
        list.add(7, "http://dmfw.mca.gov.cn/service.html?subject=1");
        list.add(8, "http://dmfw.mca.gov.cn/service.html?subject=2");
        list.add(9, "http://dmfw.mca.gov.cn/service.html?subject=3");


        String randomIp = RandomIp.getRandomIp();
        String url = "http://api.map.baidu.com/location/ip?ak=" + AK + "&ip=" + randomIp + "&coor=bd09ll%20//HTTP";
        System.out.println(url);
        System.out.println(randomIp);
        GetObject getObject = new GetObject();
        JSONObject p = getObject.getP(url);
        JSONObject obj = (JSONObject) ((JSONObject) p.get("content")).get("address_detail");
        String province = obj.getString("province");
        JSONObject object = (JSONObject) ((JSONObject) p.get("content")).get("address_detail");
        String city = object.getString("city");
        System.out.println(province + city);
        VisitorRecord visitorRecord = new VisitorRecord();
        visitorRecord.setIp(randomIp);
        visitorRecord.setCountry("中国");
        visitorRecord.setProvince(province);
        visitorRecord.setCity(city);
        visitorRecord.setUserId(0);
        String str = (String) list.get(new Random().nextInt(list.size()));

        if (str.length() == 45) {
            String sub = str.substring(36);
            visitorRecord.setReferer(str.substring(0, 35));
            visitorRecord.setRefererParam(sub);
            visitorRecordMapper.insertSelective(visitorRecord);
        } else {
            visitorRecord.setReferer(str);
            visitorRecordMapper.insertSelective(visitorRecord);
        }


    }
}
