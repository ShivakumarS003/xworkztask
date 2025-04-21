package com.xworkz.methodOverriding.sensors.gassensor;

import com.xworkz.methodOverriding.sensors.sensor.Sensor;

public class GasSensor extends Sensor {
    @Override
    public void detect() {
        System.out.println("TemperatureSensor: Measuring ambient temperature");
    }

    @Override
    public void calibrate() {
        System.out.println("TemperatureSensor: Calibrated to Celsius scale");
    }

    @Override
    public void transmitData() {
        System.out.println("TemperatureSensor: Sending temperature readings");
    }

    @Override
    public void getStatus() {
        System.out.println("TemperatureSensor: Operating within range");
    }

    @Override
    public void shutdown() {
        System.out.println("TemperatureSensor: Entering sleep mode");
    }
}
