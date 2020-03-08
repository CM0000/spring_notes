package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Transactional(propagation= Propagation.REQUIRED,isolation= Isolation.DEFAULT,readOnly=false)
    public void transfer(String outUsername, String inUsername, Integer i) {
        String sql01 = "update user set jifen=jifen-? where username=?";
        this.jdbcTemplate.update(sql01,i,outUsername);
        int a = 10/0;
        String sql02 = "update user set jifen=jifen+? where username=?";
        jdbcTemplate.update(sql02,i,inUsername);
    }
}
