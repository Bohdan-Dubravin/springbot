package com.learn.service;

import com.learn.entity.Department;
import com.learn.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentService implements DepartmentServiceI {
  @Autowired
  private DepartmentRepository departmentRepository;

  @Override
  public Department saveDepartment(Department department) {
    return this.departmentRepository.save(department);
  }

  @Override
  public List<Department> getAllDepartments() {
    return this.departmentRepository.findAll();
  }

  @Override
  public Department fetchDepartmentById(Long id) {
    return this.departmentRepository.findById(id).get();
  }

  @Override
  public void deleteById(Long id) {
    this.departmentRepository.deleteById(id);
  }

  @Override
  public Department updateById(Long id, Department department) {
    Department dep = this.departmentRepository.findById(id).get();

    if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
      dep.setDepartmentName(department.getDepartmentName());
    }

    if (Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
      dep.setDepartmentAddress(department.getDepartmentName());
    }

    return this.departmentRepository.save(dep);
  }
}

