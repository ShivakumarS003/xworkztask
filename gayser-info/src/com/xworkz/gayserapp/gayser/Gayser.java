package com.xworkz.gayserapp.gayser;

public class Gayser {

    private int gayserId;

    private String brand;

    private String color;

    private int capacityInLiters;

    private double price;

    private boolean isAutomatic;

    private String mountingType;

    public void setGayserId(int gayserId) {
        this.gayserId = gayserId;
    }
    public int getGayserId() {
        return gayserId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setCapacityInLiters(int capacityInLiters) {
        this.capacityInLiters = capacityInLiters;
    }
    public int getCapacityInLiters() {
        return capacityInLiters;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setIsAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }
    public boolean getIsAutomatic() {
        return isAutomatic;
    }

    public void setMountingType(String mountingType) {
        this.mountingType = mountingType;
    }
    public String getMountingType() {
        return mountingType;
    }
}
