package com.design.patterns.structural.composite;

public class ClientApplication {

    public static void main(String[] args) {

        DepartmentsComposite composite = new DepartmentsComposite(1, "Head Department");
        System.out.println("Head Dept name : "+composite.getName());

        composite.addDepartment(new FinanceDepartment(2, "Finance"));
        composite.addDepartment(new CSDepartment(3, "Computer Science"));
        composite.departmentName();


        // Employee directory example

        Developer dev1 = new Developer("Raj", 1, "Developer");
        Developer dev2 = new Developer("Shyam", 2, "Developer");

        EmployeeDirectory directory = new EmployeeDirectory();
        directory.addEmployee(dev1);
        directory.addEmployee(dev2);


        EmployeeDirectory mgrDirectory = new EmployeeDirectory();
        Manager mgr1 = new Manager("Hari", 3, "Senior Mgr");
        Manager mrg2 = new Manager("Siddarth", 2, "Manger");

        mgrDirectory.addEmployee(mgr1);
        mgrDirectory.addEmployee(mrg2);

        EmployeeDirectory companyDirectory = new EmployeeDirectory();
        companyDirectory.addEmployee(directory);
        companyDirectory.addEmployee(mgrDirectory);

        companyDirectory.showEmpDetails();
    }
}
