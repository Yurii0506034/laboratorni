package creational.factoryMethod;

public class ConcreteProductB implements Product {
    @Override
    public void doSomething() {
        System.out.println("Product B created and doing something!");
    }
}
