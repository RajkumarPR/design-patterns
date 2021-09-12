package com.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

//Component
interface Employee {

    void showEmpDetails();
}

// leaf
class Developer implements Employee {

    private String name;
    private long empId;
    private String position;

    public Developer(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmpDetails() {
        System.out.println(empId+" "+name+" "+position);
    }
}

class Manager implements Employee {
    private String name;
    private long empId;
    private String position;

    public Manager(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmpDetails() {
        System.out.println(empId+" "+name+" "+position);
    }
}

// composite
public class EmployeeDirectory implements Employee {

    private List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    void  addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    @Override
    public void showEmpDetails() {
        employees.forEach(Employee::showEmpDetails);
    }


}
