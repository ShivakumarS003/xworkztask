package com.xworkz.toString.library;

public class LibraryRunner {
    public static void main(String[] args) {
        LibraryDto library = new LibraryDto();
        library.setName("Central Library");
        library.setLocation("Bengaluru");
        library.setBooksCount(50000);
        library.setEstablishedYear("1990");
        library.setLibrarianName("Saraswathi");

        System.out.println(library);
    }
}
