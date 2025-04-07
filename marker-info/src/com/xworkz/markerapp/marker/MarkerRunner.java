package com.xworkz.markerapp.marker;

public class MarkerRunner {
    public static void main(String[] args) {

        Marker marker1 = new Marker();
        marker1.setMarkerId(1);
        marker1.setBrand("Camlin");
        marker1.setColor("Blue");
        marker1.setInkType("Permanent");
        marker1.setBodyMaterial("Plastic");
        marker1.setLength(14.5);
        marker1.setPrice(25.0);

        int markerId1 = marker1.getMarkerId();
        String brand1 = marker1.getBrand();
        String color1 = marker1.getColor();
        String inkType1 = marker1.getInkType();
        String bodyMaterial1 = marker1.getBodyMaterial();
        double length1 = marker1.getLength();
        double price1 = marker1.getPrice();

        System.out.println("Marker1 Id is: " + markerId1);
        System.out.println("Marker1 Brand is: " + brand1);
        System.out.println("Marker1 Color is: " + color1);
        System.out.println("Marker1 Ink Type is: " + inkType1);
        System.out.println("Marker1 Body Material is: " + bodyMaterial1);
        System.out.println("Marker1 Length is: " + length1);
        System.out.println("Marker1 Price is: " + price1);
        System.out.println("--------------------------------------------");

        Marker marker2 = new Marker();
        marker2.setMarkerId(2);
        marker2.setBrand("Faber-Castell");
        marker2.setColor("Black");
        marker2.setInkType("Dry Erase");
        marker2.setBodyMaterial("Aluminum");
        marker2.setLength(13.0);
        marker2.setPrice(30.0);

        int markerId2 = marker2.getMarkerId();
        String brand2 = marker2.getBrand();
        String color2 = marker2.getColor();
        String inkType2 = marker2.getInkType();
        String bodyMaterial2 = marker2.getBodyMaterial();
        double length2 = marker2.getLength();
        double price2 = marker2.getPrice();

        System.out.println("Marker2 Id is: " + markerId2);
        System.out.println("Marker2 Brand is: " + brand2);
        System.out.println("Marker2 Color is: " + color2);
        System.out.println("Marker2 Ink Type is: " + inkType2);
        System.out.println("Marker2 Body Material is: " + bodyMaterial2);
        System.out.println("Marker2 Length is: " + length2);
        System.out.println("Marker2 Price is: " + price2);
        System.out.println("--------------------------------------------");

        Marker marker3 = new Marker();
        marker3.setMarkerId(3);
        marker3.setBrand("Luxor");
        marker3.setColor("Red");
        marker3.setInkType("Permanent");
        marker3.setBodyMaterial("Plastic");
        marker3.setLength(15.0);
        marker3.setPrice(20.0);

        int markerId3 = marker3.getMarkerId();
        String brand3 = marker3.getBrand();
        String color3 = marker3.getColor();
        String inkType3 = marker3.getInkType();
        String bodyMaterial3 = marker3.getBodyMaterial();
        double length3 = marker3.getLength();
        double price3 = marker3.getPrice();

        System.out.println("Marker3 Id is: " + markerId3);
        System.out.println("Marker3 Brand is: " + brand3);
        System.out.println("Marker3 Color is: " + color3);
        System.out.println("Marker3 Ink Type is: " + inkType3);
        System.out.println("Marker3 Body Material is: " + bodyMaterial3);
        System.out.println("Marker3 Length is: " + length3);
        System.out.println("Marker3 Price is: " + price3);
        System.out.println("--------------------------------------------");

        Marker marker4 = new Marker();
        marker4.setMarkerId(4);
        marker4.setBrand("Sharpie");
        marker4.setColor("Green");
        marker4.setInkType("Water-based");
        marker4.setBodyMaterial("Plastic");
        marker4.setLength(13.5);
        marker4.setPrice(28.5);

        int markerId4 = marker4.getMarkerId();
        String brand4 = marker4.getBrand();
        String color4 = marker4.getColor();
        String inkType4 = marker4.getInkType();
        String bodyMaterial4 = marker4.getBodyMaterial();
        double length4 = marker4.getLength();
        double price4 = marker4.getPrice();

        System.out.println("Marker4 Id is: " + markerId4);
        System.out.println("Marker4 Brand is: " + brand4);
        System.out.println("Marker4 Color is: " + color4);
        System.out.println("Marker4 Ink Type is: " + inkType4);
        System.out.println("Marker4 Body Material is: " + bodyMaterial4);
        System.out.println("Marker4 Length is: " + length4);
        System.out.println("Marker4 Price is: " + price4);
        System.out.println("--------------------------------------------");

        Marker marker5 = new Marker();
        marker5.setMarkerId(5);
        marker5.setBrand("Staedtler");
        marker5.setColor("Purple");
        marker5.setInkType("Non-Permanent");
        marker5.setBodyMaterial("Plastic");
        marker5.setLength(12.8);
        marker5.setPrice(22.0);

        int markerId5 = marker5.getMarkerId();
        String brand5 = marker5.getBrand();
        String color5 = marker5.getColor();
        String inkType5 = marker5.getInkType();
        String bodyMaterial5 = marker5.getBodyMaterial();
        double length5 = marker5.getLength();
        double price5 = marker5.getPrice();

        System.out.println("Marker5 Id is: " + markerId5);
        System.out.println("Marker5 Brand is: " + brand5);
        System.out.println("Marker5 Color is: " + color5);
        System.out.println("Marker5 Ink Type is: " + inkType5);
        System.out.println("Marker5 Body Material is: " + bodyMaterial5);
        System.out.println("Marker5 Length is: " + length5);
        System.out.println("Marker5 Price is: " + price5);
        System.out.println("--------------------------------------------");
    }
}
