package com.file.delorcapy.controller;

import com.file.delorcapy.service.Capy;
import com.file.delorcapy.service.ClearFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-14 15:41
 */
@Controller
@RequestMapping("/capy")
public class HomeCpntroller {

    @Autowired
    private Capy capy;

    @Autowired
    private ClearFile clearFile;

    @GetMapping
    public String home() throws IOException {

        return "/home";
    }

    @GetMapping("/capyfile")
    @ResponseBody
    public String capy(@RequestParam(required = true, name = "sourcePath") String sourcePath, @RequestParam(required = true, name = "tarPath") String tarPath){
        try {
            System.out.println(sourcePath+tarPath);
            capy.test(sourcePath,tarPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
