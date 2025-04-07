package com.xworkz.chalkapp.chalk;

public class ChalkRunner {
    public static void main(String[] args) {

        Chalk chalk1 = new Chalk();
        chalk1.setChalkId(1);
        chalk1.setBrand("Camlin");
        chalk1.setColor("White");
        chalk1.setShape("Cylindrical");
        chalk1.setMaterial("Calcium Carbonate");
        chalk1.setDustFree(true);
        chalk1.setPrice(25.00);

        int chalkId1 = chalk1.getChalkId();
        String brand1 = chalk1.getBrand();
        String color1 = chalk1.getColor();
        String shape1 = chalk1.getShape();
        String material1 = chalk1.getMaterial();
        boolean dustFree1 = chalk1.isDustFree();
        double price1 = chalk1.getPrice();

        System.out.println("Chalk1 ID is: " + chalkId1);
        System.out.println("Chalk1 Brand is: " + brand1);
        System.out.println("Chalk1 Color is: " + color1);
        System.out.println("Chalk1 Shape is: " + shape1);
        System.out.println("Chalk1 Material is: " + material1);
        System.out.println("Chalk1 is Dust Free: " + dustFree1);
        System.out.println("Chalk1 Price is: ₹" + price1);
        System.out.println("------------------------------------------------");

        Chalk chalk2 = new Chalk();
        chalk2.setChalkId(2);
        chalk2.setBrand("Apsara");
        chalk2.setColor("Yellow");
        chalk2.setShape("Rectangle");
        chalk2.setMaterial("Gypsum");
        chalk2.setDustFree(false);
        chalk2.setPrice(20.00);

        int chalkId2 = chalk2.getChalkId();
        String brand2 = chalk2.getBrand();
        String color2 = chalk2.getColor();
        String shape2 = chalk2.getShape();
        String material2 = chalk2.getMaterial();
        boolean dustFree2 = chalk2.isDustFree();
        double price2 = chalk2.getPrice();

        System.out.println("Chalk2 ID is: " + chalkId2);
        System.out.println("Chalk2 Brand is: " + brand2);
        System.out.println("Chalk2 Color is: " + color2);
        System.out.println("Chalk2 Shape is: " + shape2);
        System.out.println("Chalk2 Material is: " + material2);
        System.out.println("Chalk2 is Dust Free: " + dustFree2);
        System.out.println("Chalk2 Price is: ₹" + price2);
        System.out.println("------------------------------------------------");

        Chalk chalk3 = new Chalk();
        chalk3.setChalkId(3);
        chalk3.setBrand("Natraj");
        chalk3.setColor("Green");
        chalk3.setShape("Cylindrical");
        chalk3.setMaterial("Natural Chalk");
        chalk3.setDustFree(true);
        chalk3.setPrice(30.00);

        int chalkId3 = chalk3.getChalkId();
        String brand3 = chalk3.getBrand();
        String color3 = chalk3.getColor();
        String shape3 = chalk3.getShape();
        String material3 = chalk3.getMaterial();
        boolean dustFree3 = chalk3.isDustFree();
        double price3 = chalk3.getPrice();

        System.out.println("Chalk3 ID is: " + chalkId3);
        System.out.println("Chalk3 Brand is: " + brand3);
        System.out.println("Chalk3 Color is: " + color3);
        System.out.println("Chalk3 Shape is: " + shape3);
        System.out.println("Chalk3 Material is: " + material3);
        System.out.println("Chalk3 is Dust Free: " + dustFree3);
        System.out.println("Chalk3 Price is: ₹" + price3);
        System.out.println("------------------------------------------------");

        Chalk chalk4 = new Chalk();
        chalk4.setChalkId(4);
        chalk4.setBrand("Faber Castell");
        chalk4.setColor("Blue");
        chalk4.setShape("Round");
        chalk4.setMaterial("Synthetic Chalk");
        chalk4.setDustFree(false);
        chalk4.setPrice(18.00);

        int chalkId4 = chalk4.getChalkId();
        String brand4 = chalk4.getBrand();
        String color4 = chalk4.getColor();
        String shape4 = chalk4.getShape();
        String material4 = chalk4.getMaterial();
        boolean dustFree4 = chalk4.isDustFree();
        double price4 = chalk4.getPrice();

        System.out.println("Chalk4 ID is: " + chalkId4);
        System.out.println("Chalk4 Brand is: " + brand4);
        System.out.println("Chalk4 Color is: " + color4);
        System.out.println("Chalk4 Shape is: " + shape4);
        System.out.println("Chalk4 Material is: " + material4);
        System.out.println("Chalk4 is Dust Free: " + dustFree4);
        System.out.println("Chalk4 Price is: ₹" + price4);
        System.out.println("------------------------------------------------");

        Chalk chalk5 = new Chalk();
        chalk5.setChalkId(5);
        chalk5.setBrand("Classmate");
        chalk5.setColor("Pink");
        chalk5.setShape("Square");
        chalk5.setMaterial("Calcium Sulfate");
        chalk5.setDustFree(true);
        chalk5.setPrice(35.00);

        int chalkId5 = chalk5.getChalkId();
        String brand5 = chalk5.getBrand();
        String color5 = chalk5.getColor();
        String shape5 = chalk5.getShape();
        String material5 = chalk5.getMaterial();
        boolean dustFree5 = chalk5.isDustFree();
        double price5 = chalk5.getPrice();

        System.out.println("Chalk5 ID is: " + chalkId5);
        System.out.println("Chalk5 Brand is: " + brand5);
        System.out.println("Chalk5 Color is: " + color5);
        System.out.println("Chalk5 Shape is: " + shape5);
        System.out.println("Chalk5 Material is: " + material5);
        System.out.println("Chalk5 is Dust Free: " + dustFree5);
        System.out.println("Chalk5 Price is: ₹" + price5);
        System.out.println("------------------------------------------------");
    }
}
