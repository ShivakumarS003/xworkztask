package com.xworkz.defenceapp.defence;

public class DefenceRunner {
    public static void main(String[] args) {

        Defence defence1 = new Defence();
        defence1.setDefenceId(1);
        defence1.setCountry("India");
        defence1.setSoldiers(1450000);
        defence1.setBranch("Army");
        defence1.setBudget(76.6);
        defence1.setHeadquarters("New Delhi");
        defence1.setIsNuclearPower(true);

        int id1 = defence1.getDefenceId();
        String country1 = defence1.getCountry();
        int soldiers1 = defence1.getSoldiers();
        String branch1 = defence1.getBranch();
        double budget1 = defence1.getBudget();
        String hq1 = defence1.getHeadquarters();
        boolean nuclear1 = defence1.getIsNuclearPower();

        System.out.println("Defence1 ID: " + id1);
        System.out.println("Country: " + country1);
        System.out.println("Soldiers: " + soldiers1);
        System.out.println("Branch: " + branch1);
        System.out.println("Budget: $" + budget1 + " Billion");
        System.out.println("Headquarters: " + hq1);
        System.out.println("Is Nuclear Power: " + nuclear1);
        System.out.println("--------------------------------------------------");

        Defence defence2 = new Defence();
        defence2.setDefenceId(2);
        defence2.setCountry("USA");
        defence2.setSoldiers(1400000);
        defence2.setBranch("Navy");
        defence2.setBudget(801.0);
        defence2.setHeadquarters("Washington D.C.");
        defence2.setIsNuclearPower(true);

        int id2 = defence2.getDefenceId();
        String country2 = defence2.getCountry();
        int soldiers2 = defence2.getSoldiers();
        String branch2 = defence2.getBranch();
        double budget2 = defence2.getBudget();
        String hq2 = defence2.getHeadquarters();
        boolean nuclear2 = defence2.getIsNuclearPower();

        System.out.println("Defence2 ID: " + id2);
        System.out.println("Country: " + country2);
        System.out.println("Soldiers: " + soldiers2);
        System.out.println("Branch: " + branch2);
        System.out.println("Budget: $" + budget2 + " Billion");
        System.out.println("Headquarters: " + hq2);
        System.out.println("Is Nuclear Power: " + nuclear2);
        System.out.println("--------------------------------------------------");

        Defence defence3 = new Defence();
        defence3.setDefenceId(3);
        defence3.setCountry("China");
        defence3.setSoldiers(2000000);
        defence3.setBranch("Air Force");
        defence3.setBudget(293.0);
        defence3.setHeadquarters("Beijing");
        defence3.setIsNuclearPower(true);

        int id3 = defence3.getDefenceId();
        String country3 = defence3.getCountry();
        int soldiers3 = defence3.getSoldiers();
        String branch3 = defence3.getBranch();
        double budget3 = defence3.getBudget();
        String hq3 = defence3.getHeadquarters();
        boolean nuclear3 = defence3.getIsNuclearPower();

        System.out.println("Defence3 ID: " + id3);
        System.out.println("Country: " + country3);
        System.out.println("Soldiers: " + soldiers3);
        System.out.println("Branch: " + branch3);
        System.out.println("Budget: $" + budget3 + " Billion");
        System.out.println("Headquarters: " + hq3);
        System.out.println("Is Nuclear Power: " + nuclear3);
        System.out.println("--------------------------------------------------");

        Defence defence4 = new Defence();
        defence4.setDefenceId(4);
        defence4.setCountry("France");
        defence4.setSoldiers(270000);
        defence4.setBranch("Joint Forces");
        defence4.setBudget(53.6);
        defence4.setHeadquarters("Paris");
        defence4.setIsNuclearPower(true);

        int id4 = defence4.getDefenceId();
        String country4 = defence4.getCountry();
        int soldiers4 = defence4.getSoldiers();
        String branch4 = defence4.getBranch();
        double budget4 = defence4.getBudget();
        String hq4 = defence4.getHeadquarters();
        boolean nuclear4 = defence4.getIsNuclearPower();

        System.out.println("Defence4 ID: " + id4);
        System.out.println("Country: " + country4);
        System.out.println("Soldiers: " + soldiers4);
        System.out.println("Branch: " + branch4);
        System.out.println("Budget: $" + budget4 + " Billion");
        System.out.println("Headquarters: " + hq4);
        System.out.println("Is Nuclear Power: " + nuclear4);
        System.out.println("--------------------------------------------------");

        Defence defence5 = new Defence();
        defence5.setDefenceId(5);
        defence5.setCountry("Germany");
        defence5.setSoldiers(180000);
        defence5.setBranch("Army");
        defence5.setBudget(56.0);
        defence5.setHeadquarters("Berlin");
        defence5.setIsNuclearPower(false);

        int id5 = defence5.getDefenceId();
        String country5 = defence5.getCountry();
        int soldiers5 = defence5.getSoldiers();
        String branch5 = defence5.getBranch();
        double budget5 = defence5.getBudget();
        String hq5 = defence5.getHeadquarters();
        boolean nuclear5 = defence5.getIsNuclearPower();

        System.out.println("Defence5 ID: " + id5);
        System.out.println("Country: " + country5);
        System.out.println("Soldiers: " + soldiers5);
        System.out.println("Branch: " + branch5);
        System.out.println("Budget: $" + budget5 + " Billion");
        System.out.println("Headquarters: " + hq5);
        System.out.println("Is Nuclear Power: " + nuclear5);
        System.out.println("--------------------------------------------------");
    }
}
