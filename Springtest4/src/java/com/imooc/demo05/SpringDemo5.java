package com.imooc.demo05;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config3.xml")
public class SpringDemo5 {
    @Resource(name = "CustomerDao")
    private CustomerDao customerDao;

    @Resource(name = "StudentDao")
    private StudentDao studentDao;

    @Test
    public void demo01(){
        customerDao.find();
        customerDao.save();
        customerDao.update();
        customerDao.delete();

        studentDao.find();
        studentDao.save();
        studentDao.update();
        studentDao.delete();
    }
}
