package creational.factoryMethod;

public class ConcreteProductA implements Product {
    @Override
    public void doSomething() {
        System.out.println("Product A created and doing something!");
    }
}
