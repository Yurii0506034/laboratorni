package structural;

public class Main {
    public static void main(String[] args) {
        // 1. Adapter Pattern
        System.out.println("1. Adapter Pattern:");
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        adapter.request();  // Output: Specific request.

        // 2. Bridge Pattern
        System.out.println("\n2. Bridge Pattern:");
        ConcreteImplementorA implA = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implA);
        abstraction.operation();  // Output: Refined abstraction: Operation in ConcreteImplementorA.

        // 3. Composite Pattern
        System.out.println("\n3. Composite Pattern:");
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Composite composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);
        composite.operation();  // Output: Leaf operation. Leaf operation.

        // 4. Decorator Pattern
        System.out.println("\n4. Decorator Pattern:");
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecorator decorator = new ConcreteDecorator(component); // Передаємо component як аргумент конструктора
        decorator.operation();  // Output: Additional behavior before operation. Concrete operation. Additional behavior after operation.

        // 5. Facade Pattern
        System.out.println("\n5. Facade Pattern:");
        Facade facade = new Facade();
        facade.operation();  // Output: Subsystem A operation. Subsystem B operation.

        // 6. Flyweight Pattern
        System.out.println("\n6. Flyweight Pattern:");
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight(1);
        Flyweight flyweight2 = factory.getFlyweight(1);
        flyweight1.operation();  // Output: Flyweight operation with state 1
        flyweight2.operation();  // Output: Flyweight operation with state 1

        // 7. Proxy Pattern
        System.out.println("\n7. Proxy Pattern:");
        Proxy proxy = new Proxy();
        proxy.request();  // Output: Proxy before request. RealSubject request. Proxy after request.
    }
}
