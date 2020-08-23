package com.vastika.model;

public class AccountBalance {
    int ss_No;
    int depositAmount;
    int withdrawAmount;
    int balance;

    public AccountBalance(int ss_No, int depositAmount, int withdrawAmount, int balance) {
        this.ss_No = ss_No;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
        this.balance = balance;
    }

    public AccountBalance() {

    }

    public int getSs_No() {
        return ss_No;
    }

    public void setSs_No(int ss_No) {
        this.ss_No = ss_No;
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public int getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}