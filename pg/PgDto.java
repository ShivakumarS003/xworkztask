package com.xworkz.toString.pg;

public class PgDto {
    private int id;
    private String pgName;
    private long phoneNumber;
    private double rent;
    private String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPgName() {
        return pgName;
    }

    public void setPgName(String pgName) {
        this.pgName = pgName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "PgDto :-" +
                "\nID = " + this.id +
                "\nPG Name = " + this.pgName +
                "\nPhone Number = " + this.phoneNumber +
                "\nRent = " + this.rent +" per month"+
                "\nLocation = " + this.location;
    }
}
