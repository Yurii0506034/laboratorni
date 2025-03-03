package behavioral;

public interface Visitor {
    void visit(ConcreteElementA element);  // Відвідування ConcreteElementA
    void visit(ConcreteElementB element);  // Відвідування ConcreteElementB
}
