package structural;

interface Implementor {
    void operation();
}

class ConcreteImplementorA implements Implementor {
    @Override
    public void operation() {
        System.out.println("Operation in ConcreteImplementorA.");
    }
}

abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}

class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.print("Refined abstraction: ");
        implementor.operation();
    }
}
