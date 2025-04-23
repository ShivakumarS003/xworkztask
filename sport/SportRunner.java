package com.xworkz.toString.sport;

public class SportRunner {
    public static void main(String[] args) {
        SportDto sport = new SportDto();
        sport.setName("Cricket");
        sport.setType("Team Sport");
        sport.setPlayersCount(11);
        sport.setOriginCountry("England");
        sport.setPopularityRank(1);

        System.out.println(sport);
    }
}
