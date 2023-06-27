package com.learn.controller;

import com.learn.entity.Department;
import com.learn.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
public class DepartmentController {
@Autowired
  private DepartmentService departmentService;
  @PostMapping("/department")
  public Department saveDepartment (@RequestBody Department department) {
return this.departmentService.saveDepartment(department);
  }

  @GetMapping("/department")
  public List<Department> fetchDepartmentList() {
    return this.departmentService.getAllDepartments();
  }
}
