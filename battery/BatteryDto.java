package com.xworkz.toString.battery;

public class BatteryDto {
    private int batteryId;
    private String brand;
    private double capacity;
    private String type;
    private int voltage;

    public int getBatteryId() {
        return batteryId;
    }

    public void setBatteryId(int batteryId) {
        this.batteryId = batteryId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "BatteryDto :-" +
                "\nBattery ID = " + this.batteryId +
                "\nBrand = " + this.brand +
                "\nCapacity = " + this.capacity +
                "\nType = " + this.type +
                "\nVoltage = " + this.voltage;
    }
}
