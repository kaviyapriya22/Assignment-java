package org.ford.Assignment7;

public class ATM {

   private  static final String PIN = "1234";

    public static void validatePINn( String pinEntered) throws InvalidPinException {
        if (pinEntered.length() != 4){
            throw new InvalidPinException("The length of the pin should be 4");
        }
        if (!pinEntered.equals(PIN)){
            throw new InvalidPinException("Incorrect PIN");
        }
    }


}
