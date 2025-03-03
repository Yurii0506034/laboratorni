package creational.abstractFactory;

public class ConcreteFactoryB implements AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        return new ConcreteProductB(); // Переконайтеся, що створюється новий об'єкт ConcreteProductB
    }
}
