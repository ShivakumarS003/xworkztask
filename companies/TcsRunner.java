package com.xworkz.methodOverriding.companies;

import com.xworkz.methodOverriding.companies.company.Company;
import com.xworkz.methodOverriding.companies.tcs.Tcs;

public class TcsRunner {
    public static void main(String[] args) {
        Company company = new Company();
        company.hire();
        company.train();
        company.developProduct();
        company.market();
        company.generateRevenue();

        Company company1 = new Tcs();
        company1.hire();
        company1.train();
        company1.developProduct();
        company1.market();
        company1.generateRevenue();

        Tcs tech = new Tcs();
        tech.hire();
        tech.train();
        tech.developProduct();
        tech.market();
        tech.generateRevenue();
    }
}
