package com.xworkz.toString.company;

public class CompanyRunner {
    public static void main(String[] args) {
        CompanyDto company = new CompanyDto();
        company.setName("Tesla");
        company.setIndustry("Automotive");
        company.setEstablishedYear(2003);
        company.setFounder("Elon Musk");
        company.setEmployeesCount(70000);

        System.out.println(company);
    }
}
