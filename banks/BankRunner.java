package com.xworkz.methodOverriding.banks;

import com.xworkz.methodOverriding.banks.bank.Bank;
import com.xworkz.methodOverriding.banks.sbi.Sbi;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.openAccount();
        bank.provideLoan();
        bank.issueCard();
        bank.netBanking();
        bank.closeAccount();

        Bank bank1 = new Sbi();
        bank1.openAccount();
        bank1.provideLoan();
        bank1.issueCard();
        bank1.netBanking();
        bank1.closeAccount();

        Sbi nb = new Sbi();
        nb.openAccount();
        nb.provideLoan();
        nb.issueCard();
        nb.netBanking();
        nb.closeAccount();
    }
}

