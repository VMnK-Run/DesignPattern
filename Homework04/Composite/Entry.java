package Homework04.Composite;

public abstract class Entry {
    protected String name;
    public Entry(String name) {
        this.name = name;
    }
    public abstract void add(Entry entry);
    public abstract void send(String message);
    public abstract void receive(String message);
}
