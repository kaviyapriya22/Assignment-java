package org.ford.Assignment8;
import java.util.ArrayList;
import java.util.List;
public class CartItemDriver {

    public static void main(String[] args) {


        CartItem item1 = new CartItem(20,"shampoo",2,160.0);
        CartItem item2 = new CartItem(23,"soap",1,60.0);
        CartItem item3 = new CartItem(22,"Serum",2,560.0);
        CartItem item4 = new CartItem(21,"Moisturizer",1,200.0);
        CartItem item5 = new CartItem(22,"Serum",2,560.0);

        ShoppingCart cart = new ShoppingCart();
        System.out.println("Adding items: ");
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);

        cart.displayCart();

        System.out.println("---------");
        System.out.println("Removing items: ");
        cart.removeItem(23);
        cart.displayCart();

        System.out.println("--------------");
        System.out.println("Updating items: ");
        cart.updateItemQuantity(22,3);
        cart.displayCart();

        System.out.println("------------");
        System.out.println("Calculating bill: ");

        cart.getTotalBill();

    }
}
