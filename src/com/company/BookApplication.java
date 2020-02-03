package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BookDB> library = new ArrayList<>();
        double booksPrice = 0.0;
        int count = 0;
        BookDB b1 = new BookDB("Java1001","Head First Java","Kathy Sierra and Bert Bates","Easy to read Java workbook",	47.50);
        BookDB b2= new BookDB("Java1002","Thinking in Java","Bruce Eckel","Details about Java under the hood",	20.00);
        BookDB b3= new BookDB("Orcl1003","OCP: Oracle Certified Professional Java SE","Jeanne Boyarsky	","Everything you need to know in one place",45.00);
        BookDB b4= new BookDB("Python1004","Automate the Boring Stuff with Python","Al Sweigart","Fun with Python",10.50);
        BookDB b5 = new BookDB("Zombie1005","The Maker's Guide to the Zombie Apocalypse","Simon Monk","Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",16.50);
        BookDB b6= new BookDB("Rasp1006","Raspberry Pi Projects for the Evil Genius","Donald Norris","A dozen fiendishly fun projects for the Raspberry Pi!",14.75);
        library.add(b1);
        library.add(b2);
        library.add(b3);
        library.add(b4);
        library.add(b5);
        library.add(b6);

        System.out.println("Enter SKU?");
        System.out.println("---------------------------------");
        String searchBook= null;
//        System.out.println("null test" + searchBook.isEmpty() + " and " + searchBook.isBlank());
//        searchBook="";
//        System.out.println("blank test" + searchBook + searchBook.isEmpty() + " and " + searchBook.isBlank());
//        searchBook="Java1001";
//        System.out.println("String test" + searchBook + searchBook.isEmpty() + " and " + searchBook.isBlank());
         searchBook = sc.next();
        switch (searchBook){
            case "Java1001":
                for (int j = 0; j < library.size(); j++) { // search in the library
                    if(library.get(j).getSKU().equalsIgnoreCase(searchBook)) {
                        System.out.println(library.get(j).getDistplayText());
                    }
                }

                break;
            case "Java1002":
                for (int j = 0; j < library.size(); j++) { // search in the library
                    if (library.get(j).getSKU().equalsIgnoreCase(searchBook)) {
                        System.out.println(library.get(j).getDistplayText());
                    }
                }
                break;
            case "Orcl1003":
                for (int j = 0; j < library.size(); j++) { // search in the library
                    if (library.get(j).getSKU().equalsIgnoreCase(searchBook)) {
                        System.out.println(library.get(j).getDistplayText());
                    }
                }
                break;
            case "Python1004":
                for (int j = 0; j < library.size(); j++) { // search in the library
                    if (library.get(j).getSKU().equalsIgnoreCase(searchBook)) {
                        System.out.println(library.get(j).getDistplayText());
                    }
                }
                break;
            case "Zombie1005":
                break;
            case "Rasp1006":
                for (int j = 0; j < library.size(); j++) { // search in the library
                    if (library.get(j).getSKU().equalsIgnoreCase(searchBook)) {
                        System.out.println(library.get(j).getDistplayText());
                    }
                }
                break;
            default:
                System.out.println( searchBook + " is not found !!!");
        }


    }



}
