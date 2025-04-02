package com.supermarket.app.market;

public class Section {
    public String name;
    public String category;

    public void sectionDetails() {
        System.out.println("\nSection Details:");
        System.out.println("Section Name: " + this.name);
        System.out.println("Category: " + this.category);
    }
}
