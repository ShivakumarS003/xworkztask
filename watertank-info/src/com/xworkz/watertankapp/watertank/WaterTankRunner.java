package com.xworkz.watertankapp.watertank;

public class WaterTankRunner {
    public static void main(String[] args) {

        WaterTank tank1 = new WaterTank();
        tank1.setTankId(1);
        tank1.setBrand("Sintex");
        tank1.setColor("White");
        tank1.setShape("Cylindrical");
        tank1.setMaterial("Plastic");
        tank1.setCapacity(1000);
        tank1.setPrice(4500.00);

        int tank1Id = tank1.getTankId();
        String brand1 = tank1.getBrand();
        String color1 = tank1.getColor();
        String shape1 = tank1.getShape();
        String material1 = tank1.getMaterial();
        double capacity1 = tank1.getCapacity();
        double price1 = tank1.getPrice();

        System.out.println("WaterTank1 Id is: " + tank1Id);
        System.out.println("WaterTank1 Brand is: " + brand1);
        System.out.println("WaterTank1 Color is: " + color1);
        System.out.println("WaterTank1 Shape is: " + shape1);
        System.out.println("WaterTank1 Material is: " + material1);
        System.out.println("WaterTank1 Capacity is: " + capacity1 + " liters");
        System.out.println("Price of WaterTank1 is: " + price1);
        System.out.println("-----------------------------------------------------");

        WaterTank tank2 = new WaterTank();
        tank2.setTankId(2);
        tank2.setBrand("Vectus");
        tank2.setColor("Black");
        tank2.setShape("Square");
        tank2.setMaterial("HDPE");
        tank2.setCapacity(750);
        tank2.setPrice(3800.00);

        int tank2Id = tank2.getTankId();
        String brand2 = tank2.getBrand();
        String color2 = tank2.getColor();
        String shape2 = tank2.getShape();
        String material2 = tank2.getMaterial();
        double capacity2 = tank2.getCapacity();
        double price2 = tank2.getPrice();

        System.out.println("WaterTank2 Id is: " + tank2Id);
        System.out.println("WaterTank2 Brand is: " + brand2);
        System.out.println("WaterTank2 Color is: " + color2);
        System.out.println("WaterTank2 Shape is: " + shape2);
        System.out.println("WaterTank2 Material is: " + material2);
        System.out.println("WaterTank2 Capacity is: " + capacity2 + " liters");
        System.out.println("Price of WaterTank2 is: " + price2);
        System.out.println("-----------------------------------------------------");

        WaterTank tank3 = new WaterTank();
        tank3.setTankId(3);
        tank3.setBrand("Plasto");
        tank3.setColor("Blue");
        tank3.setShape("Rectangle");
        tank3.setMaterial("PVC");
        tank3.setCapacity(500);
        tank3.setPrice(3200.00);

        int tank3Id = tank3.getTankId();
        String brand3 = tank3.getBrand();
        String color3 = tank3.getColor();
        String shape3 = tank3.getShape();
        String material3 = tank3.getMaterial();
        double capacity3 = tank3.getCapacity();
        double price3 = tank3.getPrice();

        System.out.println("WaterTank3 Id is: " + tank3Id);
        System.out.println("WaterTank3 Brand is: " + brand3);
        System.out.println("WaterTank3 Color is: " + color3);
        System.out.println("WaterTank3 Shape is: " + shape3);
        System.out.println("WaterTank3 Material is: " + material3);
        System.out.println("WaterTank3 Capacity is: " + capacity3 + " liters");
        System.out.println("Price of WaterTank3 is: " + price3);
        System.out.println("-----------------------------------------------------");

        WaterTank tank4 = new WaterTank();
        tank4.setTankId(4);
        tank4.setBrand("Supreme");
        tank4.setColor("Green");
        tank4.setShape("Cylindrical");
        tank4.setMaterial("Polyethylene");
        tank4.setCapacity(1500);
        tank4.setPrice(6000.00);

        int tank4Id = tank4.getTankId();
        String brand4 = tank4.getBrand();
        String color4 = tank4.getColor();
        String shape4 = tank4.getShape();
        String material4 = tank4.getMaterial();
        double capacity4 = tank4.getCapacity();
        double price4 = tank4.getPrice();

        System.out.println("WaterTank4 Id is: " + tank4Id);
        System.out.println("WaterTank4 Brand is: " + brand4);
        System.out.println("WaterTank4 Color is: " + color4);
        System.out.println("WaterTank4 Shape is: " + shape4);
        System.out.println("WaterTank4 Material is: " + material4);
        System.out.println("WaterTank4 Capacity is: " + capacity4 + " liters");
        System.out.println("Price of WaterTank4 is: " + price4);
        System.out.println("-----------------------------------------------------");

        WaterTank tank5 = new WaterTank();
        tank5.setTankId(5);
        tank5.setBrand("Prince");
        tank5.setColor("Ivory");
        tank5.setShape("Oval");
        tank5.setMaterial("LLDPE");
        tank5.setCapacity(2000);
        tank5.setPrice(7500.00);

        int tank5Id = tank5.getTankId();
        String brand5 = tank5.getBrand();
        String color5 = tank5.getColor();
        String shape5 = tank5.getShape();
        String material5 = tank5.getMaterial();
        double capacity5 = tank5.getCapacity();
        double price5 = tank5.getPrice();

        System.out.println("WaterTank5 Id is: " + tank5Id);
        System.out.println("WaterTank5 Brand is: " + brand5);
        System.out.println("WaterTank5 Color is: " + color5);
        System.out.println("WaterTank5 Shape is: " + shape5);
        System.out.println("WaterTank5 Material is: " + material5);
        System.out.println("WaterTank5 Capacity is: " + capacity5 + " liters");
        System.out.println("Price of WaterTank5 is: " + price5);
        System.out.println("-----------------------------------------------------");
    }
}
