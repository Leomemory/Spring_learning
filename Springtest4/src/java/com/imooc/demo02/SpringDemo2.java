package com.imooc.demo02;

import org.junit.Test;

public class SpringDemo2 {
    @Test
    public void demo02(){
        ProductDao productDao = new ProductDao();

        //产生代理对象
        ProductDao proxy = (ProductDao) new MyCglibProxy(productDao).createProxy();

        //调用增强的方法
        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();
    }
}
