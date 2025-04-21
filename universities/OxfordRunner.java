package com.xworkz.methodOverriding.universities;

import com.xworkz.methodOverriding.universities.oxford.Oxford;
import com.xworkz.methodOverriding.universities.university.University;

public class UniversityTest {
    public static void main(String[] args) {
        University university = new University();
        university.conductClasses();
        university.holdExams();
        university.grantDegrees();
        university.enrollStudents();
        university.organizeEvents();

        University university1 = new Oxford();
        university1.conductClasses();
        university1.holdExams();
        university1.grantDegrees();
        university1.enrollStudents();
        university1.organizeEvents();

        Oxford enggUni = new Oxford();
        enggUni.conductClasses();
        enggUni.holdExams();
        enggUni.grantDegrees();
        enggUni.enrollStudents();
        enggUni.organizeEvents();
    }
}
