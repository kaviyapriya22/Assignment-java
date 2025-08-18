package org.ford.Assignment8;
import java.util.List;
import java.util.ArrayList;

public class EmployeeDriver {

    public static void main(String[] args) {

        List <Employee> employeeLists = new ArrayList<>();

        // CREATE EMPLOYEE
        employeeLists.add(new Employee(20,"Kaviya","GTT",5000.0));
        employeeLists.add(new Employee(22,"Priya","ET",10000.0));
        employeeLists.add(new Employee(21,"Vimala","L&D",12000.0));

        System.out.println("Employee list after create operation: "+employeeLists);
        System.out.println("--------------------------");


        // UPDATE EMPLOYEE DEPARTMENT BASED ON ID
        String updatedDepartment = "GTT";
        for (Employee employee : employeeLists) {
            if (employee.getId()==22){
                employee.setDepartment(updatedDepartment);
                System.out.println("Employee department updated successfully");
            }

        }

        System.out.println("Employee list after update operation: "+employeeLists);

        System.out.println("-------------");

        //DELETE EMPLOYEE BASED ON ID

        for (Employee employee : employeeLists) {
            if (employee.getId()==22){
                employeeLists.remove(employee);
                System.out.println(" Employee deleted successfully");
            }
        }
        System.out.println("Employee list after remove operation: "+employeeLists);
        System.out.println("----------------");

        //SEARCH OPERATION USING ID
        Employee employeeTOSearch = new Employee(20,"Kaviya","GTT",5000.0);
        boolean foundEmployee = employeeLists.contains(employeeTOSearch);
        if (foundEmployee){
            System.out.println(employeeTOSearch);
            System.out.println("Employee found  at index : "+employeeLists.indexOf(employeeTOSearch));
        }
        else{
            System.out.println("Employee not found ");
        }

        System.out.println("--------------");

        //COMPARING EMPLOYEE BASED ON ID
        Employee emp1 = new  Employee(24,"Priya","ET",10000.0);
        Employee emp2 = new  Employee(24,"Vimala","L&D",12000.0);
        boolean isSame= emp1.equals(emp2);
        if (isSame){
            System.out.println(emp1);
            System.out.println(emp2);
            System.out.println("Both the employee are same ");
        }
        else{
            System.out.println("Employee not same ");
        }




    }
}
