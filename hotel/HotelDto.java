package com.xworkz.toString.hotel;

public class HotelDto {
    private String name;
    private String location;
    private int rating;
    private String managerName;
    private int roomCount;

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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    @Override
    public String toString() {
        return "HotelDto :-" +
                "\nName = " + this.name +
                "\nLocation = " + this.location +
                "\nRating = " + this.rating +
                "\nManager Name = " + this.managerName +
                "\nRoom Count = " + this.roomCount;
    }
}
