package com.xworkz.methodOverriding.institutes.xworkz;

import com.xworkz.methodOverriding.institutes.institute.Institute;

public class Xworkz extends Institute {
    @Override
    public void enrollStudent() {
        System.out.println("EngineeringInstitute: Admission via entrance exam");
    }

    @Override
    public void startCourse() {
        System.out.println("EngineeringInstitute: Engineering courses begin");
    }

    @Override
    public void conductExam() {
        System.out.println("EngineeringInstitute: Semester exams scheduled");
    }

    @Override
    public void declareResults() {
        System.out.println("EngineeringInstitute: Results uploaded on portal");
    }

    @Override
    public void issueCertificate() {
        System.out.println("EngineeringInstitute: Degree certificates distributed");
    }
}
