package behavioral;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(ConcreteElementA element) {
        // Що відбувається при відвідуванні ConcreteElementA
        System.out.println("Visiting ConcreteElementA");
    }

    @Override
    public void visit(ConcreteElementB element) {
        // Що відбувається при відвідуванні ConcreteElementB
        System.out.println("Visiting ConcreteElementB");
    }
}
