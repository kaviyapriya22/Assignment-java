package org.ford.Assignment10FunctionalInterface;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.*;

public class BankFunctionalInterface {

    public static void main(String[] args) {
        Predicate<Double> isSuspicious = (Double amount) -> amount >50000.0;
        Consumer <Double> consumer = (Double amount) -> System.out.println("Processed transaction of "+amount);
        Supplier<Integer> otpSupplier = () ->  1000 + new Random().nextInt(9000);
        Function<Double,Double>  deductionFunction = (Double amount) -> amount - 0.2;
        BiFunction< Double, Double,Double> discountFunction = (Double amount, Double loyaltyPoints) ->{
            return (amount - loyaltyPoints) * 0.2;
        };

        List< Double > transactions = Arrays.asList(1200.0,55000.0,30000.0);

        for (Double transaction : transactions) {
            if (isSuspicious.test(transaction)){
                System.out.println("SUSPICIOUS TRANSACTION"+transaction);
            }
            else {
                consumer.accept(transaction);
                System.out.println("GENERATING OTP FOR TRANSACTION"+transaction+otpSupplier.get());
                System.out.println("UPDATED AMOUNT AFTER DEDUCTION OF PLATFORM FEE"+deductionFunction.apply(transaction));
                System.out.println("Enter loyalty points exist or not as 1 or 0 ");
                Scanner scanner = new Scanner(System.in);
                int loyaltyPoints = scanner.nextInt();
                if (loyaltyPoints==1 ) {
                    System.out.println("Enter loyalty points : ");
                    double points = scanner.nextDouble();
                    System.out.println("AFTER APPLYING LOYALTY POIINS : "+discountFunction.apply(transaction,points));
                    System.out.println("COMPLETED TRANSACTION");

                }
                else if (loyaltyPoints==0) {
                    System.out.println("COMPLETED TRANSACTION");
                }
            }
        }

    }


}
