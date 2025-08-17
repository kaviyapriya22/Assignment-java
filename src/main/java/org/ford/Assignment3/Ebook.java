package org.ford.Assignment3;

public class Ebook extends Book {

    private int fileSize;
    private String format;

    public Ebook(String title, String author, String ISBN,double price,int fileSize, String format) {
        super(title,author,ISBN,price);
        this.fileSize = fileSize;
        this.format = format;
    }
@Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("File Size: "+this.fileSize);
        System.out.println("Format: "+this.format);
    }
}
