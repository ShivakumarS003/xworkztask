package com.xworkz.methodOverriding.retruants;

import com.xworkz.methodOverriding.retruants.Kfc.Kfc;
import com.xworkz.methodOverriding.retruants.retruant.Restaurant;

public class KfcRunner {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        rest.open();
        rest.serveFood();
        rest.cleanTables();
        rest.prepareBill();
        rest.close();

        Restaurant rest1 = new Kfc();
        rest1.open();
        rest1.serveFood();
        rest1.cleanTables();
        rest1.prepareBill();
        rest1.close();

        Kfc italian = new Kfc();
        italian.open();
        italian.serveFood();
        italian.cleanTables();
        italian.prepareBill();
        italian.close();
    }
}
