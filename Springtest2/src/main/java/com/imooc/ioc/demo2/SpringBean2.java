package com.imooc.ioc.demo2;

/*静态工厂实例化*/

public class SpringBean2 {
    public static Bean2 createBean2(){
        System.out.println("静态工厂方法执行");
        return new Bean2();
    }
}
