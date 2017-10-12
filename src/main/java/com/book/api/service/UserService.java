package com.book.api.service;

import com.book.api.model.User;
import com.book.api.model.UserBean;

import java.util.List;


public interface UserService {
    User queryByAccount(String account);
    List<UserBean.UserInfo> queryByUser();
}
