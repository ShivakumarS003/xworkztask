package com.xworkz.methodOverriding.Currencies.Currency;
public class Currency {
    public void print() {
        System.out.println("Currency: Printing notes");
    }

    public void mint() {
        System.out.println("Currency: Minting coins");
    }

    public void circulate() {
        System.out.println("Currency: Circulating money");
    }

    public void exchange() {
        System.out.println("Currency: Exchanging foreign currency");
    }

    public void destroy() {
        System.out.println("Currency: Destroying damaged notes");
    }
}
