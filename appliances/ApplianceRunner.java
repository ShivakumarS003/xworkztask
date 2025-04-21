package com.xworkz.methodOverriding.appliances;

import com.xworkz.methodOverriding.appliances.appliance.Appliance;
import com.xworkz.methodOverriding.appliances.fan.Fan;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        appliance.turnOn();
        appliance.operate();
        appliance.adjustSettings();
        appliance.turnOff();
        appliance.maintenance();

        Appliance appliance1 = new Fan();
        appliance1.turnOn();
        appliance1.operate();
        appliance1.adjustSettings();
        appliance1.turnOff();
        appliance1.maintenance();

        Fan fan = new Fan();
        fan.turnOn();
        fan.operate();
        fan.adjustSettings();
        fan.turnOff();
        fan.maintenance();
    }
}

