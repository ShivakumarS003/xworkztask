package com.xworkz.toString.restraunt;

public class RestaurantDto {
    private String name;
    private String cuisineType;
    private String location;
    private int rating;
    private int employeeCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    @Override
    public String toString() {
        return "RestaurantDto :-" +
                "\nName = " + this.name +
                "\nCuisine Type = " + this.cuisineType +
                "\nLocation = " + this.location +
                "\nRating = " + this.rating +
                "\nEmployee Count = " + this.employeeCount;
    }
}
