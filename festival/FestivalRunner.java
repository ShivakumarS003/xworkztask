package com.xworkz.toString.festival;

public class FestivalRunner {
    public static void main(String[] args) {
        FestivalDto festival = new FestivalDto();
        festival.setName("Diwali");
        festival.setDate("2025-11-12");
        festival.setLocation("India");
        festival.setType("Hindu Festival");
        festival.setDurationDays(5);

        System.out.println(festival);
    }
}
