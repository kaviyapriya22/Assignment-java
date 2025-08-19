package org.ford.Assignment9;
import java.util.*;

public class ProductDriver {
    public static void main(String[] args) {

        Map <Integer,Product> productMap = new HashMap<>();
        Product p1 = new Product(103,"shampoo",160);
        Product p2=new Product(100,"Body Oil ",100);
        Product p3= new Product(102,"Conditioner",140);
        Product p4= new Product(103,"shampoo",160);
        Product p5  =   new Product(100,"Body Oil ",100) ;
        Product p6= new Product(101,"soap",60);
        productMap.put(21,p1);
        productMap.put(2,p2);
        productMap.put(20,p3);
        productMap.put(21,p4);
        productMap.put(22,p5);
        productMap.put(23,p6);

        System.out.println("ADDING PRODUCT MAP");
        System.out.println(productMap);
        System.out.println();

        System.out.println("REMOVING PRODUCT FROM MAP: ");
        Integer id = 2;
        if (productMap.containsKey(id)) {
            System.out.println("Removed product id "+id+" ? "+productMap.remove(id));
        }
        else {

            System.out.println(" No such product id "+id);
        }
        System.out.println("AFTER REMOVING PRODUCT FROM MAP"+productMap);
        System.out.println();


        System.out.println("UPDATE THE PRICE OF  PRODUCT");
        Integer id2 = 21;
        if (productMap.containsKey(id2)) {
            Product p = productMap.get(id2);
            p.setPrice(p.getPrice()-1.1);
        }
        else{
            System.out.println(" No such product id "+id2);
        }
        System.out.println("AFTER UPDATE THE PRICE OF  PRODUCT"+productMap);
        System.out.println();

        System.out.println(" SEARCHING PRODUCTS BASED ON ID");
        if (productMap.containsKey(23)) {
            System.out.println("Found the product: "+productMap.get(23));
        }
        else {
            System.out.println(" No such product id "+23);
        }
        System.out.println();

        System.out.println("SEARCHING PRODUCTS CHEAPER THAN GIVEN PRICE: ");
        double price = 130;
        for(Product p : productMap.values()){
            if(p.getPrice()<price){
                System.out.println("Cheaper product: "+p);
            }
        }
        System.out.println();

        System.out.println("SORTING PRODUCTS BASED ON price");






    }
}
