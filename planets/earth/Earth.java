package com.xworkz.methodOverriding.planets.earth;

import com.xworkz.methodOverriding.planets.planet.Planet;

public class Earth extends Planet {
    @Override
    public void rotate() {
        System.out.println("Earth: Rotates every 24 hours");
    }

    @Override
    public void revolve() {
        System.out.println("Earth: Revolves around sun in 365 days");
    }

    @Override
    public void atmosphere() {
        System.out.println("Earth: Has oxygen-rich atmosphere");
    }

    @Override
    public void supportLife() {
        System.out.println("Earth: Supports diverse lifeforms");
    }

    @Override
    public void surfaceType() {
        System.out.println("Earth: Mostly rocky with water bodies");
    }
}
