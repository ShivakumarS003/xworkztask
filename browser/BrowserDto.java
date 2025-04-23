package com.xworkz.toString.browser;

public class BrowserDto {
    private String name;
    private double version;
    private boolean isFree;
    private String developer;
    private int releaseYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "BrowserDto :-" +
                "\nName = " + this.name +
                "\nVersion = " + this.version +
                "\nIs Free = " + this.isFree +
                "\nDeveloper = " + this.developer +
                "\nRelease Year = " + this.releaseYear;
    }
}
