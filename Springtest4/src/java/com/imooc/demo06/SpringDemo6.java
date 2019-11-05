package com.imooc.demo06;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config4.xml")
public class SpringDemo6 {

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
