package com.xworkz.methodOverriding.Libraries.centralLib;

import com.xworkz.methodOverriding.Libraries.library.Library;

public class Central extends Library {
    @Override
    public void issueBook() {
        System.out.println("PublicLibrary: Issued for 15 days");
    }

    @Override
    public void returnBook() {
        System.out.println("PublicLibrary: Returned at counter");
    }

    @Override
    public void addBook() {
        System.out.println("PublicLibrary: New books cataloged");
    }

    @Override
    public void removeBook() {
        System.out.println("PublicLibrary: Old books archived");
    }

    @Override
    public void searchBook() {
        System.out.println("PublicLibrary: Searching in public catalog");
    }
}
