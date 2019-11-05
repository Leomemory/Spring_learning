package com.imooc.demo1;

/*转账案例的业务层实现类*/

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {
    //注入转账的Dao类
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    //注入事务管理的模版
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    @Override
    public void transfer(final String out,final String in,final Double money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            /*把两个操作绑定到一个事务中，要么一起成功，要么一起失败*/
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.outMoney(out, money);
//                 int i = 1 / 0;          /*用来测试，只能一起成功或一起失败，需要事务管理操作这时*/
                accountDao.inMoney(in, money);
            }
        });
    }
}
