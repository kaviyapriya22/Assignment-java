package org.ford.Assignment6;

public class HRPortal {

    public void displayCustomer() {
        Employee emp = new Employee(5000,"kk78","GTT");
        System.out.println("Employee ID default variable: "+emp.empID);
        System.out.println("Department pROTECTED VARIABLE: "+emp.department);

        emp.displaySalary();
    }
}
