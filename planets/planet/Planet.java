package com.xworkz.methodOverriding.planets.planet;

public class Planet {
    public void rotate() {
        System.out.println("Planet: Rotating on axis");
    }

    public void revolve() {
        System.out.println("Planet: Revolving around the sun");
    }

    public void atmosphere() {
        System.out.println("Planet: Contains atmosphere");
    }

    public void supportLife() {
        System.out.println("Planet: Life support capability varies");
    }

    public void surfaceType() {
        System.out.println("Planet: Composed of rock, gas or ice");
    }
}
