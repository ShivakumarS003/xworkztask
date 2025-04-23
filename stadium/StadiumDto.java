package com.xworkz.toString.stadium;

public class StadiumDto {
    private String name;
    private String location;
    private int capacity;
    private int yearBuilt;
    private String surfaceType;

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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getSurfaceType() {
        return surfaceType;
    }

    public void setSurfaceType(String surfaceType) {
        this.surfaceType = surfaceType;
    }

    @Override
    public String toString() {
        return "StadiumDto :-" +
                "\nName = " + this.name +
                "\nLocation = " + this.location +
                "\nCapacity = " + this.capacity +
                "\nYear Built = " + this.yearBuilt +
                "\nSurface Type = " + this.surfaceType;
    }
}
