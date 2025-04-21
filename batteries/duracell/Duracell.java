package com.xworkz.methodOverriding.batteries.duracell;

import com.xworkz.methodOverriding.batteries.baterry.Battery;

public class Duracell extends Battery {
    @Override
    public void charge() {
        System.out.println("LithiumBattery: Fast charging enabled");
    }

    @Override
    public void discharge() {
        System.out.println("LithiumBattery: Slow discharge mode");
    }

    @Override
    public void storeEnergy() {
        System.out.println("LithiumBattery: High density energy storage");
    }

    @Override
    public void checkHealth() {
        System.out.println("LithiumBattery: Battery health is good");
    }

    @Override
    public void recycle() {
        System.out.println("LithiumBattery: Sent for chemical recycling");
    }
}

