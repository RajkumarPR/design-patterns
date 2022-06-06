package com.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Component
public abstract class CatalogComponent {

    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("Cannot add item to catalog.");
    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("Cannot remove item from catalog.");
    }

    public String getName() {
        throw new UnsupportedOperationException("Cannot return name.");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("Cannot return price.");
    }

    public void print() {
        throw new UnsupportedOperationException("Cannot print.");
    }

}

// leaf
class Product extends CatalogComponent {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Product name: " + name + " Price: " + price);
    }
}

// Composite
class ProductCatalog extends CatalogComponent {

    private String name;
    private List<CatalogComponent> items = new ArrayList<>();

    public ProductCatalog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        items.forEach(CatalogComponent::print);
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

}