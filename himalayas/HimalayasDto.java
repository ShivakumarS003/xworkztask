package com.xworkz.toString.himalayas;

public class HimalayasDto {
    private String location;
    private double height;
    private String countries;
    private String mountainRangeType;
    private String famousPeaks;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getMountainRangeType() {
        return mountainRangeType;
    }

    public void setMountainRangeType(String mountainRangeType) {
        this.mountainRangeType = mountainRangeType;
    }

    public String getFamousPeaks() {
        return famousPeaks;
    }

    public void setFamousPeaks(String famousPeaks) {
        this.famousPeaks = famousPeaks;
    }

    @Override
    public String toString() {
        return "HimalayasDto :-" +
                "\nLocation = " + this.location +
                "\nHeight = " + this.height + " meters" +
                "\nCountries = " + this.countries +
                "\nMountain Range Type = " + this.mountainRangeType +
                "\nFamous Peaks = " + this.famousPeaks;
    }
}
