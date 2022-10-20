package Homework04.Visitor;

public abstract class Element {
    protected String name;

    public abstract void accept(Visitor visitor);

    public String getName() {
        return this.name;
    }
}
