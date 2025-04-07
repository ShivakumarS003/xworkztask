package com.xworkz.celebrityapp.celebrity;

public class CelebrityRunner {
    public static void main(String[] args) {

        Celebrity celeb1 = new Celebrity();
        celeb1.setCelebrityId(1);
        celeb1.setName("Shah Rukh Khan");
        celeb1.setAge(58);
        celeb1.setProfession("Actor");
        celeb1.setNationality("Indian");
        celeb1.setNetWorth(730.00);
        celeb1.setIsActive(true);

        int id1 = celeb1.getCelebrityId();
        String name1 = celeb1.getName();
        int age1 = celeb1.getAge();
        String profession1 = celeb1.getProfession();
        String nationality1 = celeb1.getNationality();
        double netWorth1 = celeb1.getNetWorth();
        boolean active1 = celeb1.getIsActive();

        System.out.println("Celebrity1 ID: " + id1);
        System.out.println("Celebrity1 Name: " + name1);
        System.out.println("Celebrity1 Age: " + age1);
        System.out.println("Celebrity1 Profession: " + profession1);
        System.out.println("Celebrity1 Nationality: " + nationality1);
        System.out.println("Celebrity1 Net Worth: $" + netWorth1 + " million");
        System.out.println("Celebrity1 Is Active: " + active1);
        System.out.println("--------------------------------------------------");

        Celebrity celeb2 = new Celebrity();
        celeb2.setCelebrityId(2);
        celeb2.setName("Taylor Swift");
        celeb2.setAge(34);
        celeb2.setProfession("Singer");
        celeb2.setNationality("American");
        celeb2.setNetWorth(1000.00);
        celeb2.setIsActive(true);

        int id2 = celeb2.getCelebrityId();
        String name2 = celeb2.getName();
        int age2 = celeb2.getAge();
        String profession2 = celeb2.getProfession();
        String nationality2 = celeb2.getNationality();
        double netWorth2 = celeb2.getNetWorth();
        boolean active2 = celeb2.getIsActive();

        System.out.println("Celebrity2 ID: " + id2);
        System.out.println("Celebrity2 Name: " + name2);
        System.out.println("Celebrity2 Age: " + age2);
        System.out.println("Celebrity2 Profession: " + profession2);
        System.out.println("Celebrity2 Nationality: " + nationality2);
        System.out.println("Celebrity2 Net Worth: $" + netWorth2 + " million");
        System.out.println("Celebrity2 Is Active: " + active2);
        System.out.println("--------------------------------------------------");

        Celebrity celeb3 = new Celebrity();
        celeb3.setCelebrityId(3);
        celeb3.setName("Cristiano Ronaldo");
        celeb3.setAge(39);
        celeb3.setProfession("Footballer");
        celeb3.setNationality("Portuguese");
        celeb3.setNetWorth(500.00);
        celeb3.setIsActive(true);

        int id3 = celeb3.getCelebrityId();
        String name3 = celeb3.getName();
        int age3 = celeb3.getAge();
        String profession3 = celeb3.getProfession();
        String nationality3 = celeb3.getNationality();
        double netWorth3 = celeb3.getNetWorth();
        boolean active3 = celeb3.getIsActive();

        System.out.println("Celebrity3 ID: " + id3);
        System.out.println("Celebrity3 Name: " + name3);
        System.out.println("Celebrity3 Age: " + age3);
        System.out.println("Celebrity3 Profession: " + profession3);
        System.out.println("Celebrity3 Nationality: " + nationality3);
        System.out.println("Celebrity3 Net Worth: $" + netWorth3 + " million");
        System.out.println("Celebrity3 Is Active: " + active3);
        System.out.println("--------------------------------------------------");

        Celebrity celeb4 = new Celebrity();
        celeb4.setCelebrityId(4);
        celeb4.setName("Emma Watson");
        celeb4.setAge(34);
        celeb4.setProfession("Actress");
        celeb4.setNationality("British");
        celeb4.setNetWorth(85.00);
        celeb4.setIsActive(true);

        int id4 = celeb4.getCelebrityId();
        String name4 = celeb4.getName();
        int age4 = celeb4.getAge();
        String profession4 = celeb4.getProfession();
        String nationality4 = celeb4.getNationality();
        double netWorth4 = celeb4.getNetWorth();
        boolean active4 = celeb4.getIsActive();

        System.out.println("Celebrity4 ID: " + id4);
        System.out.println("Celebrity4 Name: " + name4);
        System.out.println("Celebrity4 Age: " + age4);
        System.out.println("Celebrity4 Profession: " + profession4);
        System.out.println("Celebrity4 Nationality: " + nationality4);
        System.out.println("Celebrity4 Net Worth: $" + netWorth4 + " million");
        System.out.println("Celebrity4 Is Active: " + active4);
        System.out.println("--------------------------------------------------");

        Celebrity celeb5 = new Celebrity();
        celeb5.setCelebrityId(5);
        celeb5.setName("Bruce Lee");
        celeb5.setAge(32);
        celeb5.setProfession("Martial Artist");
        celeb5.setNationality("Chinese-American");
        celeb5.setNetWorth(10.00);
        celeb5.setIsActive(false);

        int id5 = celeb5.getCelebrityId();
        String name5 = celeb5.getName();
        int age5 = celeb5.getAge();
        String profession5 = celeb5.getProfession();
        String nationality5 = celeb5.getNationality();
        double netWorth5 = celeb5.getNetWorth();
        boolean active5 = celeb5.getIsActive();

        System.out.println("Celebrity5 ID: " + id5);
        System.out.println("Celebrity5 Name: " + name5);
        System.out.println("Celebrity5 Age: " + age5);
        System.out.println("Celebrity5 Profession: " + profession5);
        System.out.println("Celebrity5 Nationality: " + nationality5);
        System.out.println("Celebrity5 Net Worth: $" + netWorth5 + " million");
        System.out.println("Celebrity5 Is Active: " + active5);
        System.out.println("--------------------------------------------------");
    }
}
