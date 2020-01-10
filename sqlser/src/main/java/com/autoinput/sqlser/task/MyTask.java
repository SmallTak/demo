package com.autoinput.sqlser.task;

import com.autoinput.sqlser.service.impl.InsertLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-10 9:15
 */
@Component
public class MyTask {

    @Autowired
    private InsertLogServiceImpl InsertLogService;

    @Scheduled(cron = "0 0/10 * * * ?")
    public void reportCurrentTime() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
        System.out.println("开始执行任务---------------------------->");
        String ak = "PLu1mKO7CIniVy1kXqWaNOp6wbp2EN58";
        try {
            InsertLogService.inserLog(ak);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
