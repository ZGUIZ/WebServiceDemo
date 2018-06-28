package com.zguiz.service;

import com.zguiz.bean.User;

public interface IUserService {
    User login(String account, String password);
}
