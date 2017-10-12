package com.book.api.controller;

import com.book.api.model.User;
import com.book.api.model.UserBean;
import com.book.api.service.UserService;
import com.book.api.utils.ApiReturn;
import com.book.api.utils.ApiStrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private String userInfo(){
        return "user_info";

    }

}
