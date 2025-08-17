package org.ford.Assignment5;

public class Driver {

    public static void main(String[] args) {

//        MathOperations math = new MathOperations();
//        math.add(5,4);
//        math.add(5.1,4.9);
//        int [] numbers_list ={1,2,3,4,5};
//        math.add(numbers_list);


//        Payment paymentMode = new CreditcardPayment();
//        paymentMode.processPayment(3000);
//        paymentMode=new UPIPayment();
//        paymentMode.processPayment(5000);

//

//        PhoneValidator phoneValidator = new PhoneValidator();
//        phoneValidator.isValid("");
//        System.out.println(DataValidator.isNotEmpty(""));

//        MP3Player mp3 = new MP3Player();
//        WAVPlayer wavPlayer = new WAVPlayer();
//        mp3.play("mp3 file");
//        mp3.stop();
//        wavPlayer.play("wav file");
//        wavPlayer.stop();

        TransactionProcessor tp = new TransactionProcessor();
        tp.process(101,5000);
        tp.process(102,202,5000);

        BankAccount bankAccount = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();

        bankAccount.calculateInterest();
        bankAccount2.calculateInterest();


        SecurityCheck.logAttempt("admin");
        




    }
}
