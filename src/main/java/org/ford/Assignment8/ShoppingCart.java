package org.ford.Assignment8;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<CartItem> cartItemList = new ArrayList<>();


    public void addItem( CartItem item){

        if (cartItemList.contains(item)){
            item.setQuantity(item.getQuantity()+1);
        }
        else{
            cartItemList.add(item);
        }

    }

    public void removeItem(int itemId){

        cartItemList.remove(new CartItem(itemId, "", 0, 0));



    }

    public void updateItemQuantity(int itemId, int quantity){
        for (CartItem item : cartItemList){
            if (item.getItemId()==itemId){
                item.setQuantity(item.getQuantity()+quantity);
            }

        }
    }

    public void searchItem(int itemId){
        boolean fount = cartItemList.contains(itemId);
        if (fount){
            System.out.println("Item found"+ cartItemList.indexOf(itemId));
        }
        else{
            System.out.println("No item found");
        }
    }

    public void getTotalBill(){
        double total = 0;
        for (CartItem item : cartItemList){
            System.out.println(item.getItemName()+":"+item.getQuantity()+"* "+item.getPricePerUnit()+"= "+item.getQuantity()* item.getPricePerUnit());

            total=item.getQuantity()*item.getPricePerUnit()+total;

        }
        System.out.println("Total bill : "+total);
    }

    public void displayCart(){
        for (CartItem item : cartItemList){
            System.out.println(item.toString());
        }
    }


}
