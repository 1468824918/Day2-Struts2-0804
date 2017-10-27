package com.lanou.service;

import com.lanou.domain.User;

/**
 * Created by dllo on 17/10/24.
 */
public interface UserService {
    /**
     * 登录方法
     * @param user 表单传递过来的数据
     * @return user是从数据库中查出来的
     */
    User login(User user);

    /**
     * 注册方法 同登录方法
     * @param user
     * @return
     */
    User register(User user);
}
