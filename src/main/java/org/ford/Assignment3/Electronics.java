package org.ford.Assignment3;

public class Electronics extends Product {

    double warrantyPeriod;

    public Electronics (String productId, String name, double price, double warranty){
        super(productId, name, price);
        this.warrantyPeriod = warranty;
    }

    @Override
    public String displayProductDetails() {
        return "Electronics{" +
                "productID='" + productID + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +'\''+
                ", warrantyPeriod=" + warrantyPeriod +
                '}';
    }
}
