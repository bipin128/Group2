package com.vastika.service;

import com.vastika.dao.AccountDao;
import com.vastika.dao.AccountDaoImpl;
import com.vastika.model.AccountBalance;
import com.vastika.model.AccountInfo;

public class AccountServiceImpl  implements AccountService{
    AccountDao accountDao=new AccountDaoImpl();
    @Override
    public int openAccount(AccountInfo accountInfo) {
        return accountDao.openAccount(accountInfo);
    }

    @Override
    public int deposit(AccountBalance accountBalance) {
        return accountDao.deposit(accountBalance);

    }

    @Override
    public int withdraw(AccountBalance accountBalance) {
        return accountDao.withdraw(accountBalance);
    }

    @Override
    public  AccountBalance showAll(int ss_No){
        return accountDao.showAll(ss_No);
    }

}
