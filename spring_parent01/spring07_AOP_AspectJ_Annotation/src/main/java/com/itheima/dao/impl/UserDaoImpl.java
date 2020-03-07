package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void add() {
        System.out.println("添加用户");
    }

    public void delete() {
        System.out.println("删除用户");
    }
}
