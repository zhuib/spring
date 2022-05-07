package com.sise.lab01.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sise.lab01.vo.User;

import java.util.Map;

public class UserAction extends ActionSupport implements ModelDriven {

    private User user = new User();

    @Override
    public Object getModel() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        ActionContext ctx = ActionContext.getContext();
        Map session = ctx.getSession();
        if (user.getUsername() != null && user.getUsername().equals("admin") && user.getPassword() != null && user.getPassword().equals("com.sise")) {
            session.put("username", user.getUsername());
            return SUCCESS;
        } else {
            addFieldError("username", "用户名或密码错误");
            return LOGIN;
        }
    }

    public String addUser() throws Exception {
        return "add";
    }
}
