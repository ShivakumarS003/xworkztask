package com.xworkz.toString.paint;

public class PaintRunner {
    public static void main(String[] args) {
        PaintDto paint = new PaintDto();
        paint.setBrandName("Dulux");
        paint.setColor("Red");
        paint.setType("Matte");
        paint.setQuantityInLiters(5);
        paint.setPrice(1200.00);

        System.out.println(paint);
    }
}
