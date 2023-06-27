package com.learn.controller;

import com.learn.entity.Department;
import com.learn.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/department/{id}")
  public Department fetchDepartmentById(@PathVariable("id") Long id) {
    return this.departmentService.fetchDepartmentById(id);
  }

  @DeleteMapping ("/department/{id}")
  public String deleteDepartmentById(@PathVariable("id") Long id) {
    this.departmentService.deleteById(id);
    return "Department deleted";
  }


  @PutMapping ("/department/{id}")
  public Department updateDepartmentById(@PathVariable("id") Long id, @RequestBody Department department) {
   return this.departmentService.updateById(id, department);
  }
}
