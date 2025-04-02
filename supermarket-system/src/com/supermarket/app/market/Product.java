package com.supermarket.app.market;

public class Product {
    public String name;
    public double price;
    public String expiryDate;

    public void productDetails() {
        System.out.println("\nProduct Details:");
        System.out.println("Product Name: " + this.name);
        System.out.println("Price: ₹" + this.price);
        System.out.println("Expiry Date: " + this.expiryDate);
    }
}
