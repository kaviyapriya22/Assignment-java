package com.abc.productapp.HRManagementSystem;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Department {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String location;

    @OneToMany(mappedBy ="department" ,fetch = FetchType.LAZY, cascade= CascadeType.ALL)
    @JsonManagedReference
    private List<Employee> employees = new ArrayList<>();

    public Department() {
    }

    public Department(String name, String location, List<Employee> employees) {
        this.name = name;
        this.location = location;
        this.employees = employees;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
        employee.setDepartment(this);
    }
    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
        employee.setDepartment(null);
    }
}
