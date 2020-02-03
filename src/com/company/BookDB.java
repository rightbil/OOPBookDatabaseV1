package com.company;

import java.text.NumberFormat;

public class BookDB {
    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String SKU;
    private String author;
    private String title;
    private String description;
    private double price;


    public BookDB(String Sku,String author, String title, String description,double price) {
        this.SKU=Sku;
        this.author = author;
        this.title = title;
        this.description = description;
        this.price=price;

    }
    // a method

    public BookDB() {
    }

    public static BookDB getBook(String[] args) {
        BookDB  bk = new BookDB();
    return bk;
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

        return SKU + "\t\t" + author + "\t\t" + title +
                "\t\t" + description;
    }


}