package com.xworkz.inhertance.banks;

import com.xworkz.inhertance.banks.hdfc.Hdfc;

public class HdfcRunner {
    public static void main(String[] args) {
        Hdfc bank = new Hdfc();
        bank.provideLoans();
    }
}
