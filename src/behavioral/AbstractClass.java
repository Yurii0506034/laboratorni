package behavioral;

public abstract class AbstractClass {
    public void templateMethod() {
        step1();
        step2();
    }

    protected abstract void step1();
    protected abstract void step2();
}

class ConcreteClassA extends AbstractClass {
    @Override
    protected void step1() {
        System.out.println("ConcreteClassA Step 1");
    }

    @Override
    protected void step2() {
        System.out.println("ConcreteClassA Step 2");
    }
}

class ConcreteClassB extends AbstractClass {
    @Override
    protected void step1() {
        System.out.println("ConcreteClassB Step 1");
    }

    @Override
    protected void step2() {
        System.out.println("ConcreteClassB Step 2");
    }
}
