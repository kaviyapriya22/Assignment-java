package org.ford.Assignment8;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class BookDriver {

    public static void main(String[] args) {

        List <Book> bookList = new ArrayList<Book>();

        Book book1 = new Book(1,"Green garden","Charles Dikkins",300);
        Book book2 = new Book(2,"Childhood stories","Suda murty",200);
        Book book3 = new Book(4,"Hellen Keller","George Orwell",500);
        Book book4 = new Book(3,"Three men in a boat","Jerome",350);



        // CREATE
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        System.out.println("Book list after addition: ");
        System.out.println(bookList);
        System.out.println();

        //SORTING BY TITLE
        System.out.println("Book List before sorting by title: ");
        System.out.println(bookList);
        Collections.sort(bookList);
        System.out.println("Book List after sorting  by title: ");
        System.out.println(bookList);
        System.out.println();


        // SORTING BY PRICE
        System.out.println("Book List before sorting by price: ");
        System.out.println(bookList);
        Collections.sort(bookList, new BookPriceComparator());
        System.out.println("Book List after sorting by price: ");
        System.out.println(bookList);
        System.out.println();

        //SORTING BY AUTHOR
        System.out.println("Book List before sorting by author: ");
        System.out.println(bookList);
        Collections.sort(bookList, new BookAuthorComparator());
        System.out.println("Book List after sorting by author: ");

    }
}
