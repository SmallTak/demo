package com.yunfei.controller;

import com.yunfei.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author:
 * @date: 2019-12-19 17:17
 */
@Controller
public class Homecontroller {

    @Autowired
    private HomeService homeService;

    @GetMapping("/home")
    @ResponseBody
    public String home(){
        homeService.home();
        return "string";
    }

}
