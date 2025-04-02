package com.supermarket.app;

import com.supermarket.app.market.*;
import com.supermarket.app.staff.*;

public class SupermarketRunner {

    public static void main(String[] args) {
        System.out.println("Supermarket Management System Started\n");

        // Supermarket Details
        Supermarket supermarket = new Supermarket();
        supermarket.name = "Reliance Fresh";
        supermarket.location = "Mumbai";
        supermarket.owner = "Mukesh Ambani";
        supermarket.supermarketDetails();

        // Manager Details
        Manager manager = new Manager();
        manager.name = "Rajesh Kumar";
        manager.age = 45;
        manager.experience = 20;
        manager.managerDetails();

        // Section Details
        Section[] sections = new Section[3];
        System.out.println("\nSupermarket Sections:");

        sections[0] = new Section();
        sections[0].name = "Grocery";
        sections[0].category = "Food Items";

        sections[1] = new Section();
        sections[1].name = "Dairy";
        sections[1].category = "Milk Products";

        sections[2] = new Section();
        sections[2].name = "Bakery";
        sections[2].category = "Breads & Cakes";

        for (Section section : sections) {
            section.sectionDetails();
        }

        // Product Details
        Product product = new Product();
        product.name = "Aashirvaad Atta";
        product.price = 350;
        product.expiryDate = "Dec 2025";
        product.productDetails();

        // Ingredient Details
        Ingredient ingredient = new Ingredient();
        ingredient.name = "Wheat";
        ingredient.quantity = "5 kg";
        ingredient.source = "Punjab";
        ingredient.ingredientDetails();

        // Employee Details
        Employee employee = new Employee();
        employee.name = "Pooja Sharma";
        employee.age = 30;
        employee.role = "Floor Supervisor";
        employee.employeeDetails();

        // Cashier Details
        Cashier cashier = new Cashier();
        cashier.name = "Amit Verma";
        cashier.age = 28;
        cashier.experience = 5;
        cashier.cashierDetails();

        System.out.println("\nSupermarket Management System Ended");
    }
}
