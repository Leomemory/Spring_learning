package com.imooc.ioc.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*bean的实例化的三种方式*/

public class SpringDemo2 {
    @Test
    public void demo01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        Bean1 bean1 = (Bean1) applicationContext.getBean("Bean1");
    }

    @Test
    public void demo02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        Bean2 bean2 = (Bean2) applicationContext.getBean("Bean2");
    }

    @Test
    public void demo03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        Bean3 bean3 = (Bean3) applicationContext.getBean("Bean3");
    }
}
