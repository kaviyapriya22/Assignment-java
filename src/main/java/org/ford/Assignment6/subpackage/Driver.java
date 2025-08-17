package org.ford.Assignment6.subpackage;
import org.ford.Assignment6.Patient;


public class Driver {
    public static void main(String[] args) {
        PayrolllService payrolllService = new PayrolllService();
        payrolllService.displayEmployee();

        Patient patient = new Patient("Cholestrol for 2 years","P001","Insurance premium package","Krishna");

        Billing billing = new Billing();
        billing.displayBillingDetails(patient);


    }
}
