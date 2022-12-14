package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Account;

import java.math.BigDecimal;

public interface AccountDao {



    Account findAccountByUserId(int id);
    void update(int id, Account account);

    Account findByUsername(String name);
}
