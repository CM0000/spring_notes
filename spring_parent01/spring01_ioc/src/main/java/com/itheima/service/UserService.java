package com.itheima.service;

import com.itheima.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void test(){
        userDao.test();
        System.out.println("执行了 UserService_test");
    }
}
