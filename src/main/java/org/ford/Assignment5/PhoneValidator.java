package org.ford.Assignment5;

public class PhoneValidator implements DataValidator {

    @Override
    public void isValid(String input) {
        if (input.length() < 1) {
            System.out.println("valid input");
        }
        else{
            System.out.println("invalid input");
        }
    }
}
