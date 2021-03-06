import com.imooc.demo3.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringDemo3 {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo01(){
        accountService.transfer("bbb", "aaa", 200d);
    }
}
