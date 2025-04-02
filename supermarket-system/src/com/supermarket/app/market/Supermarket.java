package com.supermarket.app.market;

public class Supermarket {
    public String name;
    public String location;
    public String owner;

    public void supermarketDetails() {
        System.out.println("\nSupermarket Details:");
        System.out.println("Supermarket Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Owner: " + this.owner);
    }
}
