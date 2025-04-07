package com.xworkz.ladderapp.ladder;

public class LadderRunner {
    public static void main(String[] args) {

        Ladder ladder1 = new Ladder();
        ladder1.setLadderId(1);
        ladder1.setBrand("Alco");
        ladder1.setMaterial("Aluminum");
        ladder1.setSteps(5);
        ladder1.setHeight(5.5);
        ladder1.setColor("Silver");
        ladder1.setPrice(1200.00);

        int ladder1Id = ladder1.getLadderId();
        String brand1 = ladder1.getBrand();
        String material1 = ladder1.getMaterial();
        int steps1 = ladder1.getSteps();
        double height1 = ladder1.getHeight();
        String color1 = ladder1.getColor();
        double price1 = ladder1.getPrice();

        System.out.println("Ladder1 Id is: " + ladder1Id);
        System.out.println("Ladder1 Brand is: " + brand1);
        System.out.println("Ladder1 Material is: " + material1);
        System.out.println("Ladder1 has " + steps1 + " steps");
        System.out.println("Ladder1 Height is: " + height1 + " ft");
        System.out.println("Ladder1 Color is: " + color1);
        System.out.println("Ladder1 Price is: ₹" + price1);
        System.out.println("-----------------------------------------------------");

        Ladder ladder2 = new Ladder();
        ladder2.setLadderId(2);
        ladder2.setBrand("StepMax");
        ladder2.setMaterial("Steel");
        ladder2.setSteps(7);
        ladder2.setHeight(6.5);
        ladder2.setColor("Black");
        ladder2.setPrice(1500.00);

        int ladder2Id = ladder2.getLadderId();
        String brand2 = ladder2.getBrand();
        String material2 = ladder2.getMaterial();
        int steps2 = ladder2.getSteps();
        double height2 = ladder2.getHeight();
        String color2 = ladder2.getColor();
        double price2 = ladder2.getPrice();

        System.out.println("Ladder2 Id is: " + ladder2Id);
        System.out.println("Ladder2 Brand is: " + brand2);
        System.out.println("Ladder2 Material is: " + material2);
        System.out.println("Ladder2 has " + steps2 + " steps");
        System.out.println("Ladder2 Height is: " + height2 + " ft");
        System.out.println("Ladder2 Color is: " + color2);
        System.out.println("Ladder2 Price is: ₹" + price2);
        System.out.println("-----------------------------------------------------");

        Ladder ladder3 = new Ladder();
        ladder3.setLadderId(3);
        ladder3.setBrand("TopReach");
        ladder3.setMaterial("Fiber");
        ladder3.setSteps(4);
        ladder3.setHeight(4.5);
        ladder3.setColor("Blue");
        ladder3.setPrice(1000.00);

        int ladder3Id = ladder3.getLadderId();
        String brand3 = ladder3.getBrand();
        String material3 = ladder3.getMaterial();
        int steps3 = ladder3.getSteps();
        double height3 = ladder3.getHeight();
        String color3 = ladder3.getColor();
        double price3 = ladder3.getPrice();

        System.out.println("Ladder3 Id is: " + ladder3Id);
        System.out.println("Ladder3 Brand is: " + brand3);
        System.out.println("Ladder3 Material is: " + material3);
        System.out.println("Ladder3 has " + steps3 + " steps");
        System.out.println("Ladder3 Height is: " + height3 + " ft");
        System.out.println("Ladder3 Color is: " + color3);
        System.out.println("Ladder3 Price is: ₹" + price3);
        System.out.println("-----------------------------------------------------");

        Ladder ladder4 = new Ladder();
        ladder4.setLadderId(4);
        ladder4.setBrand("SafeClimb");
        ladder4.setMaterial("Plastic");
        ladder4.setSteps(3);
        ladder4.setHeight(3.0);
        ladder4.setColor("Red");
        ladder4.setPrice(800.00);

        int ladder4Id = ladder4.getLadderId();
        String brand4 = ladder4.getBrand();
        String material4 = ladder4.getMaterial();
        int steps4 = ladder4.getSteps();
        double height4 = ladder4.getHeight();
        String color4 = ladder4.getColor();
        double price4 = ladder4.getPrice();

        System.out.println("Ladder4 Id is: " + ladder4Id);
        System.out.println("Ladder4 Brand is: " + brand4);
        System.out.println("Ladder4 Material is: " + material4);
        System.out.println("Ladder4 has " + steps4 + " steps");
        System.out.println("Ladder4 Height is: " + height4 + " ft");
        System.out.println("Ladder4 Color is: " + color4);
        System.out.println("Ladder4 Price is: ₹" + price4);
        System.out.println("-----------------------------------------------------");

        Ladder ladder5 = new Ladder();
        ladder5.setLadderId(5);
        ladder5.setBrand("StrongStep");
        ladder5.setMaterial("Aluminum");
        ladder5.setSteps(6);
        ladder5.setHeight(6.0);
        ladder5.setColor("Grey");
        ladder5.setPrice(1350.00);

        int ladder5Id = ladder5.getLadderId();
        String brand5 = ladder5.getBrand();
        String material5 = ladder5.getMaterial();
        int steps5 = ladder5.getSteps();
        double height5 = ladder5.getHeight();
        String color5 = ladder5.getColor();
        double price5 = ladder5.getPrice();

        System.out.println("Ladder5 Id is: " + ladder5Id);
        System.out.println("Ladder5 Brand is: " + brand5);
        System.out.println("Ladder5 Material is: " + material5);
        System.out.println("Ladder5 has " + steps5 + " steps");
        System.out.println("Ladder5 Height is: " + height5 + " ft");
        System.out.println("Ladder5 Color is: " + color5);
        System.out.println("Ladder5 Price is: ₹" + price5);
        System.out.println("-----------------------------------------------------");
    }
}
