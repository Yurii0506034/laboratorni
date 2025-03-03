package creational.builder;

public class Director {
    private CarBuilder builder;

    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    public Car construct() {
        return builder.buildEngine("V8").buildWheels("Alloy").buildBody("Sedan").build();
    }
}
