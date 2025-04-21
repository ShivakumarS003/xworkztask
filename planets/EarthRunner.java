package com.xworkz.methodOverriding.planets;

import com.xworkz.methodOverriding.planets.earth.Earth;
import com.xworkz.methodOverriding.planets.planet.Planet;

public class EarthRunner {
    public static void main(String[] args) {
        Planet planet = new Planet();
        planet.rotate();
        planet.revolve();
        planet.atmosphere();
        planet.supportLife();
        planet.surfaceType();

        Planet planet1 = new Earth();
        planet1.rotate();
        planet1.revolve();
        planet1.atmosphere();
        planet1.supportLife();
        planet1.surfaceType();

        Earth earth = new Earth();
        earth.rotate();
        earth.revolve();
        earth.atmosphere();
        earth.supportLife();
        earth.surfaceType();
    }
}
