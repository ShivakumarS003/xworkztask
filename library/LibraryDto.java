package com.xworkz.toString.library;

public class LibraryDto {
    private String name;
    private String location;
    private int booksCount;
    private String establishedYear;
    private String librarianName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBooksCount() {
        return booksCount;
    }

    public void setBooksCount(int booksCount) {
        this.booksCount = booksCount;
    }

    public String getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(String establishedYear) {
        this.establishedYear = establishedYear;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    @Override
    public String toString() {
        return "LibraryDto :-" +
                "\nName = " + this.name +
                "\nLocation = " + this.location +
                "\nBooks Count = " + this.booksCount +
                "\nEstablished Year = " + this.establishedYear +
                "\nLibrarian Name = " + this.librarianName;
    }
}
