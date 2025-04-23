package com.xworkz.toString.account;

public class AccountRunner {
    public static void main(String[] args) {
        AccountDto account = new AccountDto();
        account.setAccountId(1001);
        account.setAccountHolderName("Baba");
        account.setBalance(50000.75);
        account.setAccountType("Savings");
        account.setBankName("SBI Bank");

        System.out.println(account);
    }
}
