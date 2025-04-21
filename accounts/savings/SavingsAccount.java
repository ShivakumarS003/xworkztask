package com.xworkz.methodOverriding.accounts.savings;

import com.xworkz.methodOverriding.accounts.account.Account;

public class SavingsAccount extends Account {
    @Override
    public void create() {
        System.out.println("SavingsAccount: Opened with interest benefits");
    }

    @Override
    public void deposit() {
        System.out.println("SavingsAccount: Depositing with passbook update");
    }

    @Override
    public void withdraw() {
        System.out.println("SavingsAccount: ATM withdrawal");
    }

    @Override
    public void checkBalance() {
        System.out.println("SavingsAccount: Balance checked via mobile app");
    }

    @Override
    public void close() {
        System.out.println("SavingsAccount: Closed with final interest");
    }
}

