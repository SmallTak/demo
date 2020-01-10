package com.autoinput.sqlser.controller;

import com.autoinput.sqlser.service.InsertLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-09 15:28
 */
@Controller
public class HomeController {

    @Value("${AK}")
    private String AK;

    @Autowired
    private InsertLogService insertLogService;

    @GetMapping
    @ResponseBody
    public String home(){
        try {
            insertLogService.inserLog(AK);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "hey";
    }

}
