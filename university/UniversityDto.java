package com.xworkz.toString.university;

public class UniversityDto {
    private int universityId;
    private String universityName;
    private String location;
    private int numberOfDepartments;
    private String establishedYear;

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    public String getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(String establishedYear) {
        this.establishedYear = establishedYear;
    }

    @Override
    public String toString() {
        return "UniversityDto :-" +
                "\nUniversity ID = " + this.universityId +
                "\nUniversity Name = " + this.universityName +
                "\nLocation = " + this.location +
                "\nNumber of Departments = " + this.numberOfDepartments +
                "\nEstablished Year = " + this.establishedYear;
    }
}
