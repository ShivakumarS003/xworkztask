package com.xworkz.mattressapp.mattress;

public class MattressRunner {
    public static void main(String[] args) {

        Mattress mattress1 = new Mattress();
        mattress1.setMattressId(1);
        mattress1.setBrand("Sleepwell");
        mattress1.setType("Memory Foam");
        mattress1.setSize("Queen");
        mattress1.setThickness(6.0);
        mattress1.setMaterial("Foam");
        mattress1.setPrice(12000.00);

        int id1 = mattress1.getMattressId();
        String brand1 = mattress1.getBrand();
        String type1 = mattress1.getType();
        String size1 = mattress1.getSize();
        double thickness1 = mattress1.getThickness();
        String material1 = mattress1.getMaterial();
        double price1 = mattress1.getPrice();

        System.out.println("Mattress1 ID is: " + id1);
        System.out.println("Mattress1 Brand is: " + brand1);
        System.out.println("Mattress1 Type is: " + type1);
        System.out.println("Mattress1 Size is: " + size1);
        System.out.println("Mattress1 Thickness is: " + thickness1 + " inches");
        System.out.println("Mattress1 Material is: " + material1);
        System.out.println("Mattress1 Price is: ₹" + price1);
        System.out.println("------------------------------------------------");

        Mattress mattress2 = new Mattress();
        mattress2.setMattressId(2);
        mattress2.setBrand("Kurlon");
        mattress2.setType("Spring");
        mattress2.setSize("King");
        mattress2.setThickness(8.0);
        mattress2.setMaterial("Spring & Foam");
        mattress2.setPrice(18000.00);

        int id2 = mattress2.getMattressId();
        String brand2 = mattress2.getBrand();
        String type2 = mattress2.getType();
        String size2 = mattress2.getSize();
        double thickness2 = mattress2.getThickness();
        String material2 = mattress2.getMaterial();
        double price2 = mattress2.getPrice();

        System.out.println("Mattress2 ID is: " + id2);
        System.out.println("Mattress2 Brand is: " + brand2);
        System.out.println("Mattress2 Type is: " + type2);
        System.out.println("Mattress2 Size is: " + size2);
        System.out.println("Mattress2 Thickness is: " + thickness2 + " inches");
        System.out.println("Mattress2 Material is: " + material2);
        System.out.println("Mattress2 Price is: ₹" + price2);
        System.out.println("------------------------------------------------");

        Mattress mattress3 = new Mattress();
        mattress3.setMattressId(3);
        mattress3.setBrand("Duroflex");
        mattress3.setType("Orthopedic");
        mattress3.setSize("Double");
        mattress3.setThickness(6.5);
        mattress3.setMaterial("Foam");
        mattress3.setPrice(14500.00);

        int id3 = mattress3.getMattressId();
        String brand3 = mattress3.getBrand();
        String type3 = mattress3.getType();
        String size3 = mattress3.getSize();
        double thickness3 = mattress3.getThickness();
        String material3 = mattress3.getMaterial();
        double price3 = mattress3.getPrice();

        System.out.println("Mattress3 ID is: " + id3);
        System.out.println("Mattress3 Brand is: " + brand3);
        System.out.println("Mattress3 Type is: " + type3);
        System.out.println("Mattress3 Size is: " + size3);
        System.out.println("Mattress3 Thickness is: " + thickness3 + " inches");
        System.out.println("Mattress3 Material is: " + material3);
        System.out.println("Mattress3 Price is: ₹" + price3);
        System.out.println("------------------------------------------------");

        Mattress mattress4 = new Mattress();
        mattress4.setMattressId(4);
        mattress4.setBrand("Wakefit");
        mattress4.setType("Foam");
        mattress4.setSize("Single");
        mattress4.setThickness(5.0);
        mattress4.setMaterial("Memory Foam");
        mattress4.setPrice(9500.00);

        int id4 = mattress4.getMattressId();
        String brand4 = mattress4.getBrand();
        String type4 = mattress4.getType();
        String size4 = mattress4.getSize();
        double thickness4 = mattress4.getThickness();
        String material4 = mattress4.getMaterial();
        double price4 = mattress4.getPrice();

        System.out.println("Mattress4 ID is: " + id4);
        System.out.println("Mattress4 Brand is: " + brand4);
        System.out.println("Mattress4 Type is: " + type4);
        System.out.println("Mattress4 Size is: " + size4);
        System.out.println("Mattress4 Thickness is: " + thickness4 + " inches");
        System.out.println("Mattress4 Material is: " + material4);
        System.out.println("Mattress4 Price is: ₹" + price4);
        System.out.println("------------------------------------------------");

        Mattress mattress5 = new Mattress();
        mattress5.setMattressId(5);
        mattress5.setBrand("Peps");
        mattress5.setType("Latex");
        mattress5.setSize("Queen");
        mattress5.setThickness(7.0);
        mattress5.setMaterial("Latex Foam");
        mattress5.setPrice(17000.00);

        int id5 = mattress5.getMattressId();
        String brand5 = mattress5.getBrand();
        String type5 = mattress5.getType();
        String size5 = mattress5.getSize();
        double thickness5 = mattress5.getThickness();
        String material5 = mattress5.getMaterial();
        double price5 = mattress5.getPrice();

        System.out.println("Mattress5 ID is: " + id5);
        System.out.println("Mattress5 Brand is: " + brand5);
        System.out.println("Mattress5 Type is: " + type5);
        System.out.println("Mattress5 Size is: " + size5);
        System.out.println("Mattress5 Thickness is: " + thickness5 + " inches");
        System.out.println("Mattress5 Material is: " + material5);
        System.out.println("Mattress5 Price is: ₹" + price5);
        System.out.println("------------------------------------------------");
    }
}
