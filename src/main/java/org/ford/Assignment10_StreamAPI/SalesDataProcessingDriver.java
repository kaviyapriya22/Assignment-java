package org.ford.Assignment10StreamAPI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

public class SalesDataProcessingDriver {

    public static void main(String[] args) {

        List<Double> sales = new ArrayList<>();
        sales.add(4500.0);
        sales.add(8000.0);
        sales.add(3000.0);
        sales.add(12000.0);
        sales.add(15000.0);

        System.out.println("Sales greater that 5000: ");
        List <Double > highsales= sales.stream().filter((Double sale) -> sale>5000.0).map((Double sale) -> sale).toList();
        System.out.println(highsales);
        System.out.println();



        System.out.println("Sorting sales in descending order: ");
        List <Double> sortedSales = sales.stream().sorted(Comparator.reverseOrder()).map((Double sale) -> sale).toList();
        System.out.println(sortedSales);
        System.out.println();



        System.out.println(" converting sale by including GST: ");
        List <Double> gstSales= sales.stream().map((Double sale) -> sale+sale*0.18).toList();
        System.out.println(gstSales);
        System.out.println();


        Double maxSale = sales.stream().mapToDouble((Double sale) -> sale).max().getAsDouble();
        System.out.println("Max Sale : "+maxSale);
        System.out.println();

        Double totalSale = sales.stream().mapToDouble((Double sale) -> sale).sum() ;
        System.out.println("Total Sale : "+totalSale);


    }
}
