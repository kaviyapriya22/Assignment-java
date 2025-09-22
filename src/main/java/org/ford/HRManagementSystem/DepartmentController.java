package com.abc.productapp.HRManagementSystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/department")
public class DepartmentController {

    private DepartmentRepository departmentRepository;
    private EmployeeRepository employeeRepository;
    private DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, DepartmentService departmentService) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.departmentService = departmentService;
    }

    @PostMapping
    public Department addDepartment(@RequestBody Department department) {

        if (department.getEmployees() !=null){
            department.getEmployees().forEach(employee -> employee.setDepartment(department));
        }
        return departmentRepository.save(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Integer id) throws Exception{
        return departmentService.getDepartmentById(id);
    }

    @GetMapping("/all")
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public Department deleteDepartmentById(@PathVariable Integer id) throws Exception{
        Department foundDepartment = departmentRepository.findById(id).orElseThrow(()-> new Exception("Department not found"));
        departmentRepository.delete(foundDepartment);
        return foundDepartment;
    }
    @PostMapping("/{id}/employee")
    public Employee addEmployeeToDepartment(@PathVariable Integer id, @RequestBody Employee employee) throws Exception{
        Department foundDepartment = departmentRepository.findById(id).orElseThrow(()-> new Exception("Department not found"));
        foundDepartment.addEmployee(employee);
       return employeeRepository.save(employee);
    }


}
