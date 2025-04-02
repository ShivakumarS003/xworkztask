package com.supermarket.app.market;

public class Ingredient {
    public String name;
    public String quantity;
    public String source;

    public void ingredientDetails() {
        System.out.println("\nIngredient Details:");
        System.out.println("Ingredient Name: " + this.name);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Source: " + this.source);
    }
}
