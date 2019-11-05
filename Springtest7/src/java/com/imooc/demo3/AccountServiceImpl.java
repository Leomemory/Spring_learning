package com.imooc.demo3;

import com.imooc.demo3.AccountDao;

public class AccountServiceImpl implements AccountService {
    //注入转账的Dao类
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
        int i = 1/0;
        accountDao.inMoney(in, money);
    }
}
