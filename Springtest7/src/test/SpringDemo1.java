import com.imooc.demo1.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/*Spring编程式事务管理方式*/
/*账户服务测试*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1 {
    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo01(){
        accountService.transfer("aaa","bbb",200d);
    }
}
