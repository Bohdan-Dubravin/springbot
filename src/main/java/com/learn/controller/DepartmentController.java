package com.learn.controller;

import com.learn.entity.Department;
import com.learn.service.DepartmentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

  private DepartmentService departmentService;
  @PostMapping("/departments")
  public Department saveDepartment (@RequestBody Department department) {
return this.departmentService.saveDepartment(department);
  }
}
