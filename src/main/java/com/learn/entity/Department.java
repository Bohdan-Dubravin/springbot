package com.learn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long departmentId;
  private String departmentName;
  private String departmentAddress;

  public Long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(Long departmentId) {
    this.departmentId = departmentId;
  }

  public String getDepartmentName() {
    return departmentName;
  }


  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public String getDepartmentAddress() {
    return departmentAddress;
  }

  public void setDepartmentAddress(String departmentAddress) {
    this.departmentAddress = departmentAddress;
  }

  public Department( String departmentName, String departmentAddress) {
    this.departmentName = departmentName;
    this.departmentAddress = departmentAddress;
  }

  public Department() {
  }

  @Override
  public String toString() {
    return "Department{" +
            "departmentId=" + departmentId +
            ", departmentName='" + departmentName + '\'' +
            ", deparmentAddress='" + departmentAddress + '\'' +
            '}';
  }
}
