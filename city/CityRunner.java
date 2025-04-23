package com.xworkz.toString.city;

public class CityRunner {
    public static void main(String[] args) {
        CityDto city = new CityDto();
        city.setName("Bengaluru");
        city.setPopulation(12000000);
        city.setArea(709.0);
        city.setCountry("India");
        city.setTimezone("GMT +5:30");

        System.out.println(city);
    }
}
