package com.imooc.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {
    @Test
    public void demo01(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Bean1 bean1 = (Bean1) applicationContext.getBean("Bean1");
        bean1.say();
        applicationContext.close();
    }

    @Test
    public void demo02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Bean2 bean1 = (Bean2) applicationContext.getBean("Bean2");
        Bean2 bean2 = (Bean2) applicationContext.getBean("Bean2");
        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(bean1 == bean2);
    }
}
