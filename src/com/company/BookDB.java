package com.company;

import java.text.NumberFormat;

public class BookDB {
    private int SKU;
    private String author;
    private String title;
    private String description;


    public BookDB(String author, String title, String description) {
        this.author = author;
        this.title = title;
        this.description = description;

    }
    // a method

    public BookDB() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDistplayText() {

        System.out.println("Author: " + author +
                " Title: " + title +
                " Descriptions: " + description);
    }


}