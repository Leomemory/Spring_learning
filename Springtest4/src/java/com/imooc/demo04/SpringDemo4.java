package com.imooc.demo04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config2.xml")
public class SpringDemo4 {
    @Resource(name = "CustomerDaoProxy")

    private CustomerDao customerDao;

    @Test
    public void demo01(){
        customerDao.find();
        customerDao.delete();
        customerDao.save();
        customerDao.update();
    }
}