package com.supermarket.app.staff;

public class Cashier {
    public String name;
    public int age;
    public int experience;

    public void cashierDetails() {
        System.out.println("\nCashier Details:");
        System.out.println("Cashier Name: " + this.name);
        System.out.println("Age: " + this.age + " Years");
        System.out.println("Experience: " + this.experience + " Years");
    }
}
