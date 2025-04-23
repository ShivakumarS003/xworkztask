package com.xworkz.toString.himalayas;

public class HimalayasRunner {
    public static void main(String[] args) {
        HimalayasDto himalayas = new HimalayasDto();
        himalayas.setLocation("Asia");
        himalayas.setHeight(8848.86);
        himalayas.setCountries("India, Nepal, Bhutan, China");
        himalayas.setMountainRangeType("Fold Mountain");
        himalayas.setFamousPeaks("Mount Everest");

        System.out.println(himalayas);
    }
}
