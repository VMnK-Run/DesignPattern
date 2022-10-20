package Homework05.Mediator;

public abstract class SubSystem {
    protected Mediator mediator;
    protected String name;

    public SubSystem(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        this.mediator.addSubSystem(this);
    }
    public String getName() {
        return this.name;
    }

    public void send(String message) {
        this.mediator.send(this, message);
    }
    public abstract void receive(SubSystem subSystem, String message);
}
