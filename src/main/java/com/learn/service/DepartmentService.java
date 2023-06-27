package com.learn.service;

import com.learn.entity.Department;
import com.learn.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements DepartmentServiceI {
@Autowired
private DepartmentRepository departmentRepository;
  @Override
  public Department saveDepartment(Department department) {
    return departmentRepository.save(department);
  }

  @Override
  public List<Department> getAllDepartments() {
    return departmentRepository.findAll();
  }
}

