package com.xworkz.toString.stadium;

public class StadiumRunner {
    public static void main(String[] args) {
        StadiumDto stadium = new StadiumDto();
        stadium.setName("Wankhede Stadium");
        stadium.setLocation("Mumbai, India");
        stadium.setCapacity(33000);
        stadium.setYearBuilt(1974);
        stadium.setSurfaceType("Grass");

        System.out.println(stadium);
    }
}
