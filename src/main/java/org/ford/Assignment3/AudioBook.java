package org.ford.Assignment3;

public class AudioBook extends Book {

    private int duration;
    private String narrator;

    public AudioBook(String title, String author, String ISBN,double price,int duration, String narrator) {
        super(title, author, ISBN, price);
        this.duration = duration;
        this.narrator = narrator;
    }
@Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration);
        System.out.println("Narrator: " + narrator);
    }
}
