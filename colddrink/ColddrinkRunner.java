package com.xworkz.toString.colddrink;

public class ColddrinkRunner {
    public static void main(String[] args) {
        ColddrinkDto colddrink = new ColddrinkDto();
        colddrink.setBrandName("Coca Cola");
        colddrink.setFlavor("Coca");
        colddrink.setQuantityInML(500);
        colddrink.setPrice(40.00);
        colddrink.setSugarFree(false);

        System.out.println(colddrink);
    }
}
