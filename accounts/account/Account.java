package com.xworkz.methodOverriding.accounts.account;

public class Account {
    public void create() {
        System.out.println("Account: Created");
    }

    public void deposit() {
        System.out.println("Account: Depositing money");
    }

    public void withdraw() {
        System.out.println("Account: Withdrawing money");
    }

    public void checkBalance() {
        System.out.println("Account: Checking balance");
    }

    public void close() {
        System.out.println("Account: Closed");
    }
}

