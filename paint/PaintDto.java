package com.xworkz.toString.paint;

public class PaintDto {
    private String brandName;
    private String color;
    private String type;
    private double quantityInLiters;
    private double price;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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

    public double getQuantityInLiters() {
        return quantityInLiters;
    }

    public void setQuantityInLiters(double quantityInLiters) {
        this.quantityInLiters = quantityInLiters;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PaintDto :-" +
                "\nBrand Name = " + this.brandName +
                "\nColor = " + this.color +
                "\nType = " + this.type +
                "\nQuantity = " + this.quantityInLiters + " liters" +
                "\nPrice = " + this.price;
    }
}
