package com.vastika.model;

public class AccountInfo {
    int id;
    String accountName;//account name
    String address;//address
    long mobileNo;
    int ssNo;

    public AccountInfo(int id, String accountName, String address, long mobileNo, int ssNo) {
        this.id = id;
        this.accountName = accountName;
        this.address = address;
        this.mobileNo = mobileNo;
        this.ssNo = ssNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getSsNo() {
        return ssNo;
    }

    public void setSsNo(int ssNo) {
        this.ssNo = ssNo;
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", address='" + address + '\'' +
                ", mobileNo=" + mobileNo +
                ", ssNo=" + ssNo +
                '}';
    }
}
