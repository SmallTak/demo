package com.yunfei.task;

import com.yunfei.utils.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author:
 * @date: 2019-12-25 16:26
 */
@Component
public class SendEamil {

    @Autowired
    private EmailUtil util;

    @Autowired
    private PoiOutExcel poiOutExcel;

//    @Scheduled(cron = "0 */10 * * * ?")
//    public void sendEamil(){
//        System.out.println("开始发送~~" + System.currentTimeMillis());
//        util.sendSimpleMail("1048388981@qq.com", "hey","hi");
//
//    }

    @Scheduled(cron = "0 35 10 ? * *")
    public void selectData(){
        System.out.println("开始查询数据");
        try {
            poiOutExcel.excel();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Scheduled(cron = "0 50 10 ? * * ")
    public void sendAttachment(){
        String filePath = "E:\\count.xls";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        System.out.println("开始发送excel" + System.currentTimeMillis());
        util.sendAttachmentMail("zhouyunhui@philisense.com","数据统计",dateFormat.format(new Date(System.currentTimeMillis())) + "全国各市数据统计",filePath);
    }


}
