package com.xworkz.methodOverriding.Currencies.rupee;

import com.xworkz.methodOverriding.Currencies.Currency.Currency;

public class Rupee extends Currency {
    @Override
    public void print() {
        System.out.println("DigitalCurrency: No physical notes printed");
    }

    @Override
    public void mint() {
        System.out.println("DigitalCurrency: Minted virtually");
    }

    @Override
    public void circulate() {
        System.out.println("DigitalCurrency: Circulated via wallets");
    }

    @Override
    public void exchange() {
        System.out.println("DigitalCurrency: Converted digitally");
    }

    @Override
    public void destroy() {
        System.out.println("DigitalCurrency: Destroyed on blockchain");
    }
}
