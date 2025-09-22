package com.abc.productapp.HRManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private DepartmentRepository departmentRepository;
    private EmployeeRepository employeeRepository;
    private DepartmentService departmentService;

    @Autowired
    public EmployeeController(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, DepartmentService departmentService) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.departmentService = departmentService;
    }

    @PostMapping
    public Employee addEmployee(@RequestParam Integer departmentId,@RequestBody Employee employee) throws Exception{
        Department department = departmentRepository.findById(departmentId)
                .orElseThrow(() -> new Exception("Department not found with id: " + departmentId));
        department.addEmployee(employee);
        return employeeRepository.save(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id) throws Exception {
        return employeeRepository.findById(id).orElseThrow(()-> new Exception("Employee not found"));

    }

    @DeleteMapping("/{id}")
    public Employee deleteEmployee(@PathVariable Integer id) throws Exception {
        Employee emp = employeeRepository.findById(id)
                .orElseThrow(() -> new Exception("Employee not found"));
        if (emp.getDepartment() != null) {
            emp.getDepartment().getEmployees().remove(emp);
        }
        employeeRepository.delete(emp);
        return emp;
    }


}

