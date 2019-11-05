package com.imooc.demo2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Bean2")
@Scope("prototype")  //相当于<bean scope="singleton"/>    prototype 或者 singleton
public class Bean2 {
}
