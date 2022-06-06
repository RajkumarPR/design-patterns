package com.design.patterns.creational.prototype.withclone;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

    private List<String> empName;

    public Employee() {
        empName = new ArrayList<>();
    }

    public Employee(List<String> employees) {
        this.empName = employees;
    }

    //Let's say we had method which loads the data from the DB

    public void loadDataFromDB() {
        empName.add("Raj");
        empName.add("Saanvi");
        empName.add("Tanu");
        empName.add("Tanvi");
    }

    public List<String> getEmpName() {
        return empName;
    }

    // deep copy
    public Employee clone() {
        List<String> employeeClone = new ArrayList<>();
        for (String emp : this.getEmpName()) {
            employeeClone.add(emp);
        }
        return new Employee(employeeClone);
    }

    // shallow copy
    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/
}
