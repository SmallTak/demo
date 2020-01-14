package com.file.delorcapy.controller;

import com.file.delorcapy.service.Capy;
import com.file.delorcapy.service.ClearFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-14 15:41
 */
@Controller
public class HomeCpntroller {

    @Autowired
    private Capy capy;

    @Autowired
    private ClearFile clearFile;

    @GetMapping
    @ResponseBody
    public String home() throws IOException {
         capy.test();
        return "success";
    }
    @GetMapping("/clear")
    @ResponseBody
    public String clear() throws IOException {
        clearFile.clear();
        return "clear success";
    }
}
