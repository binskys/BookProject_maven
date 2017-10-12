package com.book.api.dao;

import com.book.api.model.User;

public interface UserDao {
    /**
     * 用户登录查询用户信息
     * @param account
     * @return
     */
    User queryByAccount(String account);
}
