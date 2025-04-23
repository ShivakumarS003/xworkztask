package com.xworkz.toString.laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        LaptopDto laptop = new LaptopDto();
        laptop.setBrand("Dell");
        laptop.setModel("Inspiron 15");
        laptop.setRamSizeGB(16);
        laptop.setStorageGB(512);
        laptop.setPrice(75000.00);

        System.out.println(laptop);
    }
}
