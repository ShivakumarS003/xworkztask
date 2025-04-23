package com.xworkz.toString.beach;

public class BeachRunner {
    public static void main(String[] args) {
        BeachDto beach = new BeachDto();
        beach.setName("Goa Beach");
        beach.setLocation("Goa, India");
        beach.setAreaInSquareKilometers(15.2);
        beach.setPopular(true);
        beach.setMainAttraction("Water Sports");

        System.out.println(beach);
    }
}
