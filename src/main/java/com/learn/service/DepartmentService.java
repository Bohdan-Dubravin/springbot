package com.learn.service;

import com.learn.entity.Department;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {


  public Department saveDepartment(Department department) {
    return  new Department();
  }
}
