package com.learn.service;

import com.learn.entity.Department;

import java.util.List;

public interface DepartmentServiceI {


  public Department saveDepartment(Department department);

  List<Department> getAllDepartments();
}
