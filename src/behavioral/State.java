package behavioral;

public interface State {
    void handle();
}

class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("Handling state A");
    }
}

class ConcreteStateB implements State {
    @Override
    public void handle() {
        System.out.println("Handling state B");
    }
}

class StateContext {
    private State state;

    public StateContext(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }
}
