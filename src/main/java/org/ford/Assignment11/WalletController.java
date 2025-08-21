package org.ford.Layered_Application;

public class WalletController {

    public static void main(String[] args) {

        WalletService walletService = new WalletServiceImpl();
        Wallet user1 = new Wallet (500,"Kaviya",30000.0,"kaviya@gmail.com","kaviya22");
        Wallet user2= new Wallet (101,"Priya",5000.0,"priya@gmail.com","priya23");
        Wallet user3 = new Wallet(21,"Vimala",500000.0,"vimala@gmail.com","vimala24");


        try {

            System.out.println("Added user: "+walletService.registerNewUserWallet(user1));
            System.out.println("Added user: "+walletService.registerNewUserWallet(user2));
            System.out.println("Added user: "+walletService.registerNewUserWallet(user3));
        }
        catch (ExistingUserException e){
            System.out.println(e.getMessage());
        }
        System.out.println();



        try{

            System.out.println("Added fund : "+walletService.addFundsToWalletByEmailID("kaviya@gmail.com",3000.0));

        }
        catch(UserNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (InvalidAmountException e){
            System.out.println(e.getMessage());
        }
        System.out.println();


        try{
            System.out.println("Withdrawing amount "+ walletService.withdrawFromWalletByEmailID("priya@gmail.com",500.0));

        }
        catch (UserNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (InvalidAmountException e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        try{

            System.out.println("Transaction successful ? " +walletService.transferFunds("vimala@gmail.com","priya@gmail.com",1200.0));
        }
        catch (UserNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (InvalidAmountException e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        try{

            walletService.getUserWalletByEmailID("vimala@gmail.com");

        }
        catch (UserNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        try {
            System.out.println(walletService.getAllWallets("admin1234"));

        }
        catch (AcessDeniedException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(walletService.getAllWallets("admin123")); // should succeed
        } catch (AcessDeniedException e) {
            System.out.println(e.getMessage());
        }


    }
}
