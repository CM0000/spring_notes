package com.itheima.test;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class TestCURD {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserService userService = (UserService) applicationContext.getBean("userService");
    @Test
    public void insert(){
        User user = new User();
        user.setUsername("马超");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("西凉");
        Integer acount = userService.insert(user);
        if(acount>0){
            System.out.println("添加成功！");
        }else{
            System.out.println("添加失败！");
        }
    }
    @Test
    public void findAll(){
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }

    }
    @Test
    public void findById(){
        User user = userService.findById(51);
        System.out.println(user);
    }
}
