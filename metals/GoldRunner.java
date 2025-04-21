package com.xworkz.methodOverriding.metals;

import com.xworkz.methodOverriding.metals.gold.Gold;
import com.xworkz.methodOverriding.metals.metal.Metal;

public class GoldRunner {
    public static void main(String[] args) {
        Metal metal = new Metal();
        metal.melt();
        metal.mold();
        metal.polish();
        metal.store();
        metal.transport();

        Metal metal1 = new Gold();
        metal1.melt();
        metal1.mold();
        metal1.polish();
        metal1.store();
        metal1.transport();

        Gold gold = new Gold();
        gold.melt();
        gold.mold();
        gold.polish();
        gold.store();
        gold.transport();
    }
}
