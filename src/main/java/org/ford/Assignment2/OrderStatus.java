package org.ford.Assignment2;
import java.util.Scanner;
public class OrderStatus {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int orderNumbers = scan.nextInt();
        char[] orderLists = new char[orderNumbers];
        scan.nextLine();

        int pendingCount = 0;
        int deliveredCount = 0;
        int cancelledCount = 0;
        int failedCount = 0;
        int ind = 0;

        System.out.println(" P- Pending");
        System.out.println(" D- Delivered");
        System.out.println(" C- Cancelled");
        System.out.println(" F- Failed");

        for (int i = 0; i < orderNumbers; i++) {


            System.out.println("Enter order status: ");
            char status = scan.nextLine().trim().toUpperCase().charAt(0);
            orderLists[i] = status;
        }

        for (char order : orderLists) {
            switch (order) {
                case 'P':
                    System.out.println("Order " + " " + ind + 1 + " : Pending ");
                    pendingCount++;
                    break;

                case 'D':
                    System.out.println("Order " + " " + ind + 1 + " : Delivered ");
                    deliveredCount++;
                    break;
                case 'C':
                    System.out.println("Order " + " " + ind + 1 + " : Cancelled ");
                    cancelledCount++;
                    break;
                case 'F':
                    System.out.println("Order " + " " + ind + 1 + " : Failed ");
                    failedCount++;
                    break;
            }
            ind++;
        }

        System.out.println("Number of Pending orders : " + pendingCount);
        System.out.println("Number of Delivered orders : " + deliveredCount);
        System.out.println("Number of Cancelled orders : " + cancelledCount);
        System.out.println("Number of Failed orders : " + failedCount);
    }


}
