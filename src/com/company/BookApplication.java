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

        for (int i = 0; i < 5; i++) { // 5 books
            System.out.println("Enter book title?");
            String currentBook = sc.next();
            boolean isfound = false;
            for (int j = 0; j < library.size(); j++) { // search in the library

                if (library.get(j).getTitle().equalsIgnoreCase(currentBook)) {
                    booksPrice = booksPrice + 20;
                    count++;
                    isfound = true;
                    break;
                }
            }// inner loop
            if (!isfound) {
                System.out.println("Book is not avaliable");
            } else {
                System.out.println("book price :" + booksPrice);
            }
        }// end of loop
        System.out.println(count + " books requested and the total price :" + booksPrice);
    }

}
