package com.imooc.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 *创建对象的注解有四个：
 * @Component：作用在类上
 * @Repository：用于对DAO实现类进行标注(持久层)。
 * @Service：用于对Service实现类进行标注(业务层)。
 * @Controller：用于对Controller实现类进行标注(WEB层)。
 *
 * Spring 的 Bean 管理的注释方式
 * 传统方式需要去XML中配置<bean id="" class=""></bean>
 */

@Component("UserService")    //类似于<bean id="UserService" class="..." />
public class UserService {
    @Value("米饭")    //直接使用注解，不用另外写setter和getter方法
    private String something;

    public String sayHello(String name){
        return "hello " + name;
    }

    public void eat(){
        System.out.println("eat:"+something);
    }

//    @Autowired      //自动注入UserDao类
//    @Qualifier("UserDao")    //使用名称注入

    /*@Resource 相当于是@Autowired和@Qualifier这两个注解一起使用。意思就是说我一个@Resource就能指定对象引用注入了。*/

    @Resource(name = "UserDao")
    private UserDao userDao;
    public void save() {
        System.out.println("UserService 中保存用户。。。");
        userDao.save();
    }
}
