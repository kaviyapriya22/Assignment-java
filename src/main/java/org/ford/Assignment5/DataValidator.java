package org.ford.Assignment5;

interface DataValidator {

    static boolean isNotEmpty(String input){
        return input != null ;
    };

    abstract void isValid(String input);

}
