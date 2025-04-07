package com.xworkz.mobilecaseapp.mobilecase;

public class MobileCaseRunner {
    public static void main(String[] args) {

        MobileCase case1 = new MobileCase();
        case1.setCaseId(1);
        case1.setBrand("Spigen");
        case1.setModel("Galaxy S21");
        case1.setMaterial("TPU");
        case1.setColor("Black");
        case1.setWaterproof(true);
        case1.setPrice(899.00);

        int caseId1 = case1.getCaseId();
        String brand1 = case1.getBrand();
        String model1 = case1.getModel();
        String material1 = case1.getMaterial();
        String color1 = case1.getColor();
        boolean waterproof1 = case1.isWaterproof();
        double price1 = case1.getPrice();

        System.out.println("Case1 ID is: " + caseId1);
        System.out.println("Case1 Brand is: " + brand1);
        System.out.println("Case1 Model is: " + model1);
        System.out.println("Case1 Material is: " + material1);
        System.out.println("Case1 Color is: " + color1);
        System.out.println("Case1 is Waterproof: " + waterproof1);
        System.out.println("Case1 Price is: ₹" + price1);
        System.out.println("------------------------------------------------");

        MobileCase case2 = new MobileCase();
        case2.setCaseId(2);
        case2.setBrand("OtterBox");
        case2.setModel("iPhone 14");
        case2.setMaterial("Polycarbonate");
        case2.setColor("Blue");
        case2.setWaterproof(true);
        case2.setPrice(1499.00);

        int caseId2 = case2.getCaseId();
        String brand2 = case2.getBrand();
        String model2 = case2.getModel();
        String material2 = case2.getMaterial();
        String color2 = case2.getColor();
        boolean waterproof2 = case2.isWaterproof();
        double price2 = case2.getPrice();

        System.out.println("Case2 ID is: " + caseId2);
        System.out.println("Case2 Brand is: " + brand2);
        System.out.println("Case2 Model is: " + model2);
        System.out.println("Case2 Material is: " + material2);
        System.out.println("Case2 Color is: " + color2);
        System.out.println("Case2 is Waterproof: " + waterproof2);
        System.out.println("Case2 Price is: ₹" + price2);
        System.out.println("------------------------------------------------");

        MobileCase case3 = new MobileCase();
        case3.setCaseId(3);
        case3.setBrand("Ringke");
        case3.setModel("OnePlus 11");
        case3.setMaterial("Silicone");
        case3.setColor("Transparent");
        case3.setWaterproof(false);
        case3.setPrice(699.00);

        int caseId3 = case3.getCaseId();
        String brand3 = case3.getBrand();
        String model3 = case3.getModel();
        String material3 = case3.getMaterial();
        String color3 = case3.getColor();
        boolean waterproof3 = case3.isWaterproof();
        double price3 = case3.getPrice();

        System.out.println("Case3 ID is: " + caseId3);
        System.out.println("Case3 Brand is: " + brand3);
        System.out.println("Case3 Model is: " + model3);
        System.out.println("Case3 Material is: " + material3);
        System.out.println("Case3 Color is: " + color3);
        System.out.println("Case3 is Waterproof: " + waterproof3);
        System.out.println("Case3 Price is: ₹" + price3);
        System.out.println("------------------------------------------------");

        MobileCase case4 = new MobileCase();
        case4.setCaseId(4);
        case4.setBrand("Caseology");
        case4.setModel("Pixel 7");
        case4.setMaterial("Rubber");
        case4.setColor("Green");
        case4.setWaterproof(false);
        case4.setPrice(1099.00);

        int caseId4 = case4.getCaseId();
        String brand4 = case4.getBrand();
        String model4 = case4.getModel();
        String material4 = case4.getMaterial();
        String color4 = case4.getColor();
        boolean waterproof4 = case4.isWaterproof();
        double price4 = case4.getPrice();

        System.out.println("Case4 ID is: " + caseId4);
        System.out.println("Case4 Brand is: " + brand4);
        System.out.println("Case4 Model is: " + model4);
        System.out.println("Case4 Material is: " + material4);
        System.out.println("Case4 Color is: " + color4);
        System.out.println("Case4 is Waterproof: " + waterproof4);
        System.out.println("Case4 Price is: ₹" + price4);
        System.out.println("------------------------------------------------");

        MobileCase case5 = new MobileCase();
        case5.setCaseId(5);
        case5.setBrand("Urban Armor Gear");
        case5.setModel("iPhone 13");
        case5.setMaterial("Hybrid");
        case5.setColor("Red");
        case5.setWaterproof(true);
        case5.setPrice(1999.00);

        int caseId5 = case5.getCaseId();
        String brand5 = case5.getBrand();
        String model5 = case5.getModel();
        String material5 = case5.getMaterial();
        String color5 = case5.getColor();
        boolean waterproof5 = case5.isWaterproof();
        double price5 = case5.getPrice();

        System.out.println("Case5 ID is: " + caseId5);
        System.out.println("Case5 Brand is: " + brand5);
        System.out.println("Case5 Model is: " + model5);
        System.out.println("Case5 Material is: " + material5);
        System.out.println("Case5 Color is: " + color5);
        System.out.println("Case5 is Waterproof: " + waterproof5);
        System.out.println("Case5 Price is: ₹" + price5);
        System.out.println("------------------------------------------------");
    }
}
