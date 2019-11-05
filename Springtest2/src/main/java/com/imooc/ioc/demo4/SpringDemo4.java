package com.imooc.ioc.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo4 {
    @Test
//    构造方法的属性注入
    public void demo01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        User user = (User) applicationContext.getBean("User");
        System.out.println(user);
    }

    @Test
//    set 方法和 p 命名空间的属性注入
    public void demo02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        Person person = (Person) applicationContext.getBean("Person");
        System.out.println(person);
    }

    @Test
    //SpEL 的属性注入
    public void demo03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        Product product = (Product) applicationContext.getBean("Product");
        System.out.println(product);
    }
}

