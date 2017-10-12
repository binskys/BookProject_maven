package com.book.api.controller;

import com.book.api.model.User;
import com.book.api.service.UserService;
import com.book.api.utils.ApiReturn;
import com.book.api.utils.ApiStrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    /**
     * 登录
     *
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    private String login(HttpServletRequest request, Model model) {
        String userName = request.getParameter("account");
        String passWord = request.getParameter("passWord");

        if (userName == null || userName.length() <= 0) {
            return "login";
        }

        if (passWord == null || passWord.length() <= 0) {
            return "login";
        }

        User user = userService.queryByAccount(userName);
        if (user == null || !user.getPassword().equals(passWord)) {
            return "login";
        }

        return "login_title";
    }

    /**
     * 查询用户信息
     *
     * @return
     */
    @RequestMapping(value = "info", method = RequestMethod.POST)
    @ResponseBody
    private ApiReturn getUserInfo(HttpServletRequest request, Model model) {
        try {
            String userName = request.getParameter("account");
            if (ApiStrUtils.isEmpty(userName)) {
                return new ApiReturn(500, "用户不能为空", false);
            }
            User user = userService.queryByAccount(userName);
            if (user == null || !user.getAccount().equals(userName)) {
                return new ApiReturn(500, "查询失败", false);
            }
            Map<String, String> map = new HashMap<String, String>();
            map.put("UserId", user.getUser_id());
            map.put("name", user.getAccount());
            map.put("address", user.getAddress());
            map.put("age", user.getAge());
            map.put("email", user.getEmail());
            //存入session
            return new ApiReturn(200, "查询成功", true, map);
        } catch (Exception e) {
            return new ApiReturn(500, "查询失败", false);
        }
    }
    /**
     * 查询用户列表
     *
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    private ApiReturn getUserList(HttpServletRequest request, Model model) {
        try {

            Map<String, String> map = new HashMap<String, String>();
//            map.put("UserId", user.getUser_id());
//            map.put("name", user.getAccount());
//            map.put("address", user.getAddress());
//            map.put("age", user.getAge());
//            map.put("email", user.getEmail());
            //存入session
            return new ApiReturn(200, "查询成功", true, map);
        } catch (Exception e) {
            return new ApiReturn(500, "查询失败", false);
        }
    }
}
