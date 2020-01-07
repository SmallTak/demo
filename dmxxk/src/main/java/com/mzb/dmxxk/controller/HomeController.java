package com.mzb.dmxxk.controller;

import com.github.pagehelper.PageInfo;
import com.mzb.dmxxk.entity.TblPlaceAttrinfo;
import com.mzb.dmxxk.entity.TblPlaceAttrinfoWithBLOBs;
import com.mzb.dmxxk.service.AttrinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: ZYF
 * @date: 2019-12-27 16:04
 */
@Controller
@RequestMapping("/pro")
public class HomeController {

    @Autowired
    private AttrinfoService attrinfoService;

    @GetMapping
    public String all() {
        return "/search";
    }

    @GetMapping("/search")
    public String home(@RequestParam(required = true, name = "standardName") String standardName, @RequestParam(required = false, name = "p", defaultValue = "1") Integer pageNo, Model model) {
        PageInfo<TblPlaceAttrinfoWithBLOBs> pageInfo = attrinfoService.findAllData(pageNo, standardName);
        model.addAttribute("pag", pageInfo.getTotal());
        model.addAttribute("pageInfo", pageInfo);
        return "/home";//other
    }

    @GetMapping("/{id}")
    public String movieDetail(@PathVariable Integer id, Model model) {
        TblPlaceAttrinfo attrinfo = attrinfoService.findById(id);
        model.addAttribute("attrinfo", attrinfo);
        return "/detail";
    }

    @GetMapping("/{id}/edit")
    public String movieEdit(@PathVariable Integer id, Model model) {
        TblPlaceAttrinfoWithBLOBs attrinfo = attrinfoService.findById(id);
        model.addAttribute("attrinfo", attrinfo);
        return "/edit";
    }

    @PostMapping("/{id}/edit")
    public String editMovie(TblPlaceAttrinfoWithBLOBs placeAttrinfoWithBLOBs) {
        attrinfoService.update(placeAttrinfoWithBLOBs);
        System.out.println(placeAttrinfoWithBLOBs.getPlaceCode());
        System.out.println(placeAttrinfoWithBLOBs.getMandarinChinesePronunciation() + "this");
        return "redirect:/pro";
    }

    @InitBinder
    public void init(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

}
