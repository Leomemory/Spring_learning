package com.imooc.ioc.demo1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class SpringDemo1 {
    /*spring方式实现*/
    @Test
    public void demo01(){
        //加载Spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        //通过Spring容器得到对象
        UserService userService = (UserService) applicationContext.getBean("UserService");
        userService.sayHello();
    }

    /*实现读取磁盘系统中的配置文件*/
    @Test
    public void demo02(){
        //创建Spring的工厂类
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("/" + "/Users/lijiang/Desktop/applicationConfig.xml");
        UserService userService = (UserService) applicationContext.getBean("UserService");
        userService.sayHello();
    }


    /*传统方式工厂类*/
    @Test
    public void demo04(){
        //创建工厂类
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationConfig.xml"));
        //通过工厂得到类
        UserService userService = (UserService) beanFactory.getBean("UserService");
        userService.sayHello();
    }

    @Test
    public void main(){
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("/" + "/Users/lijiang/Desktop/applicationConfig.xml"));
        UserService userService = (UserService) beanFactory.getBean("UserService");
        userService.sayHello();
    }
}
