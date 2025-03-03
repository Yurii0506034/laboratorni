package structural;

class SubsystemA {
    public void operationA() {
        System.out.println("Subsystem A operation.");
    }
}

class SubsystemB {
    public void operationB() {
        System.out.println("Subsystem B operation.");
    }
}

class Facade {
    private SubsystemA subsystemA = new SubsystemA();
    private SubsystemB subsystemB = new SubsystemB();

    public void operation() {
        subsystemA.operationA();
        subsystemB.operationB();
    }
}
