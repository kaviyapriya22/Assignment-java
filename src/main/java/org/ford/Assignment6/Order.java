package org.ford.Assignment6;

public class Order {

    static int counter = 0;
    public String orderID;
    public String customerName;
    public String product;

    public Order(String id, String customerName, String product) {
        counter++;
        this.orderID = id;
        this.customerName = customerName;
        this.product = product;
    }

    public void displayOrderDetails(){
        System.out.println(" Order number: "+Order.counter);
        System.out.println("Order ID: "+this.orderID);
        System.out.println("Customer Name: "+this.customerName);
        System.out.println("Product Name: "+this.product);
    }

    public static  void displayTotalOrders(){


        System.out.println("Total orders :"+Order.counter);


    }

}
