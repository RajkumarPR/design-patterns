package com.design.patterns.creational.abstractfactory;
import com.design.patterns.creational.abstractfactory.animal.Animal;
import com.design.patterns.creational.abstractfactory.color.IColor;

public class TestAbstractFactory {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = FactoryProvider.getFactory("Animal");
        Animal dog = (Animal) abstractFactory.create("dog");
        Animal duck = (Animal) abstractFactory.create("duck");
        System.out.println(dog.getType());
        System.out.println(duck.getType());
        System.out.println(duck.makeSound());


        abstractFactory = FactoryProvider.getFactory("color");
        IColor color = (IColor) abstractFactory.create("red");
        System.out.println(color.colorType());
    }
}
