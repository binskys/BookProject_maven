package com.book.api.dao;

import com.book.api.model.User;
import com.book.api.model.UserBean;

import java.util.List;

public interface UserDao {
    /**
     * 用户登录
     * @param account
     * @return
     */
    User queryByAccount(String account);

    /**
     * 查询用户列表
     * @return
     */
    List<UserBean.UserInfo> queryByUser();
}
