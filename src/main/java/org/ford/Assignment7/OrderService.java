package org.ford.Assignment7;

public class OrderService {

    private static final int MIN_QUANTITY = 1;

    public void placeOrder(String prodName, int quantity) throws InvalidOrderQuantityException{

        if (quantity < MIN_QUANTITY){
            throw new InvalidOrderQuantityException("Order Quantity should be greater than 0");
        }
    }
}
