package com.xworkz.methodOverriding.Currencies;

import com.xworkz.methodOverriding.Currencies.Currency.Currency;
import com.xworkz.methodOverriding.Currencies.rupee.Rupee;

public class RuppeRunner {
    public static void main(String[] args) {
        Currency currency = new Currency();
        currency.print();
        currency.mint();
        currency.circulate();
        currency.exchange();
        currency.destroy();

        Currency currency1 = new Rupee();
        currency1.print();
        currency1.mint();
        currency1.circulate();
        currency1.exchange();
        currency1.destroy();

        Rupee digital = new Rupee();
        digital.print();
        digital.mint();
        digital.circulate();
        digital.exchange();
        digital.destroy();
    }
}
