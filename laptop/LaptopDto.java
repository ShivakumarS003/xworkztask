package com.xworkz.toString.laptop;

public class LaptopDto {
    private String brand;
    private String model;
    private int ramSizeGB;
    private int storageGB;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRamSizeGB() {
        return ramSizeGB;
    }

    public void setRamSizeGB(int ramSizeGB) {
        this.ramSizeGB = ramSizeGB;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "LaptopDto :-" +
                "\nBrand = " + this.brand +
                "\nModel = " + this.model +
                "\nRAM = " + this.ramSizeGB + " GB" +
                "\nStorage = " + this.storageGB + " GB" +
                "\nPrice = " + this.price;
    }
}
