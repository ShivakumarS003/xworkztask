package com.xworkz.methodOverriding.appliances.fan;

import com.xworkz.methodOverriding.appliances.appliance.Appliance;

public class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan: Switching on with remote");
    }

    @Override
    public void operate() {
        System.out.println("Fan: Spinning at medium speed");
    }

    @Override
    public void adjustSettings() {
        System.out.println("Fan: Changing speed to high");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Turning off using timer");
    }

    @Override
    public void maintenance() {
        System.out.println("Fan: Cleaning blades and motor");
    }
}
