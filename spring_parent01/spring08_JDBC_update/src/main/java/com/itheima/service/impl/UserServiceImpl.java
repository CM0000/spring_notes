package com.itheima.service.impl;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class UserServiceImpl implements UserService {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Integer insert(User user) {
        String sql = "insert into user(username,birthday,sex,address) values(?,?,?,?)";
        return jdbcTemplate.update(sql, user.getUsername(), user.getBirthday(), user.getSex(), user.getAddress());
    }

    public Integer delete(Integer id) {
        return null;
    }

    public Integer update(User user) {
        return null;
    }

    public List<User> findAll() {
        String sql = "select * from user";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);

        return jdbcTemplate.query(sql, rowMapper);
    }

    public User findById(Integer id) {
        String sql = "select * from user where id = ?";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);

        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }
}
