package com.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Component
abstract class Department {
    protected abstract void departmentName();
}

// leaf
class FinanceDepartment extends Department {

    private Integer id;
    private String name;

    public FinanceDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected void departmentName() {
        System.out.println(this.name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// ComputerScience department
class CSDepartment extends Department {
    private Integer id;
    private String name;

    @Override
    public void departmentName() {
        System.out.println(name);
    }

    public CSDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}

// composite
public class DepartmentsComposite extends Department {

    private Integer id;
    private String name;
    private List<Department> departmentList;

    public DepartmentsComposite(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.departmentList = new ArrayList<>();
    }

    @Override
    protected void departmentName() {
        departmentList.forEach(Department::departmentName);
    }

    public void addDepartment(Department department) {
        departmentList.add(department);
    }

    public void removeDepartment(Department department) {
        departmentList.remove(department);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

