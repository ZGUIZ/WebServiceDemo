package com.zguiz.bean;

import java.util.Date;

public class User {
    private String account;
    private String password;
    private int age;
    private Date birthday;
    private boolean isAdmin;

    public User() {
    }

    public User(String account, String password, int age, Date birthday,boolean isAdmin) {
        this.account = account;
        this.password = password;
        this.age = age;
        this.birthday = birthday;
        this.isAdmin=isAdmin;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
