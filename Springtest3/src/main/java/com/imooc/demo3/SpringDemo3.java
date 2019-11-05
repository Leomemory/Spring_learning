package com.imooc.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo3 {
    @Test
    public void demo01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        ProductService productService = (ProductService) applicationContext.getBean("ProductService");
        productService.save();
    }
}
