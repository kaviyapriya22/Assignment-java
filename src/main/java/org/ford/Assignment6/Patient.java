package org.ford.Assignment6;

public class Patient {

    private String medical_history;
    String hospitalID;
    protected String insuranceDetails;
    public String name;

    public Patient(String medical_history, String hospitalID, String insuranceDetails, String name){
        this.medical_history = medical_history;
        this.hospitalID = hospitalID;
        this.insuranceDetails = insuranceDetails;
        this.name = name;
    }



    public String getHospitalID() {
        return hospitalID;
    }

    public String getInsuranceDetails() {
        return insuranceDetails;
    }

    public String getName() {
        return name;
    }

    public String getMedical_history() {
        return medical_history;
    }
}
