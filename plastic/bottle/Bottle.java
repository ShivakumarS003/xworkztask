package com.xworkz.methodOverriding.plastic.bottle;

import com.xworkz.methodOverriding.plastic.Plastic.Plastic;

public class Bottle extends Plastic {
    @Override
    public void melt() {
        System.out.println("Polyethylene: Melts around 115°C");
    }

    @Override
    public void mold() {
        System.out.println("Polyethylene: Molded into containers and films");
    }

    @Override
    public void insulate() {
        System.out.println("Polyethylene: Used for electrical insulation");
    }

    @Override
    public void floatInWater() {
        System.out.println("Polyethylene: Floats easily in water");
    }

    @Override
    public void nonBiodegradable() {
        System.out.println("Polyethylene: Not biodegradable, recyclable");
    }
}
