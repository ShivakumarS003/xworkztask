package com.xworkz.methodOverriding.metals.gold;

import com.xworkz.methodOverriding.metals.metal.Metal;

public class Gold extends Metal {
    @Override
    public void melt() {
        System.out.println("Gold: Melted at 1064°C");
    }

    @Override
    public void mold() {
        System.out.println("Gold: Molded into jewelry");
    }

    @Override
    public void polish() {
        System.out.println("Gold: High gloss polish");
    }

    @Override
    public void store() {
        System.out.println("Gold: Stored in vault");
    }

    @Override
    public void transport() {
        System.out.println("Gold: Transported securely");
    }
}
