package com.design.patterns.abstractfactory;


public interface AbstractFactory<T> {

    T create(String type);
}


