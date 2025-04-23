package com.xworkz.toString.pen;

public class PenDto {
    private String brand;
    private String color;
    private String type;
    private double price;
    private boolean isRefillable;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isRefillable() {
        return isRefillable;
    }

    public void setRefillable(boolean refillable) {
        isRefillable = refillable;
    }

    @Override
    public String toString() {
        return "PenDto :-" +
                "\nBrand = " + this.brand +
                "\nColor = " + this.color +
                "\nType = " + this.type +
                "\nPrice = " + this.price +
                "\nRefillable = " + this.isRefillable;
    }
}
