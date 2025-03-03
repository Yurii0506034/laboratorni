package behavioral;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}

class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("A".equals(request)) {
            System.out.println("Handler A is processing request " + request);
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}

class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("B".equals(request)) {
            System.out.println("Handler B is processing request " + request);
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
