package behavioral;

import java.util.Map;

public interface Expression {
    int interpret(Map<String, Integer> context);
}

class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return context.get(name);
    }
}

class Sum implements Expression {
    private Expression left;
    private Expression right;

    public Sum(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) + right.interpret(context);
    }
}
