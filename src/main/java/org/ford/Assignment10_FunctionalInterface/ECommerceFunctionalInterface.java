package org.ford.Assignment10FunctionalInterface;
import java.sql.SQLOutput;
import java.util.function.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.Random;

public class ECommerceFunctionalInterface {

    public static void main(String[] args) {
        Predicate <Double> isValid = (Double price) -> price>2000;
        Consumer <Double> priceConsumer = (Double price) -> System.out.println("Confirming the order of price in USD: "+price);
        Supplier <String> couponCodeSuplier = () ->  {String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            StringBuilder sb = new StringBuilder();
            Random random = new Random();

            int length = 8; // length of coupon code
            for (int i = 0; i < length; i++) {
                int index = random.nextInt(chars.length());
                sb.append(chars.charAt(index));
            }
            return sb.toString();
        };
        Function<Double, Double> priceFunction = (Double price) -> price * 83;
        BiFunction<Double, Double,Double> discountPercentage = (Double amount, Double discount) -> {
            return amount -(amount * discount/100) ;
        };
        List<Double> ordersUSD = Arrays.asList(50.0, 150.0, 300.0);

        for ( Double order : ordersUSD ) {

            System.out.println("Amount in INR : "+ priceFunction.apply(order));

            if(isValid.test(order)){
                System.out.println(order+"  is eligible for free shiping ");
            }
            else{
                System.out.println("Not eligible for free shiping ");
            }

            priceConsumer.accept(order);
            System.out.println("Coupon code for your order : "+ couponCodeSuplier.get());
            System.out.println("Final amount after applying discount: "+ discountPercentage.apply(order,10.0));
            System.out.println("-------");
            System.out.println();

        }




    }
}
