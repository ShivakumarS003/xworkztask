package com.xworkz.methodOverriding.devices;

import com.xworkz.methodOverriding.devices.clock.Clock;
import com.xworkz.methodOverriding.devices.device.Device;

public class ClockRunner {
    public static void main(String[] args) {
        Device device = new Device();
        device.powerOn();
        device.initialize();
        device.operate();
        device.shutdown();
        device.statusReport();

        Device device1 = new Clock();
        device1.powerOn();
        device1.initialize();
        device1.operate();
        device1.shutdown();
        device1.statusReport();

        Clock clock = new Clock();
        clock.powerOn();
        clock.initialize();
        clock.operate();
        clock.shutdown();
        clock.statusReport();
    }
}

