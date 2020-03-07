package com.itheima.controller;

import com.itheima.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
@Controller("userController")
public class UserController {
    @Resource
    private UserService userService;
    public void test(){
        userService.test();
        System.out.println("执行了userController.test()");
    }
}
