package com.vastika.controller;

import com.vastika.model.AccountInfo;
import com.vastika.service.AccountService;
import com.vastika.service.AccountServiceImpl;

import java.util.Scanner;

public class AccountController {
    AccountService accountService = new AccountServiceImpl();

    public void openAccount(Scanner input) {
        AccountInfo accountInfo = getAccountData(input);
        int saved = accountService.openAccount(accountInfo);
        if (saved >= 1) {
            System.out.println("Account is successfully opened!!!");
        } else {
            System.out.println("error in db.");
        }
    }

    private AccountInfo getAccountData(Scanner input) {
        AccountInfo accountInfo = new AccountInfo();
        System.out.println("Enter Your Account Name: ");
        String account_name = input.next();
        input.nextLine();
        System.out.println("Enter Your Address: ");
        String address = input.nextLine();
        System.out.println("Enter Your Mobile Number ");
        int mobile_No = input.nextInt();
        System.out.println("Enter Social Security Number: ");
        int ssNo = input.nextInt();

        accountInfo.setAccount_name(account_name);
        accountInfo.setAddress(address);
        accountInfo.setMobile_no(mobile_No);
        accountInfo.setSocialSecurity_no(ssNo);
        return accountInfo;
    }
}