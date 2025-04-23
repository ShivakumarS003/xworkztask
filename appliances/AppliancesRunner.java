package com.xworkz.toString.appliances;

public class AppliancesRunner {
    public static void main(String[] args) {
        AppliancesDto appliance = new AppliancesDto();
        appliance.setApplianceId(201);
        appliance.setApplianceName("Washing Machine");
        appliance.setBrand("LG");
        appliance.setPrice(25000);
        appliance.setWarrantyPeriod(2);

        System.out.println(appliance);
    }
}
