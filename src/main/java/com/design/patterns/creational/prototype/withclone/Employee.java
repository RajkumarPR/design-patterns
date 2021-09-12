package com.design.patterns.creational.prototype.withclone;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

    private List<String> employees;

    public Employee() {
        employees = new ArrayList<>();
    }

    public Employee(List<String> employees) {
        this.employees = employees;
    }

    //Let's say we had method which loads the data from the DB

    public void loadDataFromDB() {
        employees.add("Raj");
        employees.add("Saanvi");
        employees.add("Tanu");
        employees.add("Tanvi");
    }

    public List<String> getEmployees() {
        return employees;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> employeeClone = new ArrayList<>();
        for (String emp : employees) {
            employeeClone.add(emp);
        }
        return new Employee(employeeClone);
    }
}
