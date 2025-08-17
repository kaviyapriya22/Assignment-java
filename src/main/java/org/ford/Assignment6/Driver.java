package org.ford.Assignment6;

import java.util.Scanner;

public class Driver {


    public static void main(String[] args) {
//        HRPortal hr = new HRPortal();
//        hr.displayCustomer();


//        Order.displayTotalOrders();
//        Order order1 = new Order("OID01","Kaviya","Bed");
//        order1.displayOrderDetails();
//        Order order2 = new Order("OID02","Priya","Pillow");
//        order2.displayOrderDetails();


//        BankAccount account1 = new BankAccount("IOB9345789",7000.0);
//        account1.displayAccountDetails();
//        BankAccount account2 = new BankAccount("IOB9345798",10000.0);
//        account2.displayAccountDetails();
//        BankAccount.updateInterestRate(7000);
//        BankAccount account3 = new BankAccount("IOB93457108",12000.0);
//        account3.displayAccountDetails();

//            ATM atm = new ATM(5000.0);
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter withdrawal amount : ");
//
//            try{
//
//                String stringamount = sc.nextLine();
//                double amount = Double.parseDouble(stringamount);
//                atm.withdraw(amount);
//
//            }
//            catch(NumberFormatException e){
//                System.out.println(e.getMessage());
//            }
//            catch(IllegalArgumentException e){
//                System.out.println(e.getMessage());
//            }
//            catch(ArithmeticException e){
//                System.out.println(e.getMessage());
//            }

//        Checkout checkout1 = new Checkout();
//
//        Scanner input = new Scanner(System.in);
//        try{
//
//            System.out.println("Enter the price of the item : ");
//            String price = input.nextLine();
//
//            System.out.println("Enter the quantity of the item : ");
//            String quantity = input.nextLine();
//
//            double itemPrice = Double.parseDouble(price);
//            int itemQuantity = Integer.parseInt(quantity);
//
//            double total=checkout1.calculateTotal(itemPrice,itemQuantity);
//            System.out.println("Total amount : "+total);
//
//        }
//        catch (NumberFormatException e) {
//            System.out.println("invalid number"+e.getMessage());
//        }
//        catch (IllegalArgumentException e) {
//            System.out.println( e.getMessage());
//        }
//        catch (ArithmeticException e) {
//            System.out.println( e.getMessage());
//        }
//        finally {
//            System.out.println("Checkout process complete");
//
//        }

        FlightBooking booking1 = new FlightBooking();
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter seat number");
            String seatNumber = input.nextLine();

            int seatNumberInt = Integer.parseInt(seatNumber);
            booking1.bookSeat(seatNumberInt);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a numeric seat number.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
        booking1.printSeatStatus();














    }
}
