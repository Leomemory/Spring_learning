package com.imooc.demo4;

/*账户服务*/

public interface AccountService {
    /**
     * 进行转账
     *
     * @param out   出账账户
     * @param in    入账账户
     * @param money 金额
     */
    public void transfer(String out, String in, Double money);
}
