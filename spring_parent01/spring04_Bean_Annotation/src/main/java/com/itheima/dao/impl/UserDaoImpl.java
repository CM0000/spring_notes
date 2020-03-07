package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void test() {
        System.out.println("执行了userDao.test()");
    }
}
