package com.xworkz.methodOverriding.Libraries;

import com.xworkz.methodOverriding.Libraries.centralLib.Central;
import com.xworkz.methodOverriding.Libraries.library.Library;

public class LibRunner {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.issueBook();
        lib.returnBook();
        lib.addBook();
        lib.removeBook();
        lib.searchBook();

        Library lib1 = new Central();
        lib1.issueBook();
        lib1.returnBook();
        lib1.addBook();
        lib1.removeBook();
        lib1.searchBook();

        Central pub = new Central();
        pub.issueBook();
        pub.returnBook();
        pub.addBook();
        pub.removeBook();
        pub.searchBook();
    }
}
