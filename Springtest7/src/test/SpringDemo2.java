import com.imooc.demo2.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/*
* Spring声明式事务管理方式一：的测试类*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo2 {

    @Resource(name = "accountServiceProxy")
    private AccountService accountService;

    @Test
    public void demo01(){
        accountService.transfer("aaa","bbb",200d);
    }
}
