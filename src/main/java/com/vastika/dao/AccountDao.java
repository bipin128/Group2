package com.vastika.dao;

import com.vastika.model.AccountBalance;
import com.vastika.model.AccountInfo;

import java.util.List;

public interface AccountDao {
    int openAccount(AccountInfo accountInfo);

    int deposit(AccountBalance accountBalance);

    int withdraw(AccountBalance accountBalance);

    AccountBalance showAll(int ss_No);

}
