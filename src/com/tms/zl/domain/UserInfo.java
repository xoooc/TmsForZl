package com.tms.zl.domain;

/**
 * Created by Administrator on 13-12-16.
 */
public class UserInfo {
    private String userName;
    private String passWord;
    private String nickName;
    private String nameLess;
    private String email;
    private String portraitPath;
    private String phoneNumber;

    public UserInfo() {
    }

    public UserInfo(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNameLess() {
        return nameLess;
    }

    public void setNameLess(String nameLess) {
        this.nameLess = nameLess;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPortraitPath() {
        return portraitPath;
    }

    public void setPortraitPath(String portraitPath) {
        this.portraitPath = portraitPath;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
