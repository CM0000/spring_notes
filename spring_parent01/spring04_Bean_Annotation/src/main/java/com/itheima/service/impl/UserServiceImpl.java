package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("service")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    public void test() {
        userDao.test();
        System.out.println("执行了userService.test()");
    }
}
