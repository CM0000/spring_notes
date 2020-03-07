package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {
    public Integer insert(User user);
    public Integer delete(Integer id);
    public Integer update(User user);

    public List<User> findAll();
    public User findById(Integer id);
}
