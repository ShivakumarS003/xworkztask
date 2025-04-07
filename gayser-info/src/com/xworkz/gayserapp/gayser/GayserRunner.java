package com.xworkz.gayserapp.gayser;

public class GayserRunner {
    public static void main(String[] args) {

        Gayser gayser1 = new Gayser();
        gayser1.setGayserId(1);
        gayser1.setBrand("Bajaj");
        gayser1.setColor("White");
        gayser1.setCapacityInLiters(15);
        gayser1.setPrice(4500.00);
        gayser1.setIsAutomatic(true);
        gayser1.setMountingType("Vertical");

        int id1 = gayser1.getGayserId();
        String brand1 = gayser1.getBrand();
        String color1 = gayser1.getColor();
        int capacity1 = gayser1.getCapacityInLiters();
        double price1 = gayser1.getPrice();
        boolean auto1 = gayser1.getIsAutomatic();
        String mount1 = gayser1.getMountingType();

        System.out.println("Gayser1 ID is: " + id1);
        System.out.println("Brand of gayser1 is: " + brand1);
        System.out.println("Color of gayser1 is: " + color1);
        System.out.println("Capacity of gayser1 is: " + capacity1 + " Liters");
        System.out.println("Price of gayser1 is: ₹" + price1);
        System.out.println("Is gayser1 automatic? " + auto1);
        System.out.println("Mounting type of gayser1 is: " + mount1);
        System.out.println("---------------------------------------------------");

        Gayser gayser2 = new Gayser();
        gayser2.setGayserId(2);
        gayser2.setBrand("AO Smith");
        gayser2.setColor("Grey");
        gayser2.setCapacityInLiters(10);
        gayser2.setPrice(5200.00);
        gayser2.setIsAutomatic(true);
        gayser2.setMountingType("Horizontal");

        int id2 = gayser2.getGayserId();
        String brand2 = gayser2.getBrand();
        String color2 = gayser2.getColor();
        int capacity2 = gayser2.getCapacityInLiters();
        double price2 = gayser2.getPrice();
        boolean auto2 = gayser2.getIsAutomatic();
        String mount2 = gayser2.getMountingType();

        System.out.println("Gayser2 ID is: " + id2);
        System.out.println("Brand of gayser2 is: " + brand2);
        System.out.println("Color of gayser2 is: " + color2);
        System.out.println("Capacity of gayser2 is: " + capacity2 + " Liters");
        System.out.println("Price of gayser2 is: ₹" + price2);
        System.out.println("Is gayser2 automatic? " + auto2);
        System.out.println("Mounting type of gayser2 is: " + mount2);
        System.out.println("---------------------------------------------------");

        Gayser gayser3 = new Gayser();
        gayser3.setGayserId(3);
        gayser3.setBrand("Havells");
        gayser3.setColor("Ivory");
        gayser3.setCapacityInLiters(25);
        gayser3.setPrice(6800.00);
        gayser3.setIsAutomatic(false);
        gayser3.setMountingType("Vertical");

        int id3 = gayser3.getGayserId();
        String brand3 = gayser3.getBrand();
        String color3 = gayser3.getColor();
        int capacity3 = gayser3.getCapacityInLiters();
        double price3 = gayser3.getPrice();
        boolean auto3 = gayser3.getIsAutomatic();
        String mount3 = gayser3.getMountingType();

        System.out.println("Gayser3 ID is: " + id3);
        System.out.println("Brand of gayser3 is: " + brand3);
        System.out.println("Color of gayser3 is: " + color3);
        System.out.println("Capacity of gayser3 is: " + capacity3 + " Liters");
        System.out.println("Price of gayser3 is: ₹" + price3);
        System.out.println("Is gayser3 automatic? " + auto3);
        System.out.println("Mounting type of gayser3 is: " + mount3);
        System.out.println("---------------------------------------------------");

        Gayser gayser4 = new Gayser();
        gayser4.setGayserId(4);
        gayser4.setBrand("Racold");
        gayser4.setColor("Silver");
        gayser4.setCapacityInLiters(20);
        gayser4.setPrice(5900.00);
        gayser4.setIsAutomatic(true);
        gayser4.setMountingType("Horizontal");

        int id4 = gayser4.getGayserId();
        String brand4 = gayser4.getBrand();
        String color4 = gayser4.getColor();
        int capacity4 = gayser4.getCapacityInLiters();
        double price4 = gayser4.getPrice();
        boolean auto4 = gayser4.getIsAutomatic();
        String mount4 = gayser4.getMountingType();

        System.out.println("Gayser4 ID is: " + id4);
        System.out.println("Brand of gayser4 is: " + brand4);
        System.out.println("Color of gayser4 is: " + color4);
        System.out.println("Capacity of gayser4 is: " + capacity4 + " Liters");
        System.out.println("Price of gayser4 is: ₹" + price4);
        System.out.println("Is gayser4 automatic? " + auto4);
        System.out.println("Mounting type of gayser4 is: " + mount4);
        System.out.println("---------------------------------------------------");

        Gayser gayser5 = new Gayser();
        gayser5.setGayserId(5);
        gayser5.setBrand("Usha");
        gayser5.setColor("Black");
        gayser5.setCapacityInLiters(30);
        gayser5.setPrice(7300.00);
        gayser5.setIsAutomatic(false);
        gayser5.setMountingType("Vertical");

        int id5 = gayser5.getGayserId();
        String brand5 = gayser5.getBrand();
        String color5 = gayser5.getColor();
        int capacity5 = gayser5.getCapacityInLiters();
        double price5 = gayser5.getPrice();
        boolean auto5 = gayser5.getIsAutomatic();
        String mount5 = gayser5.getMountingType();

        System.out.println("Gayser5 ID is: " + id5);
        System.out.println("Brand of gayser5 is: " + brand5);
        System.out.println("Color of gayser5 is: " + color5);
        System.out.println("Capacity of gayser5 is: " + capacity5 + " Liters");
        System.out.println("Price of gayser5 is: ₹" + price5);
        System.out.println("Is gayser5 automatic? " + auto5);
        System.out.println("Mounting type of gayser5 is: " + mount5);
        System.out.println("---------------------------------------------------");
    }
}
