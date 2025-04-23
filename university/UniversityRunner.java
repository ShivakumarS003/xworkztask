package com.xworkz.toString.university;

public class UniversityRunner {
    public static void main(String[] args) {
        UniversityDto university = new UniversityDto();
        university.setUniversityId(401);
        university.setUniversityName("MIT");
        university.setLocation("Cambridge, MA");
        university.setNumberOfDepartments(15);
        university.setEstablishedYear("1861");

        System.out.println(university);
    }
}
