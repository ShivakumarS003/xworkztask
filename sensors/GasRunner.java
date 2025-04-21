package com.xworkz.methodOverriding.sensors;

import com.xworkz.methodOverriding.sensors.gassensor.GasSensor;
import com.xworkz.methodOverriding.sensors.sensor.Sensor;

public class GasRunner {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.detect();
        sensor.calibrate();
        sensor.transmitData();
        sensor.getStatus();
        sensor.shutdown();

        Sensor sensor1 = new GasSensor();
        sensor1.detect();
        sensor1.calibrate();
        sensor1.transmitData();
        sensor1.getStatus();
        sensor1.shutdown();

        GasSensor temp = new GasSensor();
        temp.detect();
        temp.calibrate();
        temp.transmitData();
        temp.getStatus();
        temp.shutdown();
    }
}
