package com.xworkz.toString.city;

public class CityDto {
    private String name;
    private int population;
    private double area;
    private String country;
    private String timezone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        return "CityDto :-" +
                "\nName = " + this.name +
                "\nPopulation = " + this.population +
                "\nArea (sq km) = " + this.area +
                "\nCountry = " + this.country +
                "\nTimezone = " + this.timezone;
    }
}
