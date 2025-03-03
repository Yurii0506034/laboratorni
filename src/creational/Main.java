package creational;

import creational.factoryMethod.Creator;
import creational.factoryMethod.Product;
import creational.factoryMethod.ConcreteProductA;
import creational.factoryMethod.ConcreteProductB;
import creational.singleton.Singleton;
import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.ConcreteFactoryA;
import creational.abstractFactory.ConcreteFactoryB;
import creational.builder.Car;
import creational.builder.CarBuilder;
import creational.builder.Director;
import creational.prototype.ConcretePrototype;
import creational.prototype.Prototype;

public class Main {
    public static void main(String[] args) {
        // Singleton pattern
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Factory Method pattern
        Creator creator = new ConcreteCreator(); // Використовуємо конкретного творця
        Product product = creator.createProduct(); // Створюємо продукт через фабричний метод
        product.doSomething(); // Виклик методу, який робить щось з продуктом

        // Abstract Factory pattern
        AbstractFactory factoryA = new ConcreteFactoryA(); // Використовуємо ConcreteFactoryA
        factoryA.createProduct().display(); // Виводимо продукт, створений фабрикою A

        AbstractFactory factoryB = new ConcreteFactoryB(); // Використовуємо ConcreteFactoryB
        factoryB.createProduct().display(); // Виводимо продукт, створений фабрикою B

        // Builder pattern
        CarBuilder carBuilder = new CarBuilder();
        Director director = new Director(carBuilder);
        Car car = director.construct(); // Викликаємо конструкцію автомобіля
        System.out.println(car); // Виводимо створений автомобіль

        // Prototype pattern
        Prototype prototype = new ConcretePrototype("Prototype 1"); // Створюємо прототип
        Prototype clonedPrototype = prototype.clone(); // Клонуємо прототип
        ((ConcretePrototype)clonedPrototype).display(); // Виводимо клонированний прототип
    }

    public static class ConcreteCreator extends Creator {
        @Override
        public Product createProduct() {
            return new ConcreteProductA(); // Повертаємо конкретний продукт
        }
    }
}
