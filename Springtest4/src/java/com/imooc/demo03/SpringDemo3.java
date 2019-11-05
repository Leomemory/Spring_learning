package com.imooc.demo03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config1.xml")
public class SpringDemo3 {
    @Resource(name = "StudentDaoProxy")

    private StudentDao studentDao;

    @Test
    public void demo01(){
        studentDao.find();
        studentDao.save();
        studentDao.update();
        studentDao.delete();
    }
}
