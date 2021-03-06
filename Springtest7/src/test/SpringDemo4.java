import com.imooc.demo4.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo4 {
    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo01(){
        accountService.transfer("ccc","aaa",200d);
    }
}
