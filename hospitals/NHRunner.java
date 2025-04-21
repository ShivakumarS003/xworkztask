package com.xworkz.methodOverriding.Hospitals;

import com.xworkz.methodOverriding.Hospitals.hospital.Hospital;
import com.xworkz.methodOverriding.Hospitals.nh.NH;

public class NHRunner {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.admit();
        hospital.diagnose();
        hospital.treat();
        hospital.discharge();
        hospital.maintainRecords();

        Hospital hospital1 = new NH();
        hospital1.admit();
        hospital1.diagnose();
        hospital1.treat();
        hospital1.discharge();
        hospital1.maintainRecords();

        NH privateHosp = new NH();
        privateHosp.admit();
        privateHosp.diagnose();
        privateHosp.treat();
        privateHosp.discharge();
        privateHosp.maintainRecords();
    }
}
