package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BookDB> library = new ArrayList<>();
        double booksPrice = 0.0;
        int count = 0;
        BookDB b1 = new BookDB("Alex", "Java", "a nice book");
        library.add(b1);
        BookDB b2 = new BookDB("James", "Html", "a nice book");
        library.add(b2);
        BookDB b3 = new BookDB("Nora", "Spring", "a nice book");
        library.add(b3);
        BookDB b4 = new BookDB("Bili", "Script", "a nice book");
        library.add(b4);
        BookDB b5 = new BookDB("Temesgen", "Database", "a nice book");
        library.add(b5);

        System.out.println("Book Details:\nAuthor \tTitle\t Description");
        System.out.println("---------------------------------");
        for (int j = 0; j < library.size(); j++) { // search in the library
            System.out.println(library.get(j).getDistplayText());
        }
    }

}
