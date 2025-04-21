package com.xworkz.methodOverriding.accounts;

import com.xworkz.methodOverriding.accounts.account.Account;
import com.xworkz.methodOverriding.accounts.savings.SavingsAccount;

public class SavingRunner {
    public static void main(String[] args) {
        Account account = new Account();
        account.create();
        account.deposit();
        account.withdraw();
        account.checkBalance();
        account.close();

        Account account1 = new SavingsAccount();
        account1.create();
        account1.deposit();
        account1.withdraw();
        account1.checkBalance();
        account1.close();

        SavingsAccount sa = new SavingsAccount();
        sa.create();
        sa.deposit();
        sa.withdraw();
        sa.checkBalance();
        sa.close();
    }
}

