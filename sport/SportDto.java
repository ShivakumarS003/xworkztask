package com.xworkz.toString.sport;

public class SportDto {
    private String name;
    private String type;
    private int playersCount;
    private String originCountry;
    private int popularityRank;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPlayersCount() {
        return playersCount;
    }

    public void setPlayersCount(int playersCount) {
        this.playersCount = playersCount;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public int getPopularityRank() {
        return popularityRank;
    }

    public void setPopularityRank(int popularityRank) {
        this.popularityRank = popularityRank;
    }

    @Override
    public String toString() {
        return "SportDto :-" +
                "\nName = " + this.name +
                "\nType = " + this.type +
                "\nPlayers Count = " + this.playersCount +
                "\nOrigin Country = " + this.originCountry +
                "\nPopularity Rank = " + this.popularityRank;
    }
}
