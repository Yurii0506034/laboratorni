package behavioral;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Ланцюг обов'язків (Chain of Responsibility)
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNext(handlerB);
        handlerA.handleRequest("A");
        handlerA.handleRequest("B");
        handlerA.handleRequest("C");

        // Команда (Command)
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.invoke();

        // Інтерпретатор (Interpreter)
        Map<String, Integer> context = Map.of("x", 10, "y", 5);
        Expression x = new Variable("x");
        Expression y = new Variable("y");
        Expression sum = new Sum(x, y);
        System.out.println("Sum: " + sum.interpret(context));

        // Ітератор (Iterator)
        List<Integer> data = List.of(1, 2, 3, 4, 5);
        Iterator<Integer> iter = new ConcreteIterator<>(data);
        while (iter.hasNext()) {
            System.out.println("Next: " + iter.next());
        }

        // Посередник (Mediator)
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);
        colleagueA.send("Hello from A!");
        colleagueB.send("Hello from B!");

        // Знімок (Memento)
        Originator originator = new Originator();
        originator.setState("State1");
        originator.showState();
        Memento memento = originator.saveState();
        originator.setState("State2");
        originator.showState();
        originator.restoreState(memento);
        originator.showState();

        // Спостерігач (Observer)
        Subject subject = new Subject();
        ConcreteObserver observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.notifyObservers(42);

        // Стан (State)
        Context contextState = new Context(new ConcreteStateA());
        contextState.request(); // Виконуємо дію в поточному стані
        contextState.setState(new ConcreteStateB()); // Змінюємо стан
        contextState.request(); // Виконуємо дію в новому стані

        // Стратегія (Strategy)
        Context strategyContext = new Context(new ConcreteStrategyA());
        strategyContext.executeStrategy();
        strategyContext.setStrategy(new ConcreteStrategyB());
        strategyContext.executeStrategy();

        // Шаблонний метод (Template Method)
        AbstractClass template = new ConcreteClass();
        template.templateMethod();

        // Відвідувач (Visitor)
        ConcreteElementA elementA = new ConcreteElementA();
        ConcreteElementB elementB = new ConcreteElementB();
        ConcreteVisitor visitor = new ConcreteVisitor();
        elementA.accept(visitor);
        elementB.accept(visitor);
    }
}
