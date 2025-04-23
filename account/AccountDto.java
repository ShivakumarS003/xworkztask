package com.xworkz.toString.account;

public class AccountDto {
    private int accountId;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private String bankName;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "AccountDto :-" +
                "\nAccount ID = " + this.accountId +
                "\nAccount Holder Name = " + this.accountHolderName +
                "\nBalance = " + this.balance +
                "\nAccount Type = " + this.accountType +
                "\nBank Name = " + this.bankName;
    }
}
