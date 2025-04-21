package com.xworkz.methodOverriding.plastic;

import com.xworkz.methodOverriding.plastic.Plastic.Plastic;
import com.xworkz.methodOverriding.plastic.bottle.Bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Plastic plastic = new Plastic();
        plastic.melt();
        plastic.mold();
        plastic.insulate();
        plastic.floatInWater();
        plastic.nonBiodegradable();

        Plastic plastic1 = new Bottle();
        plastic1.melt();
        plastic1.mold();
        plastic1.insulate();
        plastic1.floatInWater();
        plastic1.nonBiodegradable();

        Bottle poly = new Bottle();
        poly.melt();
        poly.mold();
        poly.insulate();
        poly.floatInWater();
        poly.nonBiodegradable();
    }
}
