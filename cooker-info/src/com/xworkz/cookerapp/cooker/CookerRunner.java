package com.xworkz.cookerapp.cooker;

public class CookerRunner {
    public static void main(String[] args) {

        Cooker cooker1 = new Cooker();
        cooker1.setCookerId(1);
        cooker1.setBrand("Prestige");
        cooker1.setCapacityInLiters(3.0);
        cooker1.setColor("Silver");
        cooker1.setPrice(1850.00);
        cooker1.setIsInductionCompatible(true);
        cooker1.setMaterial("Aluminium");

        int id1 = cooker1.getCookerId();
        String brand1 = cooker1.getBrand();
        double capacity1 = cooker1.getCapacityInLiters();
        String color1 = cooker1.getColor();
        double price1 = cooker1.getPrice();
        boolean induction1 = cooker1.getIsInductionCompatible();
        String material1 = cooker1.getMaterial();

        System.out.println("Cooker1 ID is: " + id1);
        System.out.println("Brand of cooker1 is: " + brand1);
        System.out.println("Capacity of cooker1 is: " + capacity1 + " Liters");
        System.out.println("Color of cooker1 is: " + color1);
        System.out.println("Price of cooker1 is: ₹" + price1);
        System.out.println("Is cooker1 induction compatible? " + induction1);
        System.out.println("Material of cooker1 is: " + material1);
        System.out.println("---------------------------------------------------");

        Cooker cooker2 = new Cooker();
        cooker2.setCookerId(2);
        cooker2.setBrand("Butterfly");
        cooker2.setCapacityInLiters(5.0);
        cooker2.setColor("Black");
        cooker2.setPrice(2200.00);
        cooker2.setIsInductionCompatible(false);
        cooker2.setMaterial("Stainless Steel");

        int id2 = cooker2.getCookerId();
        String brand2 = cooker2.getBrand();
        double capacity2 = cooker2.getCapacityInLiters();
        String color2 = cooker2.getColor();
        double price2 = cooker2.getPrice();
        boolean induction2 = cooker2.getIsInductionCompatible();
        String material2 = cooker2.getMaterial();

        System.out.println("Cooker2 ID is: " + id2);
        System.out.println("Brand of cooker2 is: " + brand2);
        System.out.println("Capacity of cooker2 is: " + capacity2 + " Liters");
        System.out.println("Color of cooker2 is: " + color2);
        System.out.println("Price of cooker2 is: ₹" + price2);
        System.out.println("Is cooker2 induction compatible? " + induction2);
        System.out.println("Material of cooker2 is: " + material2);
        System.out.println("---------------------------------------------------");

        Cooker cooker3 = new Cooker();
        cooker3.setCookerId(3);
        cooker3.setBrand("Hawkins");
        cooker3.setCapacityInLiters(6.5);
        cooker3.setColor("Red");
        cooker3.setPrice(2750.00);
        cooker3.setIsInductionCompatible(true);
        cooker3.setMaterial("Hard Anodized");

        int id3 = cooker3.getCookerId();
        String brand3 = cooker3.getBrand();
        double capacity3 = cooker3.getCapacityInLiters();
        String color3 = cooker3.getColor();
        double price3 = cooker3.getPrice();
        boolean induction3 = cooker3.getIsInductionCompatible();
        String material3 = cooker3.getMaterial();

        System.out.println("Cooker3 ID is: " + id3);
        System.out.println("Brand of cooker3 is: " + brand3);
        System.out.println("Capacity of cooker3 is: " + capacity3 + " Liters");
        System.out.println("Color of cooker3 is: " + color3);
        System.out.println("Price of cooker3 is: ₹" + price3);
        System.out.println("Is cooker3 induction compatible? " + induction3);
        System.out.println("Material of cooker3 is: " + material3);
        System.out.println("---------------------------------------------------");

        Cooker cooker4 = new Cooker();
        cooker4.setCookerId(4);
        cooker4.setBrand("Pigeon");
        cooker4.setCapacityInLiters(4.0);
        cooker4.setColor("Grey");
        cooker4.setPrice(1950.00);
        cooker4.setIsInductionCompatible(false);
        cooker4.setMaterial("Aluminium");

        int id4 = cooker4.getCookerId();
        String brand4 = cooker4.getBrand();
        double capacity4 = cooker4.getCapacityInLiters();
        String color4 = cooker4.getColor();
        double price4 = cooker4.getPrice();
        boolean induction4 = cooker4.getIsInductionCompatible();
        String material4 = cooker4.getMaterial();

        System.out.println("Cooker4 ID is: " + id4);
        System.out.println("Brand of cooker4 is: " + brand4);
        System.out.println("Capacity of cooker4 is: " + capacity4 + " Liters");
        System.out.println("Color of cooker4 is: " + color4);
        System.out.println("Price of cooker4 is: ₹" + price4);
        System.out.println("Is cooker4 induction compatible? " + induction4);
        System.out.println("Material of cooker4 is: " + material4);
        System.out.println("---------------------------------------------------");

        Cooker cooker5 = new Cooker();
        cooker5.setCookerId(5);
        cooker5.setBrand("Vinod");
        cooker5.setCapacityInLiters(2.5);
        cooker5.setColor("Blue");
        cooker5.setPrice(1650.00);
        cooker5.setIsInductionCompatible(true);
        cooker5.setMaterial("Stainless Steel");

        int id5 = cooker5.getCookerId();
        String brand5 = cooker5.getBrand();
        double capacity5 = cooker5.getCapacityInLiters();
        String color5 = cooker5.getColor();
        double price5 = cooker5.getPrice();
        boolean induction5 = cooker5.getIsInductionCompatible();
        String material5 = cooker5.getMaterial();

        System.out.println("Cooker5 ID is: " + id5);
        System.out.println("Brand of cooker5 is: " + brand5);
        System.out.println("Capacity of cooker5 is: " + capacity5 + " Liters");
        System.out.println("Color of cooker5 is: " + color5);
        System.out.println("Price of cooker5 is: ₹" + price5);
        System.out.println("Is cooker5 induction compatible? " + induction5);
        System.out.println("Material of cooker5 is: " + material5);
        System.out.println("---------------------------------------------------");
    }
}
