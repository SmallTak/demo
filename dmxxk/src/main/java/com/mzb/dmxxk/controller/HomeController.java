package com.mzb.dmxxk.controller;

import com.github.pagehelper.PageInfo;
import com.mzb.dmxxk.entity.TblPlaceAttrinfo;
import com.mzb.dmxxk.entity.TblPlaceAttrinfoWithBLOBs;
import com.mzb.dmxxk.service.AttrinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @description:
 * @author: ZYF
 * @date: 2019-12-27 16:04
 */
@Controller
public class HomeController {

    @Autowired
    private AttrinfoService attrinfoService;

    @GetMapping
    public String all(){
        return "/search";
    }

    @GetMapping("/search")
    public String home(@RequestParam(required = true,name = "standardName")String standardName,@RequestParam(required = false, name = "p", defaultValue = "1") Integer pageNo, Model model){
        PageInfo<TblPlaceAttrinfoWithBLOBs> pageInfo  = attrinfoService.findAllData(pageNo,standardName);

        model.addAttribute("pag",pageInfo.getTotal());
        System.out.println(pageInfo.getTotal()/4);
        model.addAttribute("pageInfo", pageInfo);
        return "/home";//other
    }

    @GetMapping("/{id}")
    public String movieEdit(@PathVariable Integer id, Model model){
        TblPlaceAttrinfo attrinfo = attrinfoService.findById(id);
        model.addAttribute("attrinfo",attrinfo);
        return "/detail";
    }

//    @GetMapping("/search")
//    public String searchMovie(@RequestParam(required = false) String standardName, Model model){
//        List<TblPlaceAttrinfoWithBLOBs> movieList = attrinfoService.findMovieByDirector(standardName);
//        model.addAttribute("movieList", movieList);
//        return "movie/directorMovie";
//    }

}
