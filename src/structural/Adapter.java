package structural;

interface Target {
    void request();
}

class Adaptee {
    void specificRequest() {
        System.out.println("Specific request.");
    }
}

class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
