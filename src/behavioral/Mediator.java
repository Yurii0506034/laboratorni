package behavioral;

public interface Mediator {
    void sendMessage(String message, Colleague colleague);
}

class ConcreteMediator implements Mediator {
    private Colleague colleagueA;
    private Colleague colleagueB;

    public void setColleagueA(Colleague colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(Colleague colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.receiveMessage(message);
        } else {
            colleagueA.receiveMessage(message);
        }
    }
}

abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);

    public abstract void send(String message);

    public abstract void receive(String message);
}

class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {

    }

    @Override
    public void receiveMessage(String message) {

    }

    @Override
    public void send(String message) {
        System.out.println("Colleague A sending: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague A received: " + message);
    }
}

class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {

    }

    @Override
    public void receiveMessage(String message) {

    }

    @Override
    public void send(String message) {
        System.out.println("Colleague B sending: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague B received: " + message);
    }
}
