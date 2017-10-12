package com.book.api.service.Impl;

import com.book.api.dao.UserDao;
import com.book.api.model.User;
import com.book.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao user;

    /**
     * 用户登录
     * @param account
     * @return
     */
    public User queryByAccount(String account) {
        return user.queryByAccount(account);

    }

}
