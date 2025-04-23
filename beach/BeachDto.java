package com.xworkz.toString.beach;

public class BeachDto {
    private String name;
    private String location;
    private double areaInSquareKilometers;
    private boolean isPopular;
    private String mainAttraction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getAreaInSquareKilometers() {
        return areaInSquareKilometers;
    }

    public void setAreaInSquareKilometers(double areaInSquareKilometers) {
        this.areaInSquareKilometers = areaInSquareKilometers;
    }

    public boolean isPopular() {
        return isPopular;
    }

    public void setPopular(boolean isPopular) {
        this.isPopular = isPopular;
    }

    public String getMainAttraction() {
        return mainAttraction;
    }

    public void setMainAttraction(String mainAttraction) {
        this.mainAttraction = mainAttraction;
    }

    @Override
    public String toString() {
        return "BeachDto :-" +
                "\nName = " + this.name +
                "\nLocation = " + this.location +
                "\nArea = " + this.areaInSquareKilometers + " sq. km" +
                "\nPopular = " + (this.isPopular ? "Yes" : "No") +
                "\nMain Attraction = " + this.mainAttraction;
    }
}
