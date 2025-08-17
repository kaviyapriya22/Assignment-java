package org.ford.Assignment3;

import java.util.Arrays;

public class Cloth extends  Product {

    String fabric;
    String [] sizes= {"S","M","L","XL"};

    public Cloth (String id, String name, double price,String fabric){
        super(id,name,price);
        this.fabric=fabric;

    }

    @Override
    public String displayProductDetails() {
        return "Cloth{" +
                "productID='" + productID + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +'\''+
                ", fabric='" + fabric + '\'' +
                ", sizes=" + Arrays.toString(sizes) +
                '}';
    }
}
