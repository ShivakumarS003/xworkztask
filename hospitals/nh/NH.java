package com.xworkz.methodOverriding.Hospitals.nh;

import com.xworkz.methodOverriding.Hospitals.hospital.Hospital;

public class NH extends Hospital {
    @Override
    public void admit() {
        System.out.println("PrivateHospital: Admission with private room");
    }

    @Override
    public void diagnose() {
        System.out.println("PrivateHospital: Advanced diagnostics");
    }

    @Override
    public void treat() {
        System.out.println("PrivateHospital: Personalized treatment plan");
    }

    @Override
    public void discharge() {
        System.out.println("PrivateHospital: Smooth discharge process");
    }

    @Override
    public void maintainRecords() {
        System.out.println("PrivateHospital: Digital health records maintained");
    }
}
