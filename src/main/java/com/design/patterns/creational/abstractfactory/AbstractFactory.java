package com.design.patterns.creational.abstractfactory;


public interface AbstractFactory<T> {

    T create(String type);
}


