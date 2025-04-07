package com.xworkz.festivalapp.festival;

public class FestivalRunner {
    public static void main(String[] args) {

        Festival festival1 = new Festival();
        festival1.setFestivalId(1);
        festival1.setName("Diwali");
        festival1.setCountry("India");
        festival1.setMonth("October");
        festival1.setDurationInDays(5);
        festival1.setIsNationalHoliday(true);
        festival1.setMainAttraction("Fireworks and Lights");

        int festival1Id = festival1.getFestivalId();
        String name1 = festival1.getName();
        String country1 = festival1.getCountry();
        String month1 = festival1.getMonth();
        int duration1 = festival1.getDurationInDays();
        boolean holiday1 = festival1.getIsNationalHoliday();
        String attraction1 = festival1.getMainAttraction();

        System.out.println("Festival1 ID: " + festival1Id);
        System.out.println("Name: " + name1);
        System.out.println("Country: " + country1);
        System.out.println("Month: " + month1);
        System.out.println("Duration (days): " + duration1);
        System.out.println("Is National Holiday: " + holiday1);
        System.out.println("Main Attraction: " + attraction1);
        System.out.println("--------------------------------------------------");

        Festival festival2 = new Festival();
        festival2.setFestivalId(2);
        festival2.setName("Christmas");
        festival2.setCountry("USA");
        festival2.setMonth("December");
        festival2.setDurationInDays(1);
        festival2.setIsNationalHoliday(true);
        festival2.setMainAttraction("Santa and Gifts");

        int festival2Id = festival2.getFestivalId();
        String name2 = festival2.getName();
        String country2 = festival2.getCountry();
        String month2 = festival2.getMonth();
        int duration2 = festival2.getDurationInDays();
        boolean holiday2 = festival2.getIsNationalHoliday();
        String attraction2 = festival2.getMainAttraction();

        System.out.println("Festival2 ID: " + festival2Id);
        System.out.println("Name: " + name2);
        System.out.println("Country: " + country2);
        System.out.println("Month: " + month2);
        System.out.println("Duration (days): " + duration2);
        System.out.println("Is National Holiday: " + holiday2);
        System.out.println("Main Attraction: " + attraction2);
        System.out.println("--------------------------------------------------");

        Festival festival3 = new Festival();
        festival3.setFestivalId(3);
        festival3.setName("Oktoberfest");
        festival3.setCountry("Germany");
        festival3.setMonth("September");
        festival3.setDurationInDays(16);
        festival3.setIsNationalHoliday(false);
        festival3.setMainAttraction("Beer and Parades");

        int festival3Id = festival3.getFestivalId();
        String name3 = festival3.getName();
        String country3 = festival3.getCountry();
        String month3 = festival3.getMonth();
        int duration3 = festival3.getDurationInDays();
        boolean holiday3 = festival3.getIsNationalHoliday();
        String attraction3 = festival3.getMainAttraction();

        System.out.println("Festival3 ID: " + festival3Id);
        System.out.println("Name: " + name3);
        System.out.println("Country: " + country3);
        System.out.println("Month: " + month3);
        System.out.println("Duration (days): " + duration3);
        System.out.println("Is National Holiday: " + holiday3);
        System.out.println("Main Attraction: " + attraction3);
        System.out.println("--------------------------------------------------");

        Festival festival4 = new Festival();
        festival4.setFestivalId(4);
        festival4.setName("Rio Carnival");
        festival4.setCountry("Brazil");
        festival4.setMonth("February");
        festival4.setDurationInDays(5);
        festival4.setIsNationalHoliday(false);
        festival4.setMainAttraction("Samba Parade");

        int festival4Id = festival4.getFestivalId();
        String name4 = festival4.getName();
        String country4 = festival4.getCountry();
        String month4 = festival4.getMonth();
        int duration4 = festival4.getDurationInDays();
        boolean holiday4 = festival4.getIsNationalHoliday();
        String attraction4 = festival4.getMainAttraction();

        System.out.println("Festival4 ID: " + festival4Id);
        System.out.println("Name: " + name4);
        System.out.println("Country: " + country4);
        System.out.println("Month: " + month4);
        System.out.println("Duration (days): " + duration4);
        System.out.println("Is National Holiday: " + holiday4);
        System.out.println("Main Attraction: " + attraction4);
        System.out.println("--------------------------------------------------");

        Festival festival5 = new Festival();
        festival5.setFestivalId(5);
        festival5.setName("Songkran");
        festival5.setCountry("Thailand");
        festival5.setMonth("April");
        festival5.setDurationInDays(3);
        festival5.setIsNationalHoliday(true);
        festival5.setMainAttraction("Water Fights");

        int festival5Id = festival5.getFestivalId();
        String name5 = festival5.getName();
        String country5 = festival5.getCountry();
        String month5 = festival5.getMonth();
        int duration5 = festival5.getDurationInDays();
        boolean holiday5 = festival5.getIsNationalHoliday();
        String attraction5 = festival5.getMainAttraction();

        System.out.println("Festival5 ID: " + festival5Id);
        System.out.println("Name: " + name5);
        System.out.println("Country: " + country5);
        System.out.println("Month: " + month5);
        System.out.println("Duration (days): " + duration5);
        System.out.println("Is National Holiday: " + holiday5);
        System.out.println("Main Attraction: " + attraction5);
        System.out.println("--------------------------------------------------");
    }
}
