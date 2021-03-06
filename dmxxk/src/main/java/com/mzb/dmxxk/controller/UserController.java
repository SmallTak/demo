package com.mzb.dmxxk.controller;

import com.mzb.dmxxk.service.AccountService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-13 11:08
 */
@Controller
@RequestMapping("/account")
public class UserController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public String index(){

        Subject subject = SecurityUtils.getSubject();

        //判断当前是否有已经认证的账号，如果有，则退出该账号
        if(subject.isAuthenticated()) {
            subject.logout();
        }
//        //若当前为被记住（通过rememberMe认证），则直接跳转到登录成功页面 home
//        if (subject.isRemembered()){
//            return "redirect:/home";
//        }
        return "/login";
    }

    /**登录系统
     *
     * @Author Reich
     * @Date: 2018/4/17 17:15
     */
    @PostMapping("/login")
    public String login(String mobile,
                        String password,
                        HttpServletRequest request,
                        RedirectAttributes redirectAttributes) {
        System.out.println(mobile+password);
        //创建subject对象
        Subject subject = SecurityUtils.getSubject();
        //获取登录ip
        String requestIp = request.getRemoteAddr();

        //根据账号密码进行登录
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(mobile, DigestUtils.md5Hex(password), requestIp);

        try {
            subject.login(usernamePasswordToken);

            //登录成功后跳转的目标(callback)
//            SavedRequest savedRequest = WebUtils.getSavedRequest(request);
//            String url = "/pro";
//            if (savedRequest != null){
//                url = savedRequest.getRequestUrl();
//            }
//
//            return "redirect:" + url;
        }catch (UnknownAccountException | IncorrectCredentialsException e){
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message","账号密码不匹配");
        }catch (LockedAccountException e){
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message", "账号被锁定");
        }catch (AuthenticationException e){
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message", "账号密码不匹配");
        }

        System.out.println("OK---------------------->");
        return "redirect:/pro";
    }

//    /**
//     * 登录成功后重定向的首页
//     * @return
//     */
//    @GetMapping("/home")
//    public String home() {
//        return "search";
//    }
//
//    @GetMapping("/add")
//    @RequiresPermissions("user:add")
//    public String createUser(){
//        return "add";
//    }
}
