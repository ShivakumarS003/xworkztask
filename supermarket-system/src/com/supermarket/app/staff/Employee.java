package com.supermarket.app.staff;

public class Employee {
    public String name;
    public int age;
    public String role;

    public void employeeDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee Name: " + this.name);
        System.out.println("Age: " + this.age + " Years");
        System.out.println("Role: " + this.role);
    }
}
