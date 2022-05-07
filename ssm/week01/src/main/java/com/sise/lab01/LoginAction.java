package com.sise.lab01;

public class LoginAction {
    private String name;
    private String password;

    public String execute() throws Exception{

        if (null !=name && name.equals("admin") && null != password && password.equals("com.sise"))
            return "suc";
        return "login";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
