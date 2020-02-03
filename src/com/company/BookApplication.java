package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        double booksPrice = 0.0;
        int count = 0;
        Book b1 = new Book("Alex", "Java", "a nice book");
        library.add(b1);
        Book b2 = new Book("James", "Html", "a nice book");
        library.add(b2);
        Book b3 = new Book("Nora", "Spring", "a nice book");
        library.add(b3);
        Book b4 = new Book("Bili", "Script", "a nice book");
        library.add(b4);
        Book b5 = new Book("Temesgen", "Database", "a nice book");
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
