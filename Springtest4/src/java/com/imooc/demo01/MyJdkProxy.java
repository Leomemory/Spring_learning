package com.imooc.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* 横向抽取，代码增强*/

public class MyJdkProxy implements InvocationHandler {
    private UserDao userDao;

    public MyJdkProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    public Object createProxy(){
        Object proxy = Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 对 save 进行增强
        if("save".equals(method.getName())){
            System.out.println("只有管理员可以进行添加保存操作,权限校验...");
            // args 参数化，UserDao中方法列表
            return method.invoke(userDao, args);
        }
        // invoke 调用 UserDao 中的方法
        return method.invoke(userDao, args);
    }
}
