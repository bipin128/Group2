package com.vastika.controller;

import com.vastika.model.AccountBalance;
import com.vastika.model.AccountInfo;
import com.vastika.service.AccountService;
import com.vastika.service.AccountServiceImpl;

import java.util.Scanner;

public class AccountController {
    public int balance;
    AccountService accountService = new AccountServiceImpl();

    public void openAccount(Scanner input) {
        AccountInfo accountInfo = getAccountData(input);
        int saved = accountService.openAccount(accountInfo);
        if (saved >= 1) {
            System.out.println("Account is successfully opened!!!");
        } else {
            System.out.println("error in DataBase.");
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

    public void deposit(Scanner input) {
        AccountBalance accountBalance = getAccountBalance(input);
        System.out.println("Enter your Social Security Number-");
        int ss_No = input.nextInt();
        accountBalance.setSs_No(ss_No);
        int amount = accountService.deposit(accountBalance);
        if (amount >= 1) {
            System.out.println("The amount is successfully Deposited.");
        } else {
            System.out.println("Error in DataBase");
        }
    }

    private AccountBalance getAccountBalance(Scanner input) {
        AccountBalance accountBalance = new AccountBalance();
        System.out.println("Enter the amount to be deposited-");
        int amount = input.nextInt();
        balance = amount + balance;
        accountBalance.setDepositAmount(amount);
        accountBalance.setWithdrawAmount(0);
        accountBalance.setBalance(balance);
        return accountBalance;
    }

    public void withdraw(Scanner input) {
        AccountBalance accountBalance = getWithdrawBalance(input);
        System.out.println("Enter your Social Security Number-");
        int ss_No = input.nextInt();
        accountBalance.setSs_No(ss_No);
        int amount = accountService.deposit(accountBalance);
        if (amount >= 1) {
            System.out.println("The amount is successfully Withdrawn.");
        } else {
            System.out.println("Error in DataBase");
        }
    }

    private AccountBalance getWithdrawBalance(Scanner input) {
        AccountBalance accountBalance = new AccountBalance();
        System.out.println("Enter the amount to be withdrawn-");
        int amount = input.nextInt();
        balance = balance - amount;
        accountBalance.setWithdrawAmount(amount);
        accountBalance.setBalance(balance);
        return accountBalance;
    }
}