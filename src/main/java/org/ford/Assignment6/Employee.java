package org.ford.Assignment6;

public class Employee {

    private double salary;
    String empID;
    protected String department;

    public Employee(double salary, String empID, String department) {
        this.salary = salary;
        this.empID = empID;
        this.department = department;
    }

    public void displaySalary() {
        System.out.println(" salary is a private variable , displaying through get salary function: "+ this.salary);;
    }


}
