package com.xworkz.toString.battery;

public class BatteryRunner {
    public static void main(String[] args) {
        BatteryDto battery = new BatteryDto();
        battery.setBatteryId(101);
        battery.setBrand("Duracell");
        battery.setCapacity(3000);
        battery.setType("Lithium");
        battery.setVoltage(12);

        System.out.println(battery);
    }
}
