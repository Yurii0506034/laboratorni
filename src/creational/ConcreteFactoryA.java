package creational.abstractFactory;

public class ConcreteFactoryA implements AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        return new ConcreteProductA(); // Переконайтеся, що створюється новий об'єкт ConcreteProductA
    }
}
