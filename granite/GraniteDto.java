package com.xworkz.toString.granite;

public class GraniteDto {
    private String color;
    private String type;
    private double thickness;
    private double pricePerSquareMeter;
    private String origin;

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

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public double getPricePerSquareMeter() {
        return pricePerSquareMeter;
    }

    public void setPricePerSquareMeter(double pricePerSquareMeter) {
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "GraniteDto :-" +
                "\nColor = " + this.color +
                "\nType = " + this.type +
                "\nThickness = " + this.thickness + " cm" +
                "\nPrice per Square Meter = " + this.pricePerSquareMeter +
                "\nOrigin = " + this.origin;
    }
}
