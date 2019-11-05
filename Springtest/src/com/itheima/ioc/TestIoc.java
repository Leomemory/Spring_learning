package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
    public static void main(String[] args) {
        //初始化spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        //通过容器获取userDao实例
        UserDao userDao = (UserDao) applicationContext.getBean("UserDao");
        userDao.say();
    }
}
