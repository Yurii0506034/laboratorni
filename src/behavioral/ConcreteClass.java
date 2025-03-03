package behavioral;

public class ConcreteClass extends AbstractClass {
    @Override
    protected void step1() {
        System.out.println("ConcreteClass Step 1");
    }

    @Override
    protected void step2() {
        System.out.println("ConcreteClass Step 2");
    }
}
