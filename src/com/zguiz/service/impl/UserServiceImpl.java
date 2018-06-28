package com.zguiz.service.impl;

import com.zguiz.bean.User;
import com.zguiz.service.IUserService;

import java.util.Date;

public class UserServiceImpl implements IUserService{
    @Override
    public User login(String account, String password) {
        if("admin".equals(account)&&"admin".equals(password)){
            return new User(account,password,21,new Date(),true);
        }
        return null;
    }
}
