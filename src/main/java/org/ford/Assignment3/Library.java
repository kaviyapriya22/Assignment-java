package org.ford.Assignment3;
import java.util.ArrayList;
import java.util.List;
public class Library {

    List <Book> booksList;

    public Library(){
        booksList = new ArrayList<>();
    }

    public void addBook(Book book){
        booksList.add(book);
    }

    public void displayBooks(){
        for(Book book:booksList){
            book.displayDetails();

        }

    }
}
