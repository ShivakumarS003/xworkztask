package com.xworkz.methodOverriding.banks.sbi;

import com.xworkz.methodOverriding.banks.bank.Bank;

public class Sbi extends Bank {
    @Override
    public void openAccount() {
        System.out.println("NationalBank: Opened savings account");
    }

    @Override
    public void provideLoan() {
        System.out.println("NationalBank: Sanctioned personal loan");
    }

    @Override
    public void issueCard() {
        System.out.println("NationalBank: Issued debit card");
    }

    @Override
    public void netBanking() {
        System.out.println("NationalBank: Mobile app banking active");
    }

    @Override
    public void closeAccount() {
        System.out.println("NationalBank: Closed with full statement");
    }
}

