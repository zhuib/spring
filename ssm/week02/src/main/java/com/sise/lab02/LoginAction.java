package com.sise.lab02;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    public String execute() throws Exception{

        if ("admin".equals(username.trim()) &&  "com.sise".equals(password.trim()))
            return SUCCESS;
        else
            addFieldError("username","用户名密码错误");
            return LOGIN;
    }

    public void validate() {
        if (null == username || "".equals(username.trim())) {
            addFieldError("username", "用户必须输入");
        }
        if (null == password || "".equals(password.trim())) {
            addFieldError("password", "密码必须输入");
        }
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
}
