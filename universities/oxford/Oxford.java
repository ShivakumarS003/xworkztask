package com.xworkz.methodOverriding.universities.oxford;

import com.xworkz.methodOverriding.universities.university.University;

public class Oxford extends University {
    @Override
    public void conductClasses() {
        System.out.println("EngineeringUniversity: Conducting theory and lab sessions");
    }

    @Override
    public void holdExams() {
        System.out.println("EngineeringUniversity: Holding practical and theory exams");
    }

    @Override
    public void grantDegrees() {
        System.out.println("EngineeringUniversity: Granting B.Tech and M.Tech degrees");
    }

    @Override
    public void enrollStudents() {
        System.out.println("EngineeringUniversity: Enrolling based on entrance exams");
    }

    @Override
    public void organizeEvents() {
        System.out.println("EngineeringUniversity: Organizing tech fests and hackathons");
    }
}
