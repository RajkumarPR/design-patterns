package com.design.patterns.structural.composite;

public class ClientApplication {

    public static void main(String[] args) {

        DepartmentsComposite composite = new DepartmentsComposite(1, "Head Department");
        System.out.println("Head Dept name : " + composite.getName());

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


        // Product catalog example

        // Create primary products for main catalog
        CatalogComponent mJeanProduct = new Product("M: Jeans 32", 65.00);
        CatalogComponent mTShirtProduct = new Product("M: T Shirt 38", 45.00);

        // Create a composite product catalog and add female products to it
        CatalogComponent femaleCatalog = new ProductCatalog("Female Products");

        CatalogComponent fJeans = new Product("F: Jeans 32", 65.00);
        CatalogComponent fTShirts = new Product("F: T Shirt 38", 45.00);
        femaleCatalog.add(fJeans);
        femaleCatalog.add(fTShirts);

        // Create a composite product catalog and add kid products to it
        CatalogComponent kidCatalog = new ProductCatalog("Kids Products");

        CatalogComponent kidShorts = new Product("Return Gift", 23.00);
        CatalogComponent kidPlayGears = new Product("Summer Play Gear", 65.00);
        kidCatalog.add(kidShorts);
        kidCatalog.add(kidPlayGears);

        //Create primary catalog and add primary products and new catalogs to it
        CatalogComponent mainCatalog = new ProductCatalog("Primary Catalog");

        mainCatalog.add(mJeanProduct);
        mainCatalog.add(mTShirtProduct);
        mainCatalog.add(femaleCatalog);
        mainCatalog.add(kidCatalog);

        // Print out product/catalog information
        mainCatalog.print();
    }
}
