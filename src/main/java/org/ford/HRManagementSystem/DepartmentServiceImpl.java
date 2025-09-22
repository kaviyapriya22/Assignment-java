package com.abc.productapp.HRManagementSystem;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    @Transactional
    public Department getDepartmentById(Integer id) throws Exception {
        Department foundDepartment = departmentRepository.findById(id)
                .orElseThrow(()-> new Exception("Department not found"));
        foundDepartment.getEmployees().size();
        return foundDepartment;
    }
}
