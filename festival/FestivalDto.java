package com.xworkz.toString.festival;

public class FestivalDto {
    private String name;
    private String date;
    private String location;
    private String type;
    private int durationDays;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    @Override
    public String toString() {
        return "FestivalDto :-" +
                "\nName = " + this.name +
                "\nDate = " + this.date +
                "\nLocation = " + this.location +
                "\nType = " + this.type +
                "\nDuration (days) = " + this.durationDays;
    }
}
