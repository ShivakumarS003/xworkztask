package com.xworkz.toString.tajmahal;

public class TajMahalDto {
    private String location;
    private String architect;
    private int yearOfConstruction;
    private String style;
    private double height;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getArchitect() {
        return architect;
    }

    public void setArchitect(String architect) {
        this.architect = architect;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "TajMahalDto :-" +
                "\nLocation = " + this.location +
                "\nArchitect = " + this.architect +
                "\nYear of Construction = " + this.yearOfConstruction +
                "\nStyle = " + this.style +
                "\nHeight = " + this.height + " meters";
    }
}
