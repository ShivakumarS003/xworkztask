package com.xworkz.methodOverriding.oceans;


import com.xworkz.methodOverriding.oceans.ocean.Ocean;
import com.xworkz.methodOverriding.oceans.pacific.Pacific;

public class PacificRunner {
    public static void main(String[] args) {
        Ocean ocean = new Ocean();
        ocean.depth();
        ocean.currentFlow();
        ocean.temperature();
        ocean.salinity();
        ocean.biodiversity();

        Pacific ocean1 = new Pacific();
        ocean1.depth();
        ocean1.currentFlow();
        ocean1.temperature();
        ocean1.salinity();
        ocean1.biodiversity();

        Pacific pacific = new Pacific();
        pacific.depth();
        pacific.currentFlow();
        pacific.temperature();
        pacific.salinity();
        pacific.biodiversity();
    }
}
