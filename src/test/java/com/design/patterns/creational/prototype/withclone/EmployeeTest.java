package com.design.patterns.creational.prototype.withclone;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class EmployeeTest {


    @Test
    public void addEmployeeNameToClonedObject() throws CloneNotSupportedException {

        Employee employee = new Employee();
        // As we know fetching data from db is costly and resource consuming
        employee.loadDataFromDB();

        // now we have loaded employee Object
        // We just need to clone this object and do whatever we want
        Employee clonedEmployee = (Employee) employee.clone();
        List<String> clonedEmployeeList = clonedEmployee.getEmployees();
        clonedEmployeeList.add("Shyam");

        System.out.println("Actual : "+employee.getEmployees());
        System.out.println("Cloned : "+ clonedEmployeeList);

        assertArrayEquals(clonedEmployee.getEmployees().stream().toArray(String[]::new), clonedEmployeeList.toArray());
    }

}