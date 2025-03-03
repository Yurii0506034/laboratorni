package structural;

import java.util.HashMap;
import java.util.Map;

interface Flyweight {
    void operation();
}

class ConcreteFlyweight implements Flyweight {
    private int intrinsicState;

    public ConcreteFlyweight(int state) {
        this.intrinsicState = state;
    }

    @Override
    public void operation() {
        System.out.println("Flyweight operation with state " + intrinsicState);
    }
}

class FlyweightFactory {
    private Map<Integer, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(int state) {
        if (!flyweights.containsKey(state)) {
            flyweights.put(state, new ConcreteFlyweight(state));
        }
        return flyweights.get(state);
    }
}
