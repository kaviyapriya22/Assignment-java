package org.ford.Assignment3;

public class Book {

    private String title;
    private String author;
    private String ISBN;
    private double price;

    public Book(String title, String author, String ISBN, double price){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("ISBN: "+this.ISBN);
        System.out.println("Price: "+this.price);
    }
}
