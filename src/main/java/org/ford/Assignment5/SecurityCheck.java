package org.ford.Assignment5;

interface SecurityCheck {

    static  void  logAttempt(String user){
        System.out.println("Log attempt by the user "+ user);
    }

    default void showSecurityStatus(){
        System.out.println("Secure connection established");
    }

    abstract void verifyUser(String name,String password);
}
