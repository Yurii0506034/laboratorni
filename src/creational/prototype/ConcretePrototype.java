package creational.prototype;

public class ConcretePrototype extends Prototype {
    private String value;

    public ConcretePrototype(String value) {
        this.value = value;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(value);
    }

    public void display() {
        System.out.println("Prototype value: " + value);
    }
}
