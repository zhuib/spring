package com.sise.ation;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sise.vo.Registry;
import org.apache.struts2.ServletActionContext;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author: zhuib
 * Date: 2020/10/16 10:50
 * Describe:
 */
public class FileUploadAction extends ActionSupport implements ModelDriven {
    private String savePath;
    Registry registry = new Registry();
    FileInputStream is;
    FileOutputStream os;

    @Override
    public Object getModel() {
        return registry;
    }

    public String execute() {
        System.out.println(registry.toString());
        System.out.println(registry.getPhoto());

        String filePath = getSavePath() + "\\" + registry.getPhotoFileName();
        System.out.println(filePath);

        try {
            is = new FileInputStream(registry.getPhoto());
            os = new FileOutputStream(filePath);

            byte[] buffer = new byte[1024];
            int len = 0;
            while((len = is.read(buffer)) >0) {
                os.write(buffer, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return SUCCESS;
    }


    public void validate() {
        if (registry.getUsername() == null || registry.getUsername().trim().length() == 0) {
            addFieldError("username", "用户名必须输入");
        }
        if (registry.getPassword() == null || registry.getPassword().trim().length() == 0) {
            addFieldError("password", "密码必须输入");
        }
        if (!(registry.getPassword().equals(registry.getPassword2()))) {
            addFieldError("password2", "密码和确认密码不一致");
        }
    }

    public String getSavePath() {
        return ServletActionContext.getServletContext().getRealPath(savePath);
//        return ServletActionContext.getServletContext().getContextPath();
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }
}
