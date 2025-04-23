package com.xworkz.toString.granite;

public class GraniteRunner {
    public static void main(String[] args) {
        GraniteDto granite = new GraniteDto();
        granite.setColor("Black");
        granite.setType("Polished");
        granite.setThickness(2.5);
        granite.setPricePerSquareMeter(5000.00);
        granite.setOrigin("India");

        System.out.println(granite);
    }
}
