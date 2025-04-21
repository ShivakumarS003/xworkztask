package com.xworkz.methodOverriding.oceans.pacific;


import com.xworkz.methodOverriding.oceans.ocean.Ocean;

public class Pacific extends Ocean {
    @Override
    public void depth() {
        System.out.println("PacificOcean: Deepest in the world");
    }

    @Override
    public void currentFlow() {
        System.out.println("PacificOcean: Strong equatorial currents");
    }

    @Override
    public void temperature() {
        System.out.println("PacificOcean: Varies with latitude");
    }

    @Override
    public void salinity() {
        System.out.println("PacificOcean: Moderate salinity levels");
    }

    @Override
    public void biodiversity() {
        System.out.println("PacificOcean: Rich marine biodiversity");
    }
}
