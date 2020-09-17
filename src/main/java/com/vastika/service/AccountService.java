package com.vastika.service;

import com.vastika.model.AccountBalance;
import com.vastika.model.AccountInfo;

public interface AccountService {

	int openAccount(AccountInfo accountInfo);

	int deposit(AccountBalance accountBalance);

	int withdraw(AccountBalance accountBalance);

	AccountBalance showAll(int ss_No);

}
