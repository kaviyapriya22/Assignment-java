package org.ford.Assignment2;
import java.util.Scanner;

public class ManageAccess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String status="";
        System.out.println("  1. Admin ");
        System.out.println("  2. Manager");
        System.out.println("  3. Viewer");
        System.out.println("  4. Exit ");

        System.out.println(" enter your role (1-4)  : ");

        boolean exitChoice = false;

        while( !exitChoice){

            status=scan.nextLine();

            switch (status){
                case "1":
                    System.out.println(" As a admin you can manage users and settings");
                    break;
                case "2":
                    System.out.println(" As a manager you can generate reports and approve requests");
                    break;
                case "3":
                    System.out.println(" As a viewer you can have only read access");
                    break;
                case "4":
                    System.out.println(" Thanks for using the application");
                    exitChoice = true;
                    break;

                default:
                    System.out.println("Invalid role");

            }

        }
    }
}
