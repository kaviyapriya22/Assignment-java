package org.ford.oops;
import java.util.Scanner;


public class Product {

    private String name;
    private double price;
    private String productID ;

    public Product( String name, double price, String productID ) {
        this.name=name;
        this.price=price;
        this.productID=productID;
    }



    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", productID='" + productID + '\'' +
                '}';
    }
}
