package org.example;
import java.util.Scanner ;


public class AgeCategorizer {

    public static void main(String[] args) {

        int childCount=0;
        int teenCount=0;
        int adultCount =0;
        int seniorCount=0;

        Scanner scan =  new Scanner(System.in);
        System.out.println(" Enter the ages as comma seperated value : ");

        String ageString= scan.nextLine();

        String[] ageList = ageString.split(",");
        int numberOfPersons= ageList.length;

        for  ( String age:ageList){
            int ageInt= Integer.parseInt(age);

            if (ageInt<=5){
                childCount++;
            }
            else if ( ageInt >= 6 && ageInt <=17) {
                teenCount++;

            } else if (ageInt >=18 && ageInt<= 29 ) {
                adultCount++;

            } else if ( ageInt>= 30) {

                seniorCount++;

            }
        }

        double childPercentage = (childCount*100)/numberOfPersons;
        double teenPercentage = (teenCount*100)/numberOfPersons;
        double adultPercentage = (adultCount*100)/numberOfPersons;
        double seniorPercentage = (seniorCount*100)/numberOfPersons;

        System.out.printf("Children : %d (%.2f%%)%n", childCount, childPercentage);











    }




}
