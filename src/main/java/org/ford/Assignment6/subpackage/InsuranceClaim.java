package org.ford.Assignment6.subpackage;
import org.ford.Assignment6.Patient;

public class InsuranceClaim extends Patient {

    public InsuranceClaim(String medical_history,String hospitalID,String insuranceDetails,String name) {
        super(medical_history,hospitalID,insuranceDetails,name);
    }

    public void insuranceDetailsDisplay() {
        System.out.println(" Patient name: "+ super.name);
        System.out.println(" Insurance details: "+super.insuranceDetails);

    }


}
