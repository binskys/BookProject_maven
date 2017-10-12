package com.book.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController extends BaseController {
    /**
     * 直接访问home页
     * @return
     */
    @RequestMapping("api/home")
    private String home(){
        return "home";

    }
    /**
     * 直接访问登录界面
     * @return
     */
    @RequestMapping("api/login")
    private String login(){
        return "login";

    }
}
