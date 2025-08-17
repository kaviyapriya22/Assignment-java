package org.ford.Assignment6.subpackage;
import org.ford.Assignment6.Patient;


public class Billing {

    public void displayBillingDetails (Patient patient){
        System.out.println("Patient name: "+patient.name);
        System.out.println("Patient hospital ID: "+patient.getHospitalID());
        System.out.println("Patient medical history: "+patient.getInsuranceDetails());
        System.out.println("Patient insurance details: "+patient.getMedical_history());

    }




}
