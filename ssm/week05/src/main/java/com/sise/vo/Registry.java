package com.sise.vo;

import java.io.File;
import java.util.Date;

/**
 * Author: zhuib
 * Date: 2020/10/16 11:26
 * Describe:
 */
public class Registry {
    private String username;
    private String password;
    private String password2;
    private int age;
    private Date graduationDate;
    // 上传的文件名必须加上 File photo的photo - 》 photoFileName 否则是对应不上上传文件的文件名
    private File photo;
    private String photoFileName;


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

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public String getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
    }

}
