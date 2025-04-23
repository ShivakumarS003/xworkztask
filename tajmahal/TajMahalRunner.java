package com.xworkz.toString.tajmahal;

public class TajMahalRunner {
    public static void main(String[] args) {
        TajMahalDto tajMahal = new TajMahalDto();
        tajMahal.setLocation("Agra, India");
        tajMahal.setArchitect("Ustad Ahmad Lahauri");
        tajMahal.setYearOfConstruction(1632);
        tajMahal.setStyle("Mughal Architecture");
        tajMahal.setHeight(73);

        System.out.println(tajMahal);
    }
}
