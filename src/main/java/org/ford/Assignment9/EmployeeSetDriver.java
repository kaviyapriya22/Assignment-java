package org.ford.Assignment9;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSetDriver {

    public static void main(String[] args) {

        Employee emp1= new Employee(78,"Kaviya","GTT");
        Employee emp2= new Employee(69,"priya","GDIA");
        Employee emp3= new Employee(34,"Vimala","L&D");
        Employee emp4= new Employee(34,"Devi","HR");
        Employee emp5= new Employee(4,"Kayal","MP&L");
        Set <Employee> employeeSet = new HashSet<>();
        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);
        employeeSet.add(emp4);
        employeeSet.add(emp5);
        System.out.println("ADDED EMPLOYEE :");
        System.out.println(employeeSet);
        System.out.println();

        System.out.println("REMOVE EMPLOYEE by id :");
        Integer empId= 34;
        System.out.println("Removed the employee id "+empId+" ? "+employeeSet.remove(new Employee(34,"","")));
        System.out.println("After removing the employee: "+employeeSet);
        System.out.println();

        System.out.println("UPDATE EMPLOYEE DEPARTMENT :");
        Integer empID= 69;
        for (Employee emp : employeeSet) {
            if (emp.getId().equals(empID)) {
                emp.setDepartment("GTT");
            }
        }
        System.out.println("After updating the department: "+employeeSet);
        System.out.println();


        System.out.println("Searching for the emoloyee by id and department: ");
        System.out.println("Employee with id 69 is present or not ? "+employeeSet.contains(new Employee(69,"","")));
        System.out.println("Employee with department  GDIA is present or not ? "+employeeSet.contains(new Employee(0,"","GDIA")));
        System.out.println();

        System.out.println("SORTING EMPLOYEE BASED ON ID AND NAME");
        List<Employee> employeeList = new ArrayList<>(employeeSet);
        Collections.sort(employeeList);
        System.out.println("Employee sorted based on their ID: "+employeeList);
        Collections.sort(employeeList,new EmployeeNameComparator());
        System.out.println("Employee sorted based on their Name: "+employeeList);




    }

}
