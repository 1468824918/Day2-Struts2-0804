package com.lanou.service.impl;

import com.lanou.dao.UserDao;
import com.lanou.dao.impl.UserDaoImpl;
import com.lanou.domain.User;
import com.lanou.service.UserService;

/**
 * Created by dllo on 17/10/24.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public User register(User user) {
        return userDao.register(user);
    }
}
