package com.xworkz.bricksapp.runner;

import com.xworkz.bricksapp.bricks.Bricks;

public class BricksRunner {
    public static void main(String[] args) {

        Bricks bricks1 = new Bricks();
        bricks1.setBricksId(1);
        bricks1.setType("Clay");
        bricks1.setColor("Red");
        bricks1.setSize("9x4x3 inch");
        bricks1.setWeight(2.5);
        bricks1.setQuantity(500);
        bricks1.setPrice(3500.0);

        int bricksId1 = bricks1.getBricksId();
        String type1 = bricks1.getType();
        String color1 = bricks1.getColor();
        String size1 = bricks1.getSize();
        double weight1 = bricks1.getWeight();
        int quantity1 = bricks1.getQuantity();
        double price1 = bricks1.getPrice();

        System.out.println("Bricks1 ID is: " + bricksId1);
        System.out.println("Type of bricks1 is: " + type1);
        System.out.println("Color of bricks1 is: " + color1);
        System.out.println("Size of bricks1 is: " + size1);
        System.out.println("Weight of bricks1 is: " + weight1 + " kg");
        System.out.println("Quantity of bricks1 is: " + quantity1);
        System.out.println("Price of bricks1 is: ₹" + price1);
        System.out.println("---------------------------------------------------");

        Bricks bricks2 = new Bricks();
        bricks2.setBricksId(2);
        bricks2.setType("Fly Ash");
        bricks2.setColor("Grey");
        bricks2.setSize("8x4x4 inch");
        bricks2.setWeight(2.2);
        bricks2.setQuantity(300);
        bricks2.setPrice(2100.0);

        int bricksId2 = bricks2.getBricksId();
        String type2 = bricks2.getType();
        String color2 = bricks2.getColor();
        String size2 = bricks2.getSize();
        double weight2 = bricks2.getWeight();
        int quantity2 = bricks2.getQuantity();
        double price2 = bricks2.getPrice();

        System.out.println("Bricks2 ID is: " + bricksId2);
        System.out.println("Type of bricks2 is: " + type2);
        System.out.println("Color of bricks2 is: " + color2);
        System.out.println("Size of bricks2 is: " + size2);
        System.out.println("Weight of bricks2 is: " + weight2 + " kg");
        System.out.println("Quantity of bricks2 is: " + quantity2);
        System.out.println("Price of bricks2 is: ₹" + price2);
        System.out.println("---------------------------------------------------");

        Bricks bricks3 = new Bricks();
        bricks3.setBricksId(3);
        bricks3.setType("Concrete");
        bricks3.setColor("White");
        bricks3.setSize("12x6x4 inch");
        bricks3.setWeight(3.0);
        bricks3.setQuantity(400);
        bricks3.setPrice(4800.0);

        int bricksId3 = bricks3.getBricksId();
        String type3 = bricks3.getType();
        String color3 = bricks3.getColor();
        String size3 = bricks3.getSize();
        double weight3 = bricks3.getWeight();
        int quantity3 = bricks3.getQuantity();
        double price3 = bricks3.getPrice();

        System.out.println("Bricks3 ID is: " + bricksId3);
        System.out.println("Type of bricks3 is: " + type3);
        System.out.println("Color of bricks3 is: " + color3);
        System.out.println("Size of bricks3 is: " + size3);
        System.out.println("Weight of bricks3 is: " + weight3 + " kg");
        System.out.println("Quantity of bricks3 is: " + quantity3);
        System.out.println("Price of bricks3 is: ₹" + price3);
        System.out.println("---------------------------------------------------");

        Bricks bricks4 = new Bricks();
        bricks4.setBricksId(4);
        bricks4.setType("Engineering");
        bricks4.setColor("Dark Red");
        bricks4.setSize("10x5x3 inch");
        bricks4.setWeight(2.8);
        bricks4.setQuantity(350);
        bricks4.setPrice(3900.0);

        int bricksId4 = bricks4.getBricksId();
        String type4 = bricks4.getType();
        String color4 = bricks4.getColor();
        String size4 = bricks4.getSize();
        double weight4 = bricks4.getWeight();
        int quantity4 = bricks4.getQuantity();
        double price4 = bricks4.getPrice();

        System.out.println("Bricks4 ID is: " + bricksId4);
        System.out.println("Type of bricks4 is: " + type4);
        System.out.println("Color of bricks4 is: " + color4);
        System.out.println("Size of bricks4 is: " + size4);
        System.out.println("Weight of bricks4 is: " + weight4 + " kg");
        System.out.println("Quantity of bricks4 is: " + quantity4);
        System.out.println("Price of bricks4 is: ₹" + price4);
        System.out.println("---------------------------------------------------");

        Bricks bricks5 = new Bricks();
        bricks5.setBricksId(5);
        bricks5.setType("Eco Bricks");
        bricks5.setColor("Brown");
        bricks5.setSize("9x5x3 inch");
        bricks5.setWeight(2.3);
        bricks5.setQuantity(450);
        bricks5.setPrice(3400.0);

        int bricksId5 = bricks5.getBricksId();
        String type5 = bricks5.getType();
        String color5 = bricks5.getColor();
        String size5 = bricks5.getSize();
        double weight5 = bricks5.getWeight();
        int quantity5 = bricks5.getQuantity();
        double price5 = bricks5.getPrice();

        System.out.println("Bricks5 ID is: " + bricksId5);
        System.out.println("Type of bricks5 is: " + type5);
        System.out.println("Color of bricks5 is: " + color5);
        System.out.println("Size of bricks5 is: " + size5);
        System.out.println("Weight of bricks5 is: " + weight5 + " kg");
        System.out.println("Quantity of bricks5 is: " + quantity5);
        System.out.println("Price of bricks5 is: ₹" + price5);
        System.out.println("---------------------------------------------------");
    }
}
