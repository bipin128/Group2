package com.vastika.model;

public class AccountBalance {
   int depositAmount;
   int withdrawAmount;
   int id;

    public AccountBalance(int depositAmount, int withdrawAmount, int balance) {
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
        this.id = balance;
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
        return id;
    }

    public void setBalance(int balance) {
        this.id = balance;
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "depositAmount=" + depositAmount +
                ", withdrawAmount=" + withdrawAmount +
                ", balance=" + id +
                '}';
    }
}
