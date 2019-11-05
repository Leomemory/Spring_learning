package com.imooc.ioc.demo1;

public class UserServiceImpl implements UserService{
    private String name;
    private String kind;

    public void sayHello() {
        System.out.println("Hello Spring" + kind + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
