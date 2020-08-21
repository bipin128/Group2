package com.vastika.dao;

import com.vastika.model.AccountBalance;
import com.vastika.model.AccountInfo;
import com.vastika.util.DatabaseUtil;

import java.sql.*;

public class AccountDaoImpl implements AccountDao {

    public static final String INSERT_SQl = "insert into account_info_tbl(account_name, address, mobile_No, socialSecurity_No)values(?,?,?,?)";


    @Override
    public int openAccount(AccountInfo accountInfo) {
        int saved = 0;
        try (
                Connection con = DatabaseUtil.getConnection();
                PreparedStatement ps = con.prepareStatement(INSERT_SQl);) {
            ps.setString(1, accountInfo.getAccount_name());
            ps.setString(2, accountInfo.getAddress());
            ps.setLong(3, accountInfo.getMobile_no());
            ps.setInt(4, accountInfo.getSocialSecurity_no());
            saved = ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return saved;
    }

    @Override
    public int deposit(AccountBalance accountBalance) {
        return 0;
    }

    @Override
    public int withdraw(AccountBalance accountBalance) {
        return 0;
    }

}