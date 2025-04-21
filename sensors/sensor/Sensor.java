package com.xworkz.methodOverriding.sensors.sensor;

public class Sensor {
    public void detect() {
        System.out.println("Sensor: Detecting changes in environment");
    }

    public void calibrate() {
        System.out.println("Sensor: Calibrating for accuracy");
    }

    public void transmitData() {
        System.out.println("Sensor: Transmitting data to system");
    }

    public void getStatus() {
        System.out.println("Sensor: Getting operational status");
    }

    public void shutdown() {
        System.out.println("Sensor: Shutting down to save power");
    }
}
