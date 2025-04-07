package com.xworkz.shirtapp.shirt;

public class ShirtRunner {
    public static void main(String[] args) {

        Shirt shirt1 = new Shirt();
        shirt1.setShirtId(1);
        shirt1.setBrand("Peter England");
        shirt1.setSize("M");
        shirt1.setColor("White");
        shirt1.setPrice(999.99);
        shirt1.setFabric("Cotton");
        shirt1.setSleeve("Full");

        int shirtId1 = shirt1.getShirtId();
        String brand1 = shirt1.getBrand();
        String size1 = shirt1.getSize();
        String color1 = shirt1.getColor();
        double price1 = shirt1.getPrice();
        String fabric1 = shirt1.getFabric();
        String sleeve1 = shirt1.getSleeve();

        System.out.println("Shirt1 Id is: " + shirtId1);
        System.out.println("Shirt1 Brand is: " + brand1);
        System.out.println("Shirt1 Size is: " + size1);
        System.out.println("Shirt1 Color is: " + color1);
        System.out.println("Shirt1 Price is: " + price1);
        System.out.println("Shirt1 Fabric is: " + fabric1);
        System.out.println("Shirt1 Sleeve is: " + sleeve1);
        System.out.println("--------------------------------------------");

        Shirt shirt2 = new Shirt();
        shirt2.setShirtId(2);
        shirt2.setBrand("Arrow");
        shirt2.setSize("L");
        shirt2.setColor("Blue");
        shirt2.setPrice(1299.00);
        shirt2.setFabric("Linen");
        shirt2.setSleeve("Half");

        int shirtId2 = shirt2.getShirtId();
        String brand2 = shirt2.getBrand();
        String size2 = shirt2.getSize();
        String color2 = shirt2.getColor();
        double price2 = shirt2.getPrice();
        String fabric2 = shirt2.getFabric();
        String sleeve2 = shirt2.getSleeve();

        System.out.println("Shirt2 Id is: " + shirtId2);
        System.out.println("Shirt2 Brand is: " + brand2);
        System.out.println("Shirt2 Size is: " + size2);
        System.out.println("Shirt2 Color is: " + color2);
        System.out.println("Shirt2 Price is: " + price2);
        System.out.println("Shirt2 Fabric is: " + fabric2);
        System.out.println("Shirt2 Sleeve is: " + sleeve2);
        System.out.println("--------------------------------------------");

        Shirt shirt3 = new Shirt();
        shirt3.setShirtId(3);
        shirt3.setBrand("Van Heusen");
        shirt3.setSize("XL");
        shirt3.setColor("Black");
        shirt3.setPrice(1599.50);
        shirt3.setFabric("Silk");
        shirt3.setSleeve("Full");

        int shirtId3 = shirt3.getShirtId();
        String brand3 = shirt3.getBrand();
        String size3 = shirt3.getSize();
        String color3 = shirt3.getColor();
        double price3 = shirt3.getPrice();
        String fabric3 = shirt3.getFabric();
        String sleeve3 = shirt3.getSleeve();

        System.out.println("Shirt3 Id is: " + shirtId3);
        System.out.println("Shirt3 Brand is: " + brand3);
        System.out.println("Shirt3 Size is: " + size3);
        System.out.println("Shirt3 Color is: " + color3);
        System.out.println("Shirt3 Price is: " + price3);
        System.out.println("Shirt3 Fabric is: " + fabric3);
        System.out.println("Shirt3 Sleeve is: " + sleeve3);
        System.out.println("--------------------------------------------");

        Shirt shirt4 = new Shirt();
        shirt4.setShirtId(4);
        shirt4.setBrand("Levis");
        shirt4.setSize("S");
        shirt4.setColor("Gray");
        shirt4.setPrice(899.00);
        shirt4.setFabric("Polyester");
        shirt4.setSleeve("Half");

        int shirtId4 = shirt4.getShirtId();
        String brand4 = shirt4.getBrand();
        String size4 = shirt4.getSize();
        String color4 = shirt4.getColor();
        double price4 = shirt4.getPrice();
        String fabric4 = shirt4.getFabric();
        String sleeve4 = shirt4.getSleeve();

        System.out.println("Shirt4 Id is: " + shirtId4);
        System.out.println("Shirt4 Brand is: " + brand4);
        System.out.println("Shirt4 Size is: " + size4);
        System.out.println("Shirt4 Color is: " + color4);
        System.out.println("Shirt4 Price is: " + price4);
        System.out.println("Shirt4 Fabric is: " + fabric4);
        System.out.println("Shirt4 Sleeve is: " + sleeve4);
        System.out.println("--------------------------------------------");

        Shirt shirt5 = new Shirt();
        shirt5.setShirtId(5);
        shirt5.setBrand("Zara");
        shirt5.setSize("M");
        shirt5.setColor("Green");
        shirt5.setPrice(1099.00);
        shirt5.setFabric("Cotton Blend");
        shirt5.setSleeve("Full");

        int shirtId5 = shirt5.getShirtId();
        String brand5 = shirt5.getBrand();
        String size5 = shirt5.getSize();
        String color5 = shirt5.getColor();
        double price5 = shirt5.getPrice();
        String fabric5 = shirt5.getFabric();
        String sleeve5 = shirt5.getSleeve();

        System.out.println("Shirt5 Id is: " + shirtId5);
        System.out.println("Shirt5 Brand is: " + brand5);
        System.out.println("Shirt5 Size is: " + size5);
        System.out.println("Shirt5 Color is: " + color5);
        System.out.println("Shirt5 Price is: " + price5);
        System.out.println("Shirt5 Fabric is: " + fabric5);
        System.out.println("Shirt5 Sleeve is: " + sleeve5);
        System.out.println("--------------------------------------------");
    }
}
