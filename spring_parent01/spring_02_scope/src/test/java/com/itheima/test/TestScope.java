package com.itheima.test;

import com.itheima.domain.Scope;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    @Test
    public void test(){
        ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scope scope01 = (Scope)ap.getBean("scope");
        Scope scope02 = (Scope)ap.getBean("scope");
        System.out.println(scope01);
        System.out.println(scope02);



    }
}
