package com.imooc.demo2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("Bean1")
public class Bean1 {
    @PostConstruct
    public void init(){
        System.out.println("我是PostConstruct，相当于 init-method");
    }

    public void say() {
        System.out.println("say...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("我是PreDestroy，相当于 destroy-method");
    }
}
