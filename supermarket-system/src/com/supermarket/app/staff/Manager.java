package com.supermarket.app.staff;

public class Manager {
    public String name;
    public int age;
    public int experience;

    public void managerDetails() {
        System.out.println("\nManager Details:");
        System.out.println("Manager Name: " + this.name);
        System.out.println("Age: " + this.age + " Years");
        System.out.println("Experience: " + this.experience + " Years");
    }
}
