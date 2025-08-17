package org.ford.Assignment4;

public class DesignCourse extends Course  implements CertificateProvider{

    public DesignCourse(String name, int duration) {
        super(name, duration);
    }

    @Override
    public void enrollStudent(String name) {
        System.out.println("Enrolling " + name+ "in"+ " "+super.getCourseName()+" design course");
    }

    @Override
    public void startCourse(){
        System.out.println("Starting "+super.getCourseName()+" design course");
    }

    @Override
    public void generateCertificate(String name) {
        System.out.println("Certificate Generated for  " + name+ "in"+ " "+super.getCourseName()+" design course");

    }
}
