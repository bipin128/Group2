package com.vastika.controller;

import com.vastika.model.AccountBalance;
import com.vastika.model.AccountInfo;
import com.vastika.service.AccountService;
import com.vastika.service.AccountServiceImpl;

import java.util.Scanner;

public class AccountController {
	public int balance;
	AccountService accountService = new AccountServiceImpl();

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
		System.out.println("Please wait while we create your account.");
		System.out.println("System loading...");
		try {
			Thread.sleep(2000);
			accountInfo.setAccount_name(account_name);
			accountInfo.setAddress(address);
			accountInfo.setMobile_no(mobile_No);
			accountInfo.setSs_No(ssNo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println(accountInfo);
		return accountInfo;//returns all the accountInfo which was set above
	}
	
	
	public void openAccount(Scanner input) {
		AccountInfo accountInfo = getAccountData(input);
		int saved = accountService.openAccount(accountInfo);
		if (saved >= 1) {
			System.out.println("----------------------------------------");
			System.out.println("Your account was successfully created!!!");
		} else {
			System.out.println("There was an error creating your account.");
		}
	}


	private AccountBalance getAccountBalance(Scanner input) {
		AccountBalance accountBalance = new AccountBalance();
		System.out.println("Enter the amount to be deposited-");
		int amount = input.nextInt();
		balance = amount + balance;
		accountBalance.setDepositAmount(amount);
		// accountBalance.setWithdrawAmount(0);
		accountBalance.setBalance(balance);
		//System.out.println(accountBalance);
		return accountBalance;//com.vastika.model.AccountBalance@319b92f3
	}
	
	public void deposit(Scanner input) {
		AccountBalance accountBalance = getAccountBalance(input);
		System.out.println("Enter your Social Security Number-");
		int ss_No = input.nextInt();
		accountBalance.setSs_No(ss_No);
		try {

			System.out.println("Please wait while we deposit to your account.");
			System.out.println("System loading...");
			Thread.sleep(2000);
			int amount = accountService.deposit(accountBalance);
			if (amount >= 1) {
				System.out.println("---------------------------------------");
				System.out.println("Your amount was successfully deposited.");
			} else {
				System.out.println("There was an error depositing to your account.");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
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
	
	
	public void withdraw(Scanner input) {
		AccountBalance accountBalance = getWithdrawBalance(input);
		System.out.println("Enter your Social Security Number-");
		int ss_No = input.nextInt();
		accountBalance.setSs_No(ss_No);
		try {

			System.out.println("Please wait while we withdraw from your account.");
			System.out.println("System loading...");
			Thread.sleep(2000);
			int amount = accountService.withdraw(accountBalance);
			if (amount >= 1) {
				System.out.println("----------------------------------");
				System.out.println("Amount was successfully Withdrawn.");
			} else {
				System.out.println("There was an error withdrawing from your account.");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}


	public void showAll(Scanner input) {
		System.out.println("Enter ss_No: ");
		int ss_No = input.nextInt();
		try {

			System.out.println("Please wait while we display your account statement.");
			System.out.println("System loading...");
			Thread.sleep(2000);
			AccountBalance accountBalance = accountService.showAll(ss_No);
			System.out.println("----------------------------------------");
			System.out.println("Your Social Security Number is: " + accountBalance.getSs_No());
			System.out.println("Your Latest Deposit Amount is: " + accountBalance.getDepositAmount());
			System.out.println("Your Latest Withdraw Amount is: " + accountBalance.getWithdrawAmount());
			System.out.println("Your Current Balance  is: " + accountBalance.getBalance());
			System.out.println("Your Id is: " + accountBalance.getId());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
