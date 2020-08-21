package com.vastika.model;

public class AccountInfo {
    int id;
    String account_name;
    String address;
    int mobile_no;
    int socialSecurity_no;

    public AccountInfo() {
        this.id = id;
        this.account_name = account_name;
        this.address = address;
        this.mobile_no = mobile_no;
        this.socialSecurity_no = socialSecurity_no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }

    public int getSocialSecurity_no() {
        return socialSecurity_no;
    }

    public void setSocialSecurity_no(int socialSecurity_no) {
        this.socialSecurity_no = socialSecurity_no;
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "id=" + id +
                ", account_name='" + account_name + '\'' +
                ", address='" + address + '\'' +
                ", mobile_no=" + mobile_no +
                ", socialSecurity_no=" + socialSecurity_no +
                '}';
    }
}