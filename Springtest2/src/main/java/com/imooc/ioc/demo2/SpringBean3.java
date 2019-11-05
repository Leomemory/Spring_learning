package com.imooc.ioc.demo2;

/*
 * 实例工厂实例化*/

public class SpringBean3 {
    public Bean3 createBean3(){
        System.out.println("Bean3工厂被执行");
        return new Bean3();
    }
}
