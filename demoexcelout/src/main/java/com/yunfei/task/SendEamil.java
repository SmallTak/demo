package com.yunfei.task;

import com.yunfei.utils.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

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

    @Scheduled(cron = "0 */10 * * * ?")
    public void sendEamil(){
        System.out.println("开始发送~~" + System.currentTimeMillis());
        util.sendSimpleMail("1048388981@qq.com", "hey","hi");

    }

    @Scheduled(cron = "0 */10 * * * ?")
    public void sendEamil1(){
        System.out.println("开始发送~~" + System.currentTimeMillis());
        util.sendSimpleMail("hdysimple@163.com", "hey","hi");
    }

    @Scheduled(cron = "59 * * * * ? ")
    public void sendAttachment(){
        String filePath = "E:\\count.xls";
        System.out.println("开始发送excel" + System.currentTimeMillis());
        util.sendAttachmentMail("1048388981@qq.com","20191220全国各市数据统计",new Date() + "20191220全国各市数据统计",filePath);
    }
    @Scheduled(cron = "59 * * * * ? ")
    public void test(){
        System.out.println("开始执行定时任务" + System.currentTimeMillis());
    }


}
