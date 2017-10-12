package com.book.api.dao;

import com.book.api.model.User;

import java.util.List;

public interface UserDao {
    /**
     * 用户登录
     * @param account
     * @return
     */
    User queryByAccount(String account);


}
