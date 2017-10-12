package com.book.api.service.Impl;

import com.book.api.dao.UserDao;
import com.book.api.model.User;
import com.book.api.model.UserBean;
import com.book.api.model.UserBean.UserInfo;
import com.book.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao user;

    public User queryByAccount(String account) {

        User user2=new User();
        user2.setAccount("18170465691");
        user2.setPassword("a123456");

       // return user2;
        return user.queryByAccount(account);

    }

    public List<UserInfo> queryByUser() {
        List<UserInfo>list=new ArrayList<UserInfo>();
        UserInfo user2=new UserInfo();
        user2.setAccount("18170465691");
        user2.setPassword("a123456");
        list.add(user2);
        list.add(user2);
        list.add(user2);
        return list;
      //  return user.queryByUser();
    }
}
