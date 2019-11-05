package com.imooc.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config1.xml")
public class SpringDemo1 {
    @Resource(name = "ProductDao")
    private ProductDao productDao;

    @Test
    public void demo01(){
        productDao.save();
        productDao.update();
        productDao.delete();
        productDao.findOne();
        productDao.findAll();
    }
}
