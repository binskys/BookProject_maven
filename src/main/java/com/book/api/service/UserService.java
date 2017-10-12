package com.book.api.service;

import com.book.api.model.User;

public interface UserService {
    User queryByAccount(String account);
}
