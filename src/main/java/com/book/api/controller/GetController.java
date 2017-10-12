package com.book.api.controller;

import com.book.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * get请求控制器
 */
@Controller
public class GetController extends BaseController {
    @Autowired
    private UserService userService;
    /**
     * 直接访问home页
     *
     * @return
     */
    @RequestMapping("api/home")
    private String home() {
        return "home";

    }

    /**
     * 直接访问登录界面
     *
     * @return
     */
    @RequestMapping("api/login")
    private String login() {
        return "login";

    }
    /**
     * 直接访问用户信息界面
     *
     * @return
     */
    @RequestMapping("api/user/info")
    private String getUserInfo(){
        return "user_info";

    }
    /**
     * 直接访问用户列表
     *
     * @return
     */
    @RequestMapping("api/user/list")
    private String getUserList(){
        return "user_list";

    }

}
