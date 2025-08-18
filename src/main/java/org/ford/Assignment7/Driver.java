package org.ford.Assignment7;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {


//        ATM atm = new ATM();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter PIN: ");
//        String pin = sc.nextLine();
//        try{
//            atm.validatePINn(pin);
//            System.out.println(" Sucessfully Entered PIN");
//        }
//        catch(InvalidPinException e){
//            System.out.println(e.getMessage());
//        }

//        TicketBooking ticket = new TicketBooking();
//        Scanner sc2 = new Scanner(System.in);
//        System.out.println("Enter the movie name: ");
//        String movie = sc2.nextLine();
//        System.out.println("Enter the number of tickets: ");
//        int cnt = sc2.nextInt();
//
//        try {
//            ticket.bookTickets(movie,cnt);
//            System.out.println("Successfully Booked Tickets");
//        }
//        catch(TicketLimitExceededException e){
//            System.out.println(e.getMessage());
//        }

//        FileUploader fileuploader = new FileUploader();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the name of the file you want to upload");
//        String path = scanner.nextLine();
//        System.out.println("Enter the size of the file you want to upload");
//        double filesize = scanner.nextDouble();
//
//        try{
//            fileuploader.uploadFile(path,filesize);
//            System.out.println("File uploaded successfully");
//        }
//        catch (FileTooLargeException e){
//            System.out.println(e.getMessage());
//        }

//        OrderService orderService = new OrderService();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter product name: ");
//        String productname = scanner.nextLine();
//        System.out.println("Enter quantity: ");
//        int quantity = scanner.nextInt();
//        try{
//            orderService.placeOrder(productname,quantity);
//            System.out.println("Order placed successfully");
//        }
//        catch (InvalidOrderQuantityException e){
//            System.out.println(e.getMessage());
//        }

        ExamEligibility examEligibility = new ExamEligibility();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student name");
        String studentName = input.nextLine();
        System.out.println("Enter Attendace Percentage");
        double attendancePercent = input.nextDouble();

        try{
            examEligibility.checkEligibility(studentName,attendancePercent);
            System.out.println("Eligible for Exam");
        }
        catch (LowAttendanceException e){
            System.out.println(e.getMessage());
        }

    }
}
