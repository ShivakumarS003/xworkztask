package com.xworkz.toString.pen;

public class PenRunner {
    public static void main(String[] args) {
        PenDto pen = new PenDto();
        pen.setBrand("Parker");
        pen.setColor("Blue");
        pen.setType("Gel");
        pen.setPrice(120.0);
        pen.setRefillable(true);

        System.out.println(pen);
    }
}
