package com.xworkz.shaadiapp.shaadiclientdto;

public class ShaadiClientDto {
    private int id;
    private String name;
    private String dob;
    private String gender;
    private long phoneNumber;
    private String religion;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getReligion() {
        return religion;
    }

    @Override
    public String toString() {
        return "ShaadiClientDto :-" +
                "\nID is " + this.id +
                "\nName is " + this.name +
                "\nD.O.B is " + this.dob +
                "\nGender is " + this.gender +
                "\nPhone Number is " + this.phoneNumber +
                "\nReligion is " + this.religion;
    }
}
