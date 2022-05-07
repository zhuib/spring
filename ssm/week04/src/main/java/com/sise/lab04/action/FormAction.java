package com.sise.lab04.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sise.lab04.vo.FormData;

/**
 * Author: zhuib
 * Date: 2020/10/10 10:04
 * Describe:
 */
public class FormAction extends ActionSupport implements ModelDriven {

    private FormData formData = new FormData();

    @Override
    public Object getModel() {
        return formData;
    }

    public String execute() {
        return SUCCESS;
    }

    public void validate() {
        if (formData.getUsername() == null || formData.getUsername().trim().length() == 0) {
            addFieldError("username", "用户名必须填写");
        }
    }
}
