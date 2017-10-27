package com.lanou.action;

import com.lanou.domain.User;
import com.lanou.service.UserService;
import com.lanou.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by dllo on 17/10/24.
 */


public class UserModelAction extends ActionSupport implements ModelDriven<User> {
    private UserService userService = new UserServiceImpl();
    private User user;

    public String login() {
        if (userService.login(user) != null) {
            return SUCCESS;
        }
        return ERROR;
    }

    public String register() {
        User user1 = userService.register(this.user);
        System.out.println(user);
        System.out.println(user1);
        if (user1 != null){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }

    @Override
    public User getModel() {
        user = new User();
        return user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
