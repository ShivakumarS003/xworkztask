package com.xworkz.methodOverriding.institutes;

import com.xworkz.methodOverriding.institutes.institute.Institute;
import com.xworkz.methodOverriding.institutes.xworkz.Xworkz;

public class Runner {
    public static void main(String[] args) {
        Institute inst = new Institute();
        inst.enrollStudent();
        inst.startCourse();
        inst.conductExam();
        inst.declareResults();
        inst.issueCertificate();

        Institute inst1 = new Xworkz();
        inst1.enrollStudent();
        inst1.startCourse();
        inst1.conductExam();
        inst1.declareResults();
        inst1.issueCertificate();

        Xworkz engg = new Xworkz();
        engg.enrollStudent();
        engg.startCourse();
        engg.conductExam();
        engg.declareResults();
        engg.issueCertificate();
    }
}
