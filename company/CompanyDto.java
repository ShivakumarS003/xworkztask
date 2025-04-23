package com.xworkz.toString.company;

public class CompanyDto {
    private String name;
    private String industry;
    private int establishedYear;
    private String founder;
    private int employeesCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public int getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
    }

    @Override
    public String toString() {
        return "CompanyDto :-" +
                "\nName = " + this.name +
                "\nIndustry = " + this.industry +
                "\nEstablished Year = " + this.establishedYear +
                "\nFounder = " + this.founder +
                "\nEmployees Count = " + this.employeesCount;
    }
}
