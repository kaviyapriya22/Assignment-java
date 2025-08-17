package org.ford;
import java.util.Scanner;


public class PriceComparisonEngine {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        double amazonPrice= scan.nextDouble();
        double flipkartPrice= scan.nextDouble();
        double myntraPrice= scan.nextDouble();

        double lowestPrice= Math.min(amazonPrice,Math.min(flipkartPrice,myntraPrice));
        double highestPrice= Math.max(amazonPrice,Math.max(flipkartPrice,myntraPrice));

        double differencePercentage= ((highestPrice - lowestPrice) / lowestPrice) * 100;
        String bestDeal = (lowestPrice==amazonPrice)? "Amazon gives best deal" : (lowestPrice==flipkartPrice)? " Flipkart gives best deal" : " Myntra gives best deal";

        System.out.println("Lowest price: "+lowestPrice);
        System.out.println("Highest price: "+highestPrice);
        System.out.println("Difference percentage: "+differencePercentage);
        System.out.println("Best deal: "+bestDeal);






    }
}
