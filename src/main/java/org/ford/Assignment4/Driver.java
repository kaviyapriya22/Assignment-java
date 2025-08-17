package org.ford.Assignment4;

public class Driver {
    public static void main(String[] args) {

//        Car v1 = new Car("Ford","mustang");
//        Bike v2 = new Bike("TVS","Apache");
//
//        v1.service();
//        v1.repair();
//        v2.service();
//        v2.repair();


//        ProgrammingCourse c1 = new ProgrammingCourse("Java",4);
//        DesignCourse c2 = new DesignCourse("Graphics",4);
//
//        c1.enrollStudent("john");
//        c1.startCourse();
//        c1.generateCertificate("john");
//
//        c2.enrollStudent("Alice");
//        c2.startCourse();
//        c2.generateCertificate("Alice");

//

//        Pizza m1 = new Pizza("Margherita");
//        Burger m2 = new Burger("Veggie Burger");
//
//        m1.prepare();
//        m1.deliver(35);
//
//        m2.prepare();
//        m2.deliver(36);

        SmartLight d1 = new SmartLight("Smart Light");
        SmartAc d2 = new SmartAc("Smart AC");

        d1.turnOn();
        d1.controlByVoice("Turn on the lights");

        d2.turnOn();
        d2.controlByVoice("Turn on the AC");







    }
}
