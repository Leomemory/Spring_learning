package com.imooc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {
    @Test
    public void demo01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        UserService userService = (UserService) applicationContext.getBean("UserService");
        String name = userService.sayHello("Spring");
        System.out.println(name);
    }

    @Test
    public void demo02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        UserService userService = (UserService) applicationContext.getBean("UserService");
        userService.eat();
    }

    @Test
    public void demo03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        UserService userService = (UserService) applicationContext.getBean("UserService");
        userService.save();
    }
}
