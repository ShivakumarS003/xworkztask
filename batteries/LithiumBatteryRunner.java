package com.xworkz.inhertance.batteries;

import com.xworkz.inhertance.batteries.lithiumbattery.LithiumBattery;

public class LithiumBatteryRunner {
    public static void main(String[] args) {
        LithiumBattery battery = new LithiumBattery();
        battery.supplyPower();
    }
}
