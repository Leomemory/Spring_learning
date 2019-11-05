package com.imooc.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:config2.xml")
public class SpringDemo2 {
    @Resource(name = "CustomerDao")
    private CustomerDao customerDao;

    @Test
    public void demo01(){
        customerDao.save();
        customerDao.update();
        customerDao.delete();
        customerDao.findOne();
        customerDao.findAll();
    }
}
