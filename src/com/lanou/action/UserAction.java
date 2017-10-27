package com.lanou.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by dllo on 17/10/24.
 */
public class UserAction extends ActionSupport{
    private static final String USERNAME= "111";
    private static final String PASSWORD= "111";


    private String username;
    private String password;
    private String affirm;

    public String login(){

        if (USERNAME.equals(username) && PASSWORD.equals(password)){
            return SUCCESS;
        }else return ERROR;

    }
    public String register(){
        if (USERNAME.equals(username) && PASSWORD.equals(password)){
            return SUCCESS;
        }else return ERROR;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAffirm() {
        return affirm;
    }

    public void setAffirm(String affirm) {
        this.affirm = affirm;
    }
}
