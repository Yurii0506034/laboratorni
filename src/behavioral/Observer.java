package behavioral;

import java.util.ArrayList;
import java.util.List;

public interface Observer {
    void update(int value);
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(int value) {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }
}

class ConcreteObserver implements Observer {
    private int state;

    @Override
    public void update(int value) {
        state = value;
        System.out.println("State updated to: " + state);
    }
}

