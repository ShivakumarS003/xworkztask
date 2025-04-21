package com.xworkz.methodOverriding.companies.tcs;

import com.xworkz.methodOverriding.companies.company.Company;

public class Tcs extends Company {
    @Override
    public void hire() {
        System.out.println("TechCompany: Hiring software developers");
    }

    @Override
    public void train() {
        System.out.println("TechCompany: Technical bootcamps");
    }

    @Override
    public void developProduct() {
        System.out.println("TechCompany: Developing mobile apps");
    }

    @Override
    public void market() {
        System.out.println("TechCompany: Online digital marketing");
    }

    @Override
    public void generateRevenue() {
        System.out.println("TechCompany: Revenue via subscriptions");
    }
}
