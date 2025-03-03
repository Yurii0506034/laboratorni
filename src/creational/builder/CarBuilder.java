package creational.builder;

public class CarBuilder {
    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    public CarBuilder buildEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    public CarBuilder buildWheels(String wheels) {
        car.setWheels(wheels);
        return this;
    }

    public CarBuilder buildBody(String body) {
        car.setBody(body);
        return this;
    }

    public Car build() {
        return car;
    }
}
