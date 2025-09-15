package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table( name = "employees")
public class Employee {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    private String employeeName;
    private String employeeEmail;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmployeeEmail() {
        return employeeEmail;
    }
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
    public Employee(String employeeName, String employeeEmail) {
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
    }
    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", employeeName=" + employeeName + ", employeeEmail=" + employeeEmail + "]";
    }
}
