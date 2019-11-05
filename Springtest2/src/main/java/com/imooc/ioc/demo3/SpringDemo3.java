package com.imooc.ioc.demo3;

/*bean作用范围的测试*/

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo3 {
    @Test
    public void demo01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        Person person1 = (Person) applicationContext.getBean("Person");
        Person person2 = (Person) applicationContext.getBean("Person");
        System.out.println(person1);
        System.out.println(person2);
    }

    @Test
    public void demo02(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        Man man = (Man) applicationContext.getBean("Man");

        System.out.println(man);

        applicationContext.close();      //用于演示销毁，把 ApplicationContext 暂时用 ClassPathXmlApplicationContext 替换
    }

    @Test
    public void demo03(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        Man man = (Man) applicationContext.getBean("Man");

        man.run();

        applicationContext.close();
    }

    @Test
    public void demo04(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("UserDao");

        userDao.findAll();
        userDao.save();
        userDao.update();
        userDao.delete();
    }
}
