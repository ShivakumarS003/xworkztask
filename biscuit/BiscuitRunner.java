package com.xworkz.toString.biscuit;

public class BiscuitRunner {
    public static void main(String[] args) {
        BiscuitDto biscuit = new BiscuitDto();
        biscuit.setBrandName("Britannia");
        biscuit.setFlavor("Chocolate");
        biscuit.setQuantity(10);
        biscuit.setPrice(50.00);
        biscuit.setPackagingType("Plastic Wrapper");

        System.out.println(biscuit);
    }
}
